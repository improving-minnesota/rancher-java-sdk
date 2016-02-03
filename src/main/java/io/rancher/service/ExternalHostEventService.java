package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ExternalHostEvent;
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

public interface ExternalHostEventService {

  @GET("externalHostEvent")
  Call<TypeCollection<ExternalHostEvent>> list();

  @GET("externalHostEvent")
  Call<TypeCollection<ExternalHostEvent>> list(@QueryMap Filters filters);

  @GET("externalHostEvent/{id}")
  Call<ExternalHostEvent> get(@Path("id") String id);

  @POST("externalHostEvent")
  Call<ExternalHostEvent> create(@Body ExternalHostEvent externalHostEvent);

  @PUT("externalHostEvent/{id}")
  Call<ExternalHostEvent> update(@Path("id") String id, @Body ExternalHostEvent externalHostEvent);

  @DELETE("externalHostEvent/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("externalHostEvent/{id}?action=remove")
  Call<ExternalEvent> remove(@Path("id") String id);
  
}
