package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.EnvironmentUpgrade;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface EnvironmentUpgradeService {

  @GET("environmentUpgrade")
  Call<TypeCollection<EnvironmentUpgrade>> list();

  @GET("environmentUpgrade")
  Call<TypeCollection<EnvironmentUpgrade>> list(@QueryMap Filters filters);

  @GET("environmentUpgrade/{id}")
  Call<EnvironmentUpgrade> get(@Path("id") String id);

  @POST("environmentUpgrade")
  Call<EnvironmentUpgrade> create(@Body EnvironmentUpgrade environmentUpgrade);

  @PUT("environmentUpgrade/{id}")
  Call<EnvironmentUpgrade> update(@Path("id") String id, @Body EnvironmentUpgrade environmentUpgrade);

  @DELETE("environmentUpgrade/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
