package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.IpAddress;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface IpAddressService {

  @GET("ipAddress")
  Call<TypeCollection<IpAddress>> list();

  @GET("ipAddress")
  Call<TypeCollection<IpAddress>> list(@QueryMap Filters filters);

  @GET("ipAddress/{id}")
  Call<IpAddress> get(@Path("id") String id);

  @POST("ipAddress")
  Call<IpAddress> create(@Body IpAddress ipAddress);

  @PUT("ipAddress/{id}")
  Call<IpAddress> update(@Path("id") String id, @Body IpAddress ipAddress);

  @DELETE("ipAddress/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("ipAddress/{id}?action=activate")
  Call<IpAddress> activate(@Path("id") String id);
  
  @POST("ipAddress/{id}?action=deactivate")
  Call<IpAddress> deactivate(@Path("id") String id);
  
  @POST("ipAddress/{id}?action=disassociate")
  Call<IpAddress> disassociate(@Path("id") String id);
  
  @POST("ipAddress/{id}?action=purge")
  Call<IpAddress> purge(@Path("id") String id);
  
  @POST("ipAddress/{id}?action=remove")
  Call<IpAddress> remove(@Path("id") String id);
  
  @POST("ipAddress/{id}?action=restore")
  Call<IpAddress> restore(@Path("id") String id);
  
}
