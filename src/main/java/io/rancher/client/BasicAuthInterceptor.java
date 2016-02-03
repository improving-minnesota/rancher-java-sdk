package io.rancher.client;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Base64;

public class BasicAuthInterceptor implements Interceptor {

    private final Credentials credentials;

    public BasicAuthInterceptor(Credentials credentials) {
        this.credentials = credentials;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Request modifiedRequest = request.newBuilder().addHeader(
                "Authorization",
                "Basic " +
                        Base64.getEncoder().encodeToString(
                                (credentials.getUsername() + ":" + credentials.getPassword()).getBytes())
        ).build();
        return chain.proceed(modifiedRequest);
    }

    public static BasicAuthInterceptor auth(String username, String password) {
        return new BasicAuthInterceptor(Credentials.of(username, password));
    }

    static class Credentials {

        private final String username;
        private final String password;

        private Credentials(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public String getUsername() {
            return this.username;
        }

        public String getPassword() {
            return this.password;
        }

        public static Credentials of(String username, String password) {
            return new Credentials(username, password);
        }
    }
}
