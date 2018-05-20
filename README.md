# Rancher Groovy SDK

This project is an auto-generated Groovy client for [Rancher](rancher.com)

This project uses Golang templates and a Rancher API schema file to generate models and services.  It was originally 
derived from the [Go-Rancher](https://github.com/rancher/go-rancher) library.
 
APIs for this project are accessed using Square's [Retrofit2](http://square.github.io/retrofit/) library.

## Client Configuration

The entrypoint for this library is the `io.rancher.Rancher` class.  To configure this client, API secret and access keys
need to be generated for your user in a Rancher installation.

The `io.rancher.Rancher` client is initialized with and `io.rancher.Rancher.Config` configuration object
```groovy
def config = new Rancher.Config(
  new URL('https://rancher.mydomain.com'), 
  'MyAPIAccessKey', 
  'MyAPISecretKey'
)
def rancher = new Rancher(config)
```

From here, you can create an API service and perform operations on a resource.
```groovy
import io.rancher.service.ServiceApi

def services = rancher.type ServiceApi
def projectServices = service.list('my-project-id').execute()
```

This library also offers a helper method (`extractBody`) for getting the body on a `Call<T>` instance. Here is an example
of the usage:
```groovy
def stacks = rancher.type StackApi
def myStack = extractBody stacks.findById('my-project', 'my-stack')

myStack.id // extractBody gives us direct access to the value returned form the API call
``` 

## Updating the Rancher API

The API models and services for this projects are generated using the schema for a given Rancher version.
To update the API for a rancher version, execute the below steps:

1. `cd generator`
1. Run a Rancher server container using `docker run -d --name rancher-server -p 8080:8080 rancher/enterprise:<rancher-version>`
   and wait for the API to become available.
1. `curl -o schemas.json http://localhost:8080/v2-beta/projecst/1a5/schemas`
1. `make && ./generator`
