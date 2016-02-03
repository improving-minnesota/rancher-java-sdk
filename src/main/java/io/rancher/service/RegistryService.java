package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Registry;
import io.rancher.type.StoragePool;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface RegistryService {

  @GET("registry")
  Call<TypeCollection<Registry>> list();

  @GET("registry")
  Call<TypeCollection<Registry>> list(@QueryMap Filters filters);

  @GET("registry/{id}")
  Call<Registry> get(@Path("id") String id);

  @POST("registry")
  Call<Registry> create(@Body Registry registry);

  @PUT("registry/{id}")
  Call<Registry> update(@Path("id") String id, @Body Registry registry);

  @DELETE("registry/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("registry/{id}?action=activate")
  Call<StoragePool> activate(@Path("id") String id);
  
  @POST("registry/{id}?action=deactivate")
  Call<StoragePool> deactivate(@Path("id") String id);
  
  @POST("registry/{id}?action=purge")
  Call<StoragePool> purge(@Path("id") String id);
  
  @POST("registry/{id}?action=remove")
  Call<StoragePool> remove(@Path("id") String id);
  
  @POST("registry/{id}?action=restore")
  Call<StoragePool> restore(@Path("id") String id);
  
}
