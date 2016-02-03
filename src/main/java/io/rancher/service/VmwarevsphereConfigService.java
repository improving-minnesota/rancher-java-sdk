package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.VmwarevsphereConfig;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface VmwarevsphereConfigService {

  @GET("vmwarevsphereConfig")
  Call<TypeCollection<VmwarevsphereConfig>> list();

  @GET("vmwarevsphereConfig")
  Call<TypeCollection<VmwarevsphereConfig>> list(@QueryMap Filters filters);

  @GET("vmwarevsphereConfig/{id}")
  Call<VmwarevsphereConfig> get(@Path("id") String id);

  @POST("vmwarevsphereConfig")
  Call<VmwarevsphereConfig> create(@Body VmwarevsphereConfig vmwarevsphereConfig);

  @PUT("vmwarevsphereConfig/{id}")
  Call<VmwarevsphereConfig> update(@Path("id") String id, @Body VmwarevsphereConfig vmwarevsphereConfig);

  @DELETE("vmwarevsphereConfig/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
