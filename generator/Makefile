#.PHONY: clean deps

all: clean generate

clean:
	go clean -i ./...
	rm -rf ../src/main/java/io/rancher/type
	rm -rf ../src/main/java/io/rancher/service

deps:
	go get -t ./...

generator: generator.go
	go build ./...

generate: generator
	./generator
