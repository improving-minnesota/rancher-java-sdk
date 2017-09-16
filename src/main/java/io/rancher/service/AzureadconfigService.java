package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.Azureadconfig;

import retrofit2.Call;
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
  Call<TypeCollection<Azureadconfig>> list(@QueryMap HashMap<String,String> filters);

  @GET("azureadconfig/{id}")
  Call<Azureadconfig> get(@Path("id") String id);

  @POST("azureadconfig")
  Call<Azureadconfig> create(@Body Azureadconfig azureadconfig);

  @PUT("azureadconfig/{id}")
  Call<Azureadconfig> update(@Path("id") String id, @Body Azureadconfig azureadconfig);

  @DELETE("azureadconfig/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
