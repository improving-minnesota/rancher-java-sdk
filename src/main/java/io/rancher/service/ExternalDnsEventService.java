package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ExternalDnsEvent;
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

public interface ExternalDnsEventService {

  @GET("externalDnsEvent")
  Call<TypeCollection<ExternalDnsEvent>> list();

  @GET("externalDnsEvent")
  Call<TypeCollection<ExternalDnsEvent>> list(@QueryMap Filters filters);

  @GET("externalDnsEvent/{id}")
  Call<ExternalDnsEvent> get(@Path("id") String id);

  @POST("externalDnsEvent")
  Call<ExternalDnsEvent> create(@Body ExternalDnsEvent externalDnsEvent);

  @PUT("externalDnsEvent/{id}")
  Call<ExternalDnsEvent> update(@Path("id") String id, @Body ExternalDnsEvent externalDnsEvent);

  @DELETE("externalDnsEvent/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("externalDnsEvent/{id}?action=remove")
  Call<ExternalEvent> remove(@Path("id") String id);
  
}
