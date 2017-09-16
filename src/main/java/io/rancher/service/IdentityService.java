package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.Identity;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface IdentityService {

  @GET("identity")
  Call<TypeCollection<Identity>> list();

  @GET("identity")
  Call<TypeCollection<Identity>> list(@QueryMap HashMap<String,String> filters);

  @GET("identity/{id}")
  Call<Identity> get(@Path("id") String id);

  @POST("identity")
  Call<Identity> create(@Body Identity identity);

  @PUT("identity/{id}")
  Call<Identity> update(@Path("id") String id, @Body Identity identity);

  @DELETE("identity/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
