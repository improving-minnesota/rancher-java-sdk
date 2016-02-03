package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Network;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface NetworkService {

  @GET("network")
  Call<TypeCollection<Network>> list();

  @GET("network")
  Call<TypeCollection<Network>> list(@QueryMap Filters filters);

  @GET("network/{id}")
  Call<Network> get(@Path("id") String id);

  @POST("network")
  Call<Network> create(@Body Network network);

  @PUT("network/{id}")
  Call<Network> update(@Path("id") String id, @Body Network network);

  @DELETE("network/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("network/{id}?action=activate")
  Call<Network> activate(@Path("id") String id);
  
  @POST("network/{id}?action=deactivate")
  Call<Network> deactivate(@Path("id") String id);
  
  @POST("network/{id}?action=purge")
  Call<Network> purge(@Path("id") String id);
  
  @POST("network/{id}?action=remove")
  Call<Network> remove(@Path("id") String id);
  
  @POST("network/{id}?action=restore")
  Call<Network> restore(@Path("id") String id);
  
}
