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
	SOURCE_OUTPUT_DIR = "../src/main/java/io/rancher"
)

var TYPE_SOURCE_OUTPUT_DIR = path.Join(SOURCE_OUTPUT_DIR, "type")

var (
	blackListTypes    map[string]bool
	noConversionTypes map[string]bool
	underscoreRegexp  *regexp.Regexp = regexp.MustCompile(`([a-z])([A-Z])`)
	schemaExists      map[string]bool
)

type metadata struct {
	ImportTypes []string
}

func (m metadata) importType(importType string) {
	m.ImportTypes = append(m.ImportTypes, importType)
}

func init() {
	blackListTypes = make(map[string]bool)
	blackListTypes["schema"] = true
	blackListTypes["resource"] = true
	blackListTypes["collection"] = true

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
		ImportTypes: []string{},
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
			meta.importType("java.util.List")
		} else if strings.HasPrefix(field.Type, "array") {
			meta.importType("java.util.List")
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
				result[fieldName] = "List<Integer>"
			case "array[float64]":
				result[fieldName] = "List<Float>"
			default:
				result[fieldName] = "List<Object>"
			}
		} else if strings.HasPrefix(field.Type, "map") {
			meta.importType("java.util.Map")
			result[fieldName] = "Map<String, Object>"
		} else if strings.HasPrefix(field.Type, "json") {
			result[fieldName] = "Object"
		} else if strings.HasPrefix(field.Type, "boolean") {
			result[fieldName] = "Boolean"
		} else if strings.HasPrefix(field.Type, "extensionPoint") {
			result[fieldName] = "Object"
		} else if strings.HasPrefix(field.Type, "float") {
			result[fieldName] = "Float"
		} else if strings.HasPrefix(field.Type, "int") {
			result[fieldName] = "Integer"
		} else {
			result[fieldName] = capitalize(field.Type)
		}
	}

	return result, meta
}

func getResourceActions(schema client.Schema) map[string]client.Action {
	result := map[string]client.Action{}
	for name, action := range schema.ResourceActions {
		if _, ok := schemaExists[action.Output]; ok {
			result[name] = action
		}
	}
	return result
}

func generateType(schema client.Schema) error {
	output, err := os.Create(path.Join(TYPE_SOURCE_OUTPUT_DIR, capitalize(schema.Id)+".java"))

	if err != nil {
		return err
	}

	defer output.Close()

	typeMap, metadata := getTypeMap(schema)
	data := map[string]interface{}{
		"schema":          schema,
		"class":           capitalize(schema.Id),
		"collection":      capitalize(schema.Id) + "Collection",
		"structFields":    typeMap,
		"resourceActions": getResourceActions(schema),
		"meta":            metadata,
	}

	funcMap := template.FuncMap{
		"toCamelCase":       ToLowerCamelCase,
		"toLowerUnderscore": addUnderscore,
		"capitalize":        capitalize,
		"upper":             strings.ToUpper,
	}

	typeTemplate, err := template.New("type.template").Funcs(funcMap).ParseFiles("type.template")
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

//func generateClient(schema []client.Schema) error {
//	template, err := template.ParseFiles("client.template")
//	if err != nil {
//		return err
//	}
//
//	output, err := os.Create(path.Join(CLIENT_OUTPUT_DIR, "generated_client.go"))
//	if err != nil {
//		return err
//	}
//
//	defer output.Close()
//	buffer := make([]client.Schema, 0, len(schema))
//	for _, val := range schema {
//		if !(val.Id == "collection" || val.Id == "resource" || val.Id == "schema") {
//			val.Id = strings.ToUpper(val.Id[:1]) + val.Id[1:]
//			buffer = append(buffer, val)
//		}
//	}
//
//	result := map[string]interface{}{
//		"schemas": buffer,
//	}
//
//	err = template.Execute(output, result)
//	return err
//}

func setupDirectory(dir string) error {
	if _, err := os.Stat(dir); os.IsNotExist(err) {
		return os.MkdirAll(dir, 0755)
	}

	return nil
}

func generateFiles() error {
	err := setupDirectory(TYPE_SOURCE_OUTPUT_DIR)
	if err != nil {
		return err
	}

	if err != nil {
		return err
	}

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
	}

	//	return generateClient(schemas.Data)
	return nil
}

func main() {
	err := generateFiles()
	if err != nil {
		log.Fatal(err)
		os.Exit(1)
	}
}
