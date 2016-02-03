package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.PhysicalHost;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface PhysicalHostService {

  @GET("physicalHost")
  Call<TypeCollection<PhysicalHost>> list();

  @GET("physicalHost")
  Call<TypeCollection<PhysicalHost>> list(@QueryMap Filters filters);

  @GET("physicalHost/{id}")
  Call<PhysicalHost> get(@Path("id") String id);

  @POST("physicalHost")
  Call<PhysicalHost> create(@Body PhysicalHost physicalHost);

  @PUT("physicalHost/{id}")
  Call<PhysicalHost> update(@Path("id") String id, @Body PhysicalHost physicalHost);

  @DELETE("physicalHost/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("physicalHost/{id}?action=bootstrap")
  Call<PhysicalHost> bootstrap(@Path("id") String id);
  
  @POST("physicalHost/{id}?action=error")
  Call<PhysicalHost> error(@Path("id") String id);
  
  @POST("physicalHost/{id}?action=remove")
  Call<PhysicalHost> remove(@Path("id") String id);
  
}
