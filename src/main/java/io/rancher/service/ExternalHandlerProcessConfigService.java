package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ExternalHandlerProcessConfig;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ExternalHandlerProcessConfigService {

  @GET("externalHandlerProcessConfig")
  Call<TypeCollection<ExternalHandlerProcessConfig>> list();

  @GET("externalHandlerProcessConfig")
  Call<TypeCollection<ExternalHandlerProcessConfig>> list(@QueryMap Filters filters);

  @GET("externalHandlerProcessConfig/{id}")
  Call<ExternalHandlerProcessConfig> get(@Path("id") String id);

  @POST("externalHandlerProcessConfig")
  Call<ExternalHandlerProcessConfig> create(@Body ExternalHandlerProcessConfig externalHandlerProcessConfig);

  @PUT("externalHandlerProcessConfig/{id}")
  Call<ExternalHandlerProcessConfig> update(@Path("id") String id, @Body ExternalHandlerProcessConfig externalHandlerProcessConfig);

  @DELETE("externalHandlerProcessConfig/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
