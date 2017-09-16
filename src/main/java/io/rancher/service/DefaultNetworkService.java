package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.DefaultNetwork;
import io.rancher.type.Network;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface DefaultNetworkService {

  @GET("defaultNetwork")
  Call<TypeCollection<DefaultNetwork>> list();

  @GET("defaultNetwork")
  Call<TypeCollection<DefaultNetwork>> list(@QueryMap HashMap<String,String> filters);

  @GET("defaultNetwork/{id}")
  Call<DefaultNetwork> get(@Path("id") String id);

  @POST("defaultNetwork")
  Call<DefaultNetwork> create(@Body DefaultNetwork defaultNetwork);

  @PUT("defaultNetwork/{id}")
  Call<DefaultNetwork> update(@Path("id") String id, @Body DefaultNetwork defaultNetwork);

  @DELETE("defaultNetwork/{id}")
  Call<Void> delete(@Path("id") String id);
  
  @POST("defaultNetwork/{id}?action=activate")
  Call<Network> activate(@Path("id") String id);
  
  @POST("defaultNetwork/{id}?action=deactivate")
  Call<Network> deactivate(@Path("id") String id);
  
  @POST("defaultNetwork/{id}?action=purge")
  Call<Network> purge(@Path("id") String id);
  
  @POST("defaultNetwork/{id}?action=remove")
  Call<Network> remove(@Path("id") String id);
  
}
