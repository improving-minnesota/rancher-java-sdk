.PHONY: clean deps

clean:
	go clean -i ./...
	rm -rf ../src/main/groovy/io/rancher/type
	rm -rf ../src/main/groovy/io/rancher/service

deps:
	go get -t ./...

build:
	go build ./...
