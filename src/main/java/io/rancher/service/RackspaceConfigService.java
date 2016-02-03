package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.RackspaceConfig;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface RackspaceConfigService {

  @GET("rackspaceConfig")
  Call<TypeCollection<RackspaceConfig>> list();

  @GET("rackspaceConfig")
  Call<TypeCollection<RackspaceConfig>> list(@QueryMap Filters filters);

  @GET("rackspaceConfig/{id}")
  Call<RackspaceConfig> get(@Path("id") String id);

  @POST("rackspaceConfig")
  Call<RackspaceConfig> create(@Body RackspaceConfig rackspaceConfig);

  @PUT("rackspaceConfig/{id}")
  Call<RackspaceConfig> update(@Path("id") String id, @Body RackspaceConfig rackspaceConfig);

  @DELETE("rackspaceConfig/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
