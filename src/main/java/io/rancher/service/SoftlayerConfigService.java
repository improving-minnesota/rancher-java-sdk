package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.SoftlayerConfig;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface SoftlayerConfigService {

  @GET("softlayerConfig")
  Call<TypeCollection<SoftlayerConfig>> list();

  @GET("softlayerConfig")
  Call<TypeCollection<SoftlayerConfig>> list(@QueryMap Filters filters);

  @GET("softlayerConfig/{id}")
  Call<SoftlayerConfig> get(@Path("id") String id);

  @POST("softlayerConfig")
  Call<SoftlayerConfig> create(@Body SoftlayerConfig softlayerConfig);

  @PUT("softlayerConfig/{id}")
  Call<SoftlayerConfig> update(@Path("id") String id, @Body SoftlayerConfig softlayerConfig);

  @DELETE("softlayerConfig/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
