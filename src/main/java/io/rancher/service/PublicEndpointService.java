package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.PublicEndpoint;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface PublicEndpointService {

  @GET("publicEndpoint")
  Call<TypeCollection<PublicEndpoint>> list();

  @GET("publicEndpoint")
  Call<TypeCollection<PublicEndpoint>> list(@QueryMap HashMap<String,String> filters);

  @GET("publicEndpoint/{id}")
  Call<PublicEndpoint> get(@Path("id") String id);

  @POST("publicEndpoint")
  Call<PublicEndpoint> create(@Body PublicEndpoint publicEndpoint);

  @PUT("publicEndpoint/{id}")
  Call<PublicEndpoint> update(@Path("id") String id, @Body PublicEndpoint publicEndpoint);

  @DELETE("publicEndpoint/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
