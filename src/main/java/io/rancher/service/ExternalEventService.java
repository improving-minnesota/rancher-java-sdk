package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
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

public interface ExternalEventService {

  @GET("externalEvent")
  Call<TypeCollection<ExternalEvent>> list();

  @GET("externalEvent")
  Call<TypeCollection<ExternalEvent>> list(@QueryMap Filters filters);

  @GET("externalEvent/{id}")
  Call<ExternalEvent> get(@Path("id") String id);

  @POST("externalEvent")
  Call<ExternalEvent> create(@Body ExternalEvent externalEvent);

  @PUT("externalEvent/{id}")
  Call<ExternalEvent> update(@Path("id") String id, @Body ExternalEvent externalEvent);

  @DELETE("externalEvent/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("externalEvent/{id}?action=remove")
  Call<ExternalEvent> remove(@Path("id") String id);
  
}
