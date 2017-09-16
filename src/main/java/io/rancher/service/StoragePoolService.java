package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.StoragePool;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface StoragePoolService {

  @GET("storagePool")
  Call<TypeCollection<StoragePool>> list();

  @GET("storagePool")
  Call<TypeCollection<StoragePool>> list(@QueryMap HashMap<String,String> filters);

  @GET("storagePool/{id}")
  Call<StoragePool> get(@Path("id") String id);

  @POST("storagePool")
  Call<StoragePool> create(@Body StoragePool storagePool);

  @PUT("storagePool/{id}")
  Call<StoragePool> update(@Path("id") String id, @Body StoragePool storagePool);

  @DELETE("storagePool/{id}")
  Call<Void> delete(@Path("id") String id);
  
  @POST("storagePool/{id}?action=activate")
  Call<StoragePool> activate(@Path("id") String id);
  
  @POST("storagePool/{id}?action=deactivate")
  Call<StoragePool> deactivate(@Path("id") String id);
  
  @POST("storagePool/{id}?action=purge")
  Call<StoragePool> purge(@Path("id") String id);
  
  @POST("storagePool/{id}?action=remove")
  Call<StoragePool> remove(@Path("id") String id);
  
}
