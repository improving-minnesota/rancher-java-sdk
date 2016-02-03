package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.VmwarevcloudairConfig;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface VmwarevcloudairConfigService {

  @GET("vmwarevcloudairConfig")
  Call<TypeCollection<VmwarevcloudairConfig>> list();

  @GET("vmwarevcloudairConfig")
  Call<TypeCollection<VmwarevcloudairConfig>> list(@QueryMap Filters filters);

  @GET("vmwarevcloudairConfig/{id}")
  Call<VmwarevcloudairConfig> get(@Path("id") String id);

  @POST("vmwarevcloudairConfig")
  Call<VmwarevcloudairConfig> create(@Body VmwarevcloudairConfig vmwarevcloudairConfig);

  @PUT("vmwarevcloudairConfig/{id}")
  Call<VmwarevcloudairConfig> update(@Path("id") String id, @Body VmwarevcloudairConfig vmwarevcloudairConfig);

  @DELETE("vmwarevcloudairConfig/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
