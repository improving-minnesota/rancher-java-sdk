package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ExternalStoragePoolEvent;
import io.rancher.type.ExternalEvent;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ExternalStoragePoolEventService {

  @GET("externalStoragePoolEvent")
  Call<TypeCollection<ExternalStoragePoolEvent>> list();

  @GET("externalStoragePoolEvent")
  Call<TypeCollection<ExternalStoragePoolEvent>> list(@QueryMap Filters filters);

  @GET("externalStoragePoolEvent/{id}")
  Call<ExternalStoragePoolEvent> get(@Path("id") String id);

  @POST("externalStoragePoolEvent")
  Call<ExternalStoragePoolEvent> create(@Body ExternalStoragePoolEvent externalStoragePoolEvent);

  @PUT("externalStoragePoolEvent/{id}")
  Call<ExternalStoragePoolEvent> update(@Path("id") String id, @Body ExternalStoragePoolEvent externalStoragePoolEvent);

  @DELETE("externalStoragePoolEvent/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("externalStoragePoolEvent/{id}?action=remove")
  Call<ExternalEvent> remove(@Path("id") String id);
  
}
