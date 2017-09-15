package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.NetworkDriver;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface NetworkDriverService {

  @GET("networkDriver")
  Call<TypeCollection<NetworkDriver>> list();

  @GET("networkDriver")
  Call<TypeCollection<NetworkDriver>> list(@QueryMap Filters filters);

  @GET("networkDriver/{id}")
  Call<NetworkDriver> get(@Path("id") String id);

  @POST("networkDriver")
  Call<NetworkDriver> create(@Body NetworkDriver networkDriver);

  @PUT("networkDriver/{id}")
  Call<NetworkDriver> update(@Path("id") String id, @Body NetworkDriver networkDriver);

  @DELETE("networkDriver/{id}")
  Call<Void> delete(@Path("id") String id);
  
  @POST("networkDriver/{id}?action=activate")
  Call<NetworkDriver> activate(@Path("id") String id);
  
  @POST("networkDriver/{id}?action=deactivate")
  Call<NetworkDriver> deactivate(@Path("id") String id);
  
  @POST("networkDriver/{id}?action=remove")
  Call<NetworkDriver> remove(@Path("id") String id);
  
}
