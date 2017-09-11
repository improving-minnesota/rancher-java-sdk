package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ServiceLog;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ServiceLogService {

  @GET("serviceLog")
  Call<TypeCollection<ServiceLog>> list();

  @GET("serviceLog")
  Call<TypeCollection<ServiceLog>> list(@QueryMap Filters filters);

  @GET("serviceLog/{id}")
  Call<ServiceLog> get(@Path("id") String id);

  @POST("serviceLog")
  Call<ServiceLog> create(@Body ServiceLog serviceLog);

  @PUT("serviceLog/{id}")
  Call<ServiceLog> update(@Path("id") String id, @Body ServiceLog serviceLog);

  @DELETE("serviceLog/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
