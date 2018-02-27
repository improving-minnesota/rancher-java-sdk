package io.rancher

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import groovy.transform.Canonical
import io.rancher.client.BasicAuthInterceptor
import io.rancher.service.ProjectApi
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory

class Rancher {
  Retrofit retrofit

  /**
   * Instantiates a new Rancher.
   *
   * @param config the config
   */
  Rancher(Config config) {
    OkHttpClient.Builder builder = new OkHttpClient.Builder().with {
      addInterceptor BasicAuthInterceptor.auth(config.accessKey, config.secretKey)
      addInterceptor { chain ->
        def request = chain.request().newBuilder().addHeader('Accpet', 'application/json').build()
        chain.proceed request
      }
    }

    retrofit = new Retrofit.Builder().with {
      baseUrl config.url.toString()
      client builder.build()
      addConverterFactory JacksonConverterFactory.create(configureObjectMapper())
      build()
    }
  }

  static ObjectMapper configureObjectMapper() {
    new ObjectMapper().with {
      configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
      serializationInclusion = JsonInclude.Include.NON_NULL
      it
    }
  }

  /**
   * Type t.
   *
   * @param < T > type parameter
   * @param service the service
   * @return the t
   */
  def <T> T type(Class<T> service) {
    retrofit.create service
  }

  /**
   * The type Config.
   */
  @Canonical
  static class Config {
    URL url
    String accessKey
    String secretKey
  }

  static <T> T extractBody(Call<T> call) {
    call.execute().body()
  }
}
