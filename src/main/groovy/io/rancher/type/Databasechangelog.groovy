package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Databasechangelog implements RancherType {
  String author
  String comments
  String dateexecuted
  String description
  String exectype
  String filename
  String liquibase
  String md5sum
  BigInteger orderexecuted
  String tag
}
