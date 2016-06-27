package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Azureadconfig;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface AzureadconfigService {

  @GET("azureadconfig")
  Call<TypeCollection<Azureadconfig>> list();

  @GET("azureadconfig")
  Call<TypeCollection<Azureadconfig>> list(@QueryMap Filters filters);

  @GET("azureadconfig/{id}")
  Call<Azureadconfig> get(@Path("id") String id);

  @POST("azureadconfig")
  Call<Azureadconfig> create(@Body Azureadconfig azureadconfig);

  @PUT("azureadconfig/{id}")
  Call<Azureadconfig> update(@Path("id") String id, @Body Azureadconfig azureadconfig);

  @DELETE("azureadconfig/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
