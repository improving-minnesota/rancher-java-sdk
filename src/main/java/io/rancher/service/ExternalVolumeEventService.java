package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.ExternalVolumeEvent;
import io.rancher.type.ExternalEvent;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ExternalVolumeEventService {

  @GET("externalVolumeEvent")
  Call<TypeCollection<ExternalVolumeEvent>> list();

  @GET("externalVolumeEvent")
  Call<TypeCollection<ExternalVolumeEvent>> list(@QueryMap HashMap<String,String> filters);

  @GET("externalVolumeEvent/{id}")
  Call<ExternalVolumeEvent> get(@Path("id") String id);

  @POST("externalVolumeEvent")
  Call<ExternalVolumeEvent> create(@Body ExternalVolumeEvent externalVolumeEvent);

  @PUT("externalVolumeEvent/{id}")
  Call<ExternalVolumeEvent> update(@Path("id") String id, @Body ExternalVolumeEvent externalVolumeEvent);

  @DELETE("externalVolumeEvent/{id}")
  Call<Void> delete(@Path("id") String id);
  
  @POST("externalVolumeEvent/{id}?action=remove")
  Call<ExternalEvent> remove(@Path("id") String id);
  
}
