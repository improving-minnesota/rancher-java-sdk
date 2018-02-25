# Rancher Groovy SDK

This project is an auto-generated Groovy Client for [Rancher](rancher.com)

This project automatically generates the type definitions use a Go template generator and the Rancher provided API schema.
It was originally derived from the [Go-Rancher](https://github.com/rancher/go-rancher) library.

There services definitions are built using Square's [Retrofit2](http://square.github.io/retrofit/) library.

## Example

The entrypoint for this library is the `io.rancher.Rancher` class.
You must first create an API key in your Rancher installation to use this library.

First, initialize your Rancher client:

```groovy
Rancher.Config config = new Rancher.Config(new URL('https://rancher.mydomain.com'), 'MyAPIAccessKey', 'MyAPISecretKey')
Rancher rancher = new Rancher(config)
```

Once the client is created, you can interact with Rancher by having the client generate a proxy for one of the service
interfaces for you.

```groovy
ServiceService service = rancher.type(io.rancher.service.ServiceService)
List<io.rancher.type.Service> services = service.list().execute()
```

## Updating the Rancher API

The API definitions in this project are automatically generated from the Rancher API definition.
To update the API, perform the following steps:

1. `cd generator`
1. `curl -o schemas.json https://raw.githubusercontent.com/rancher/go-rancher/master/generator/schemas.json`
1. `make && ./generator`
