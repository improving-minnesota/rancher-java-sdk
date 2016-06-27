package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.HaConfigInput;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface HaConfigInputService {

  @GET("haConfigInput")
  Call<TypeCollection<HaConfigInput>> list();

  @GET("haConfigInput")
  Call<TypeCollection<HaConfigInput>> list(@QueryMap Filters filters);

  @GET("haConfigInput/{id}")
  Call<HaConfigInput> get(@Path("id") String id);

  @POST("haConfigInput")
  Call<HaConfigInput> create(@Body HaConfigInput haConfigInput);

  @PUT("haConfigInput/{id}")
  Call<HaConfigInput> update(@Path("id") String id, @Body HaConfigInput haConfigInput);

  @DELETE("haConfigInput/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
