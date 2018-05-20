package io.rancher.client

import groovy.transform.Canonical
import okhttp3.Interceptor
import okhttp3.Response

@Canonical
class BasicAuthInterceptor implements Interceptor {
  Credentials credentials

  @Override
  Response intercept(Chain chain) throws IOException {
    def request = chain.request()
    def modifiedRequest = request.newBuilder().addHeader(
      'Authorization',
      "Basic ${Base64.encoder.encodeToString("${credentials.username}:${credentials.password}".bytes)}"
    ).build()

    chain.proceed(modifiedRequest)
  }

  static auth(String username, String password) {
    new BasicAuthInterceptor(Credentials.of(username, password))
  }

  @Canonical
  static class Credentials {
    String username
    String password

    static of(String username, String password) {
      new Credentials(username, password)
    }
  }
}
