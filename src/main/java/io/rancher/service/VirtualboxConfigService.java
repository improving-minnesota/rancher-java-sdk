package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.VirtualboxConfig;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface VirtualboxConfigService {

  @GET("virtualboxConfig")
  Call<TypeCollection<VirtualboxConfig>> list();

  @GET("virtualboxConfig")
  Call<TypeCollection<VirtualboxConfig>> list(@QueryMap Filters filters);

  @GET("virtualboxConfig/{id}")
  Call<VirtualboxConfig> get(@Path("id") String id);

  @POST("virtualboxConfig")
  Call<VirtualboxConfig> create(@Body VirtualboxConfig virtualboxConfig);

  @PUT("virtualboxConfig/{id}")
  Call<VirtualboxConfig> update(@Path("id") String id, @Body VirtualboxConfig virtualboxConfig);

  @DELETE("virtualboxConfig/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
