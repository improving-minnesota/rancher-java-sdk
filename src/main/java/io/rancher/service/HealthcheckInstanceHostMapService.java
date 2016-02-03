package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.HealthcheckInstanceHostMap;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface HealthcheckInstanceHostMapService {

  @GET("healthcheckInstanceHostMap")
  Call<TypeCollection<HealthcheckInstanceHostMap>> list();

  @GET("healthcheckInstanceHostMap")
  Call<TypeCollection<HealthcheckInstanceHostMap>> list(@QueryMap Filters filters);

  @GET("healthcheckInstanceHostMap/{id}")
  Call<HealthcheckInstanceHostMap> get(@Path("id") String id);

  @POST("healthcheckInstanceHostMap")
  Call<HealthcheckInstanceHostMap> create(@Body HealthcheckInstanceHostMap healthcheckInstanceHostMap);

  @PUT("healthcheckInstanceHostMap/{id}")
  Call<HealthcheckInstanceHostMap> update(@Path("id") String id, @Body HealthcheckInstanceHostMap healthcheckInstanceHostMap);

  @DELETE("healthcheckInstanceHostMap/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("healthcheckInstanceHostMap/{id}?action=remove")
  Call<HealthcheckInstanceHostMap> remove(@Path("id") String id);
  
}
