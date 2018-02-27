package main

import (
	"encoding/json"
	"io/ioutil"
	"log"
	"os"
	"path"
	"regexp"
	"strings"
	"text/template"

	"github.com/rancher/go-rancher/client"
)

const (
	SOURCE_OUTPUT_DIR = "../src/main/groovy/io/rancher"
)

var TYPE_SOURCE_OUTPUT_DIR = path.Join(SOURCE_OUTPUT_DIR, "type")
var SERVICE_SOURCE_OUTPUT_DIR = path.Join(SOURCE_OUTPUT_DIR, "service")

var (
	blackListTypes    map[string]bool
	blackListActions  map[string]bool
	noConversionTypes map[string]bool
	underscoreRegexp  *regexp.Regexp = regexp.MustCompile(`([a-z])([A-Z])`)
	schemaExists      map[string]bool
)

type metadata struct {
	importTypes       map[string]bool
	actionImportTypes map[string]bool
}

func (m *metadata) importActionClass(class string) {
	m.actionImportTypes[class] = true
}

func (m *metadata) importClass(class string) {
	m.importTypes[class] = true
}

func (m metadata) ListImports() []string {
	imports := make([]string, len(m.importTypes))
	i := 0
	for k := range m.importTypes {
		imports[i] = k
		i++
	}
	return imports
}

func (m metadata) ListActionImports() []string {
	imports := make([]string, len(m.actionImportTypes))
	i := 0
	for k := range m.actionImportTypes {
		imports[i] = k
		i++
	}
	return imports
}

func (m metadata) ListClassImports() []string {
	imports := make([]string, len(m.importTypes))
	i := 0
	for k := range m.importTypes {
		imports[i] = k
		i++
	}
	return imports
}

func init() {
	blackListTypes = make(map[string]bool)
	blackListTypes["schema"] = true
	blackListTypes["resource"] = true
	blackListTypes["collection"] = true

	blackListActions = make(map[string]bool)
	blackListActions["create"] = true
	blackListActions["update"] = true

	noConversionTypes = make(map[string]bool)
	noConversionTypes["string"] = true

	schemaExists = make(map[string]bool)
}

func capitalize(s string) string {
	if len(s) <= 1 {
		return strings.ToUpper(s)
	}

	return strings.ToUpper(s[:1]) + s[1:]
}

func getTypeMap(schema client.Schema) (map[string]string, metadata) {
	meta := metadata{
		importTypes:       map[string]bool{},
		actionImportTypes: map[string]bool{},
	}
	result := map[string]string{}
	for name, field := range schema.ResourceFields {
		if name == "id" {
			continue
		}

		fieldName := capitalize(name)

		if strings.HasPrefix(field.Type, "reference") || strings.HasPrefix(field.Type, "date") || strings.HasPrefix(field.Type, "enum") {
			result[fieldName] = "String"
		} else if strings.HasPrefix(field.Type, "array[reference[") {
			result[fieldName] = "List<String>"
		} else if strings.HasPrefix(field.Type, "array") {
			switch field.Type {
			case "array[reference]":
				fallthrough
			case "array[date]":
				fallthrough
			case "array[enum]":
				fallthrough
			case "array[string]":
				result[fieldName] = "List<String>"
			case "array[int]":
				result[fieldName] = "List<BigInteger>"
			case "array[float64]":
				result[fieldName] = "List<Float>"
			case "array[json]":
				result[fieldName] = "List<Map<String, Object>>"
			default:
				fieldType := strings.TrimPrefix(field.Type, "array[")
				fieldType = strings.TrimSuffix(fieldType, "]")
				class := strings.TrimSuffix(capitalize(fieldType), "s")
				result[fieldName] = "List<" + class + ">"
			}
		} else if strings.HasPrefix(field.Type, "map") {
			result[fieldName] = "Map<String, Object>"
		} else if strings.HasPrefix(field.Type, "json") {
			result[fieldName] = "Map<String, Object>"
		} else if strings.HasPrefix(field.Type, "boolean") {
			result[fieldName] = "Boolean"
		} else if strings.HasPrefix(field.Type, "extensionPoint") {
			result[fieldName] = "Object"
		} else if strings.HasPrefix(field.Type, "float") {
			result[fieldName] = "Float"
		} else if strings.HasPrefix(field.Type, "int") {
			result[fieldName] = "BigInteger"
		} else {
			result[fieldName] = capitalize(field.Type)
		}
	}

	return result, meta
}

func getResourceActions(schema client.Schema, m metadata) map[string]client.Action {
	result := map[string]client.Action{}
	for name, action := range schema.ResourceActions {
		if _, ok := schemaExists[action.Output]; ok {
			if _, ok2 := blackListActions[name]; ok2 {
				continue
			}
			class := capitalize(schema.Id)
			if action.Input != "" && capitalize(action.Input) != class {
				m.importActionClass("io.rancher.type." + capitalize(action.Input))
			}
			if capitalize(action.Output) != class {
				m.importActionClass("io.rancher.type." + capitalize(action.Output))
			}
			result[name] = action
		}
	}
	return result
}

func makeSubResources(schema client.Schema, metadata metadata) (map[string]interface{}) {
  result := make(map[string]interface{})

  if schema.Id == "project" {
    schemaBytes, err := ioutil.ReadFile("subresources.json")
    if (err != nil) {

    }

    var schemas client.Schemas

    err = json.Unmarshal(schemaBytes, &schemas)
    if err != nil {

    }

    for _, sch := range schemas.Data {
      if _, ok := blackListTypes[sch.Id]; ok || sch.Id == "project" {
        continue
      }
      metadata.importClass("io.rancher.type." + capitalize(sch.Id))

      result[sch.Id] = map[string]interface{} {
        "schema":             sch,
        "class":              capitalize(sch.Id),
        "collection":         capitalize(sch.Id) + "Collection",
        "plural":             capitalize(sch.PluralName),
        "resourceActions":    getResourceActions(sch, metadata),
        "type":               sch.Id,
        "meta":               metadata,
        "resourceMethods":    sch.ResourceMethods,
        "collectionMethods":  sch.CollectionMethods,
      }
    }
  }

  return result
}

func generateType(schema client.Schema) error {
	return generateTemplate(schema, path.Join(TYPE_SOURCE_OUTPUT_DIR, capitalize(schema.Id)+".groovy"), "type.template")
}

func generateService(schema client.Schema) error {
	return generateTemplate(schema, path.Join(SERVICE_SOURCE_OUTPUT_DIR, capitalize(schema.Id)+"Api.groovy"), "service.template")
}

func generateTemplate(schema client.Schema, outputPath string, templateName string) error {
	err := setupDirectory(path.Dir(outputPath))
	if err != nil {
		return err
	}

	output, err := os.Create(outputPath)

	if err != nil {
		return err
	}

	defer output.Close()

	typeMap, metadata := getTypeMap(schema)
  subResources := makeSubResources(schema, metadata)
	data := map[string]interface{}{
		"schema":             schema,
		"class":              capitalize(schema.Id),
		"collection":         capitalize(schema.Id) + "Collection",
		"structFields":       typeMap,
		"resourceActions":    getResourceActions(schema, metadata),
		"type":               schema.Id,
		"meta":               metadata,
		"resourceMethods":    schema.ResourceMethods,
		"collectionMethods":  schema.CollectionMethods,
		"subResources":       subResources,
	}

	funcMap := template.FuncMap{
		"toCamelCase":       ToLowerCamelCase,
		"toLowerUnderscore": addUnderscore,
		"capitalize":        capitalize,
		"upper":             strings.ToUpper,
	}

	typeTemplate, err := template.New(templateName).Funcs(funcMap).ParseFiles(templateName)
	if err != nil {
		return err
	}

	return typeTemplate.Execute(output, data)
}

func ToLowerCamelCase(input string) string {
	return (strings.ToLower(input[:1]) + input[1:])
}

func addUnderscore(input string) string {
	return strings.ToLower(underscoreRegexp.ReplaceAllString(input, `${1}_${2}`))
}

func setupDirectory(dir string) error {
	if _, err := os.Stat(dir); os.IsNotExist(err) {
		return os.MkdirAll(dir, 0755)
	}

	return nil
}

func generateFiles() error {
	schemaBytes, err := ioutil.ReadFile("schemas.json")
	if err != nil {
		return err
	}

	var schemas client.Schemas

	err = json.Unmarshal(schemaBytes, &schemas)
	if err != nil {
		return err
	}

	for _, schema := range schemas.Data {
		if _, ok := blackListTypes[schema.Id]; ok {
			continue
		}

		schemaExists[schema.Id] = true
	}

	for _, schema := range schemas.Data {
		if _, ok := blackListTypes[schema.Id]; ok {
			continue
		}

		err = generateType(schema)
		if err != nil {
			return err
		}
		err = generateService(schema)
		if err != nil {
			return err
		}
	}

	return nil
}

func main() {
	err := generateFiles()
	if err != nil {
		log.Fatal(err)
		os.Exit(1)
	}
}
