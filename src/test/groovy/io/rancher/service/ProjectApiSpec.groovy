package io.rancher.service

import com.groovycoder.spockdockerextension.Testcontainers
import groovy.util.logging.Slf4j
import io.rancher.Rancher
import io.rancher.Rancher.Config
import org.testcontainers.containers.GenericContainer
import org.testcontainers.containers.output.Slf4jLogConsumer
import spock.lang.Shared
import spock.lang.Specification

import static java.util.Objects.nonNull

@Slf4j
@Testcontainers
class ProjectApiSpec extends Specification {
  @Shared
  GenericContainer rancherServer = new GenericContainer('rancher/enterprise:v1.6.14')
    .withExposedPorts(8080)

  static Rancher rancher

  def setupSpec() {
    rancherServer.followOutput(new Slf4jLogConsumer(log))
  }

  def setup() {
    def url = rancherServer.with {
      "http://${containerIpAddress}:${firstMappedPort}/v2-beta/"
    }
    rancher = new Rancher(new Config(url: url.toURL()))
  }

  def 'should find projects when listing'() {
    given:
    def projectApi = rancher.type ProjectApi

    when:
    def projects = projectApi.list().execute().body()

    then:
    !projects.data.empty
  }

  def 'querying by project name is successful'() {
    given:
    def projectApi = rancher.type ProjectApi
    def project = projectApi.list().execute().body().data[0]

    when:
    def byName = projectApi.query(name: project.name).execute().body()

    then:
    nonNull byName
    byName.data.size() == 1
    byName.data[0].name == project.name
  }

  def 'finding project by id is successful'() {
    given:
    def projectApi = rancher.type ProjectApi
    def project = projectApi.list().execute().body().data[0]

    when:
    def byId = projectApi.findById(project.id).execute().body()

    then:
    nonNull byId
    byId.name == project.name
    byId.id == project.id
  }
}
