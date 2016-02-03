package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ServiceUpgrade;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ServiceUpgradeService {

  @GET("serviceUpgrade")
  Call<TypeCollection<ServiceUpgrade>> list();

  @GET("serviceUpgrade")
  Call<TypeCollection<ServiceUpgrade>> list(@QueryMap Filters filters);

  @GET("serviceUpgrade/{id}")
  Call<ServiceUpgrade> get(@Path("id") String id);

  @POST("serviceUpgrade")
  Call<ServiceUpgrade> create(@Body ServiceUpgrade serviceUpgrade);

  @PUT("serviceUpgrade/{id}")
  Call<ServiceUpgrade> update(@Path("id") String id, @Body ServiceUpgrade serviceUpgrade);

  @DELETE("serviceUpgrade/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
