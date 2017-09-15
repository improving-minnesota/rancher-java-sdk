package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Ulimit;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface UlimitService {

  @GET("ulimit")
  Call<TypeCollection<Ulimit>> list();

  @GET("ulimit")
  Call<TypeCollection<Ulimit>> list(@QueryMap Filters filters);

  @GET("ulimit/{id}")
  Call<Ulimit> get(@Path("id") String id);

  @POST("ulimit")
  Call<Ulimit> create(@Body Ulimit ulimit);

  @PUT("ulimit/{id}")
  Call<Ulimit> update(@Path("id") String id, @Body Ulimit ulimit);

  @DELETE("ulimit/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
