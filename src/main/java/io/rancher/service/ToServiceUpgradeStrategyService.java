package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ToServiceUpgradeStrategy;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ToServiceUpgradeStrategyService {

  @GET("toServiceUpgradeStrategy")
  Call<TypeCollection<ToServiceUpgradeStrategy>> list();

  @GET("toServiceUpgradeStrategy")
  Call<TypeCollection<ToServiceUpgradeStrategy>> list(@QueryMap Filters filters);

  @GET("toServiceUpgradeStrategy/{id}")
  Call<ToServiceUpgradeStrategy> get(@Path("id") String id);

  @POST("toServiceUpgradeStrategy")
  Call<ToServiceUpgradeStrategy> create(@Body ToServiceUpgradeStrategy toServiceUpgradeStrategy);

  @PUT("toServiceUpgradeStrategy/{id}")
  Call<ToServiceUpgradeStrategy> update(@Path("id") String id, @Body ToServiceUpgradeStrategy toServiceUpgradeStrategy);

  @DELETE("toServiceUpgradeStrategy/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
