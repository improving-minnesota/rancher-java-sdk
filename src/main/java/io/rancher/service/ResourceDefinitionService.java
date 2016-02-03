package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ResourceDefinition;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ResourceDefinitionService {

  @GET("resourceDefinition")
  Call<TypeCollection<ResourceDefinition>> list();

  @GET("resourceDefinition")
  Call<TypeCollection<ResourceDefinition>> list(@QueryMap Filters filters);

  @GET("resourceDefinition/{id}")
  Call<ResourceDefinition> get(@Path("id") String id);

  @POST("resourceDefinition")
  Call<ResourceDefinition> create(@Body ResourceDefinition resourceDefinition);

  @PUT("resourceDefinition/{id}")
  Call<ResourceDefinition> update(@Path("id") String id, @Body ResourceDefinition resourceDefinition);

  @DELETE("resourceDefinition/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
