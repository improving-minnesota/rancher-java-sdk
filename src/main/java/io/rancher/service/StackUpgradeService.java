package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.StackUpgrade;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface StackUpgradeService {

  @GET("stackUpgrade")
  Call<TypeCollection<StackUpgrade>> list();

  @GET("stackUpgrade")
  Call<TypeCollection<StackUpgrade>> list(@QueryMap Filters filters);

  @GET("stackUpgrade/{id}")
  Call<StackUpgrade> get(@Path("id") String id);

  @POST("stackUpgrade")
  Call<StackUpgrade> create(@Body StackUpgrade stackUpgrade);

  @PUT("stackUpgrade/{id}")
  Call<StackUpgrade> update(@Path("id") String id, @Body StackUpgrade stackUpgrade);

  @DELETE("stackUpgrade/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
