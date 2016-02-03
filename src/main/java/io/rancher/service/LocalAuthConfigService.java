package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.LocalAuthConfig;

import retrofit2.Call;
import retrofit2.Response;
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
  Call<TypeCollection<LocalAuthConfig>> list(@QueryMap Filters filters);

  @GET("localAuthConfig/{id}")
  Call<LocalAuthConfig> get(@Path("id") String id);

  @POST("localAuthConfig")
  Call<LocalAuthConfig> create(@Body LocalAuthConfig localAuthConfig);

  @PUT("localAuthConfig/{id}")
  Call<LocalAuthConfig> update(@Path("id") String id, @Body LocalAuthConfig localAuthConfig);

  @DELETE("localAuthConfig/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
