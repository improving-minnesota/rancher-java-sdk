package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.ServiceEvent;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ServiceEventService {

  @GET("serviceEvent")
  Call<TypeCollection<ServiceEvent>> list();

  @GET("serviceEvent")
  Call<TypeCollection<ServiceEvent>> list(@QueryMap HashMap<String,String> filters);

  @GET("serviceEvent/{id}")
  Call<ServiceEvent> get(@Path("id") String id);

  @POST("serviceEvent")
  Call<ServiceEvent> create(@Body ServiceEvent serviceEvent);

  @PUT("serviceEvent/{id}")
  Call<ServiceEvent> update(@Path("id") String id, @Body ServiceEvent serviceEvent);

  @DELETE("serviceEvent/{id}")
  Call<Void> delete(@Path("id") String id);
  
  @POST("serviceEvent/{id}?action=remove")
  Call<ServiceEvent> remove(@Path("id") String id);
  
}
