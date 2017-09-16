package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.SecretReference;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface SecretReferenceService {

  @GET("secretReference")
  Call<TypeCollection<SecretReference>> list();

  @GET("secretReference")
  Call<TypeCollection<SecretReference>> list(@QueryMap HashMap<String,String> filters);

  @GET("secretReference/{id}")
  Call<SecretReference> get(@Path("id") String id);

  @POST("secretReference")
  Call<SecretReference> create(@Body SecretReference secretReference);

  @PUT("secretReference/{id}")
  Call<SecretReference> update(@Path("id") String id, @Body SecretReference secretReference);

  @DELETE("secretReference/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
