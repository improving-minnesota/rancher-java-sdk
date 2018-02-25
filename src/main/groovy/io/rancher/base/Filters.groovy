package io.rancher.base

class Filters<K, V> extends HashMap<K, V> {
  static Filters filterWith(Map<String, String> queryParams) {
    queryParams as Filters<String, String>
  }
}
