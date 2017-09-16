package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.Ldapconfig;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface LdapconfigService {

  @GET("ldapconfig")
  Call<TypeCollection<Ldapconfig>> list();

  @GET("ldapconfig")
  Call<TypeCollection<Ldapconfig>> list(@QueryMap HashMap<String,String> filters);

  @GET("ldapconfig/{id}")
  Call<Ldapconfig> get(@Path("id") String id);

  @POST("ldapconfig")
  Call<Ldapconfig> create(@Body Ldapconfig ldapconfig);

  @PUT("ldapconfig/{id}")
  Call<Ldapconfig> update(@Path("id") String id, @Body Ldapconfig ldapconfig);

  @DELETE("ldapconfig/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
