package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Openldapconfig;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface OpenldapconfigService {

  @GET("openldapconfig")
  Call<TypeCollection<Openldapconfig>> list();

  @GET("openldapconfig")
  Call<TypeCollection<Openldapconfig>> list(@QueryMap Filters filters);

  @GET("openldapconfig/{id}")
  Call<Openldapconfig> get(@Path("id") String id);

  @POST("openldapconfig")
  Call<Openldapconfig> create(@Body Openldapconfig openldapconfig);

  @PUT("openldapconfig/{id}")
  Call<Openldapconfig> update(@Path("id") String id, @Body Openldapconfig openldapconfig);

  @DELETE("openldapconfig/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
