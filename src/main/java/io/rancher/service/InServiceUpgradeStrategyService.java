package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.InServiceUpgradeStrategy;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface InServiceUpgradeStrategyService {

  @GET("inServiceUpgradeStrategy")
  Call<TypeCollection<InServiceUpgradeStrategy>> list();

  @GET("inServiceUpgradeStrategy")
  Call<TypeCollection<InServiceUpgradeStrategy>> list(@QueryMap Filters filters);

  @GET("inServiceUpgradeStrategy/{id}")
  Call<InServiceUpgradeStrategy> get(@Path("id") String id);

  @POST("inServiceUpgradeStrategy")
  Call<InServiceUpgradeStrategy> create(@Body InServiceUpgradeStrategy inServiceUpgradeStrategy);

  @PUT("inServiceUpgradeStrategy/{id}")
  Call<InServiceUpgradeStrategy> update(@Path("id") String id, @Body InServiceUpgradeStrategy inServiceUpgradeStrategy);

  @DELETE("inServiceUpgradeStrategy/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
