package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Secret;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface SecretService {

  @GET("secret")
  Call<TypeCollection<Secret>> list();

  @GET("secret")
  Call<TypeCollection<Secret>> list(@QueryMap Filters filters);

  @GET("secret/{id}")
  Call<Secret> get(@Path("id") String id);

  @POST("secret")
  Call<Secret> create(@Body Secret secret);

  @PUT("secret/{id}")
  Call<Secret> update(@Path("id") String id, @Body Secret secret);

  @DELETE("secret/{id}")
  Call<Void> delete(@Path("id") String id);
  
  @POST("secret/{id}?action=remove")
  Call<Secret> remove(@Path("id") String id);
  
}
