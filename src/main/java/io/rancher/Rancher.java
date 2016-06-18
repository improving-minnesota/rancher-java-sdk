package io.rancher;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.rancher.client.BasicAuthInterceptor;
import okhttp3.OkHttpClient;
import retrofit2.JacksonConverterFactory;
import retrofit2.Retrofit;

import java.net.URL;

public class Rancher {

    private final Retrofit retrofit;

    public Rancher(final Config config) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder().addInterceptor(
                BasicAuthInterceptor.auth(config.getAccessKey(), config.getSecretKey())
        );

        this.retrofit = new Retrofit.Builder()
                .baseUrl(config.getUrl().toString())
                .client(builder.build())
                .addConverterFactory(JacksonConverterFactory.create(configureObjectMapper()))
                .build();

    }

    private ObjectMapper configureObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        return objectMapper;
    }

    public <T> T type(Class<T> service) {
        return retrofit.create(service);
    }

    public static class Config {

        private URL url;
        private String accessKey;
        private String secretKey;

        public Config(URL url, String accessKey, String secretKey) {
            this.url = url;
            this.accessKey = accessKey;
            this.secretKey = secretKey;
        }

        public URL getUrl() {
            return url;
        }

        public void setUrl(URL url) {
            this.url = url;
        }

        public String getAccessKey() {
            return accessKey;
        }

        public void setAccessKey(String accessKey) {
            this.accessKey = accessKey;
        }

        public String getSecretKey() {
            return secretKey;
        }

        public void setSecretKey(String secretKey) {
            this.secretKey = secretKey;
        }
    }
}
