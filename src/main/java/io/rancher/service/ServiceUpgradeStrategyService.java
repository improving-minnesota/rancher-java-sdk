package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.ServiceUpgradeStrategy;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ServiceUpgradeStrategyService {

  @GET("serviceUpgradeStrategy")
  Call<TypeCollection<ServiceUpgradeStrategy>> list();

  @GET("serviceUpgradeStrategy")
  Call<TypeCollection<ServiceUpgradeStrategy>> list(@QueryMap HashMap<String,String> filters);

  @GET("serviceUpgradeStrategy/{id}")
  Call<ServiceUpgradeStrategy> get(@Path("id") String id);

  @POST("serviceUpgradeStrategy")
  Call<ServiceUpgradeStrategy> create(@Body ServiceUpgradeStrategy serviceUpgradeStrategy);

  @PUT("serviceUpgradeStrategy/{id}")
  Call<ServiceUpgradeStrategy> update(@Path("id") String id, @Body ServiceUpgradeStrategy serviceUpgradeStrategy);

  @DELETE("serviceUpgradeStrategy/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
