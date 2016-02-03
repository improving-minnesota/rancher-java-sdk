package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.IpAddressAssociateInput;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface IpAddressAssociateInputService {

  @GET("ipAddressAssociateInput")
  Call<TypeCollection<IpAddressAssociateInput>> list();

  @GET("ipAddressAssociateInput")
  Call<TypeCollection<IpAddressAssociateInput>> list(@QueryMap Filters filters);

  @GET("ipAddressAssociateInput/{id}")
  Call<IpAddressAssociateInput> get(@Path("id") String id);

  @POST("ipAddressAssociateInput")
  Call<IpAddressAssociateInput> create(@Body IpAddressAssociateInput ipAddressAssociateInput);

  @PUT("ipAddressAssociateInput/{id}")
  Call<IpAddressAssociateInput> update(@Path("id") String id, @Body IpAddressAssociateInput ipAddressAssociateInput);

  @DELETE("ipAddressAssociateInput/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
