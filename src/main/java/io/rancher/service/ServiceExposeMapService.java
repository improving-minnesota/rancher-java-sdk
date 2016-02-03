package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ServiceExposeMap;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ServiceExposeMapService {

  @GET("serviceExposeMap")
  Call<TypeCollection<ServiceExposeMap>> list();

  @GET("serviceExposeMap")
  Call<TypeCollection<ServiceExposeMap>> list(@QueryMap Filters filters);

  @GET("serviceExposeMap/{id}")
  Call<ServiceExposeMap> get(@Path("id") String id);

  @POST("serviceExposeMap")
  Call<ServiceExposeMap> create(@Body ServiceExposeMap serviceExposeMap);

  @PUT("serviceExposeMap/{id}")
  Call<ServiceExposeMap> update(@Path("id") String id, @Body ServiceExposeMap serviceExposeMap);

  @DELETE("serviceExposeMap/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("serviceExposeMap/{id}?action=remove")
  Call<ServiceExposeMap> remove(@Path("id") String id);
  
}
