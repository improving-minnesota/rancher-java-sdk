package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.LocalAuthConfig;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface LocalAuthConfigService {

  @GET("localAuthConfig")
  Call<TypeCollection<LocalAuthConfig>> list();

  @GET("localAuthConfig")
  Call<TypeCollection<LocalAuthConfig>> list(@QueryMap HashMap<String,String> filters);

  @GET("localAuthConfig/{id}")
  Call<LocalAuthConfig> get(@Path("id") String id);

  @POST("localAuthConfig")
  Call<LocalAuthConfig> create(@Body LocalAuthConfig localAuthConfig);

  @PUT("localAuthConfig/{id}")
  Call<LocalAuthConfig> update(@Path("id") String id, @Body LocalAuthConfig localAuthConfig);

  @DELETE("localAuthConfig/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
