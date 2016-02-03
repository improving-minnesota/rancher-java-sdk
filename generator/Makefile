.PHONY clean deps

clean:
    go clean -i ./...
    rm -rf ../src/main/java/io/rancher/type
    rm -rf ../src/main/java/io/rancher/service

deps:
    go get -t ./...

build:
    go build ./...