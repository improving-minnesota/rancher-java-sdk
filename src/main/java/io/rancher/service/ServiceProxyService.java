package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ServiceProxy;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ServiceProxyService {

  @GET("serviceProxy")
  Call<TypeCollection<ServiceProxy>> list();

  @GET("serviceProxy")
  Call<TypeCollection<ServiceProxy>> list(@QueryMap Filters filters);

  @GET("serviceProxy/{id}")
  Call<ServiceProxy> get(@Path("id") String id);

  @POST("serviceProxy")
  Call<ServiceProxy> create(@Body ServiceProxy serviceProxy);

  @PUT("serviceProxy/{id}")
  Call<ServiceProxy> update(@Path("id") String id, @Body ServiceProxy serviceProxy);

  @DELETE("serviceProxy/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
