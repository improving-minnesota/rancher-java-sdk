package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.ExternalServiceEvent;
import io.rancher.type.ExternalEvent;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ExternalServiceEventService {

  @GET("externalServiceEvent")
  Call<TypeCollection<ExternalServiceEvent>> list();

  @GET("externalServiceEvent")
  Call<TypeCollection<ExternalServiceEvent>> list(@QueryMap HashMap<String,String> filters);

  @GET("externalServiceEvent/{id}")
  Call<ExternalServiceEvent> get(@Path("id") String id);

  @POST("externalServiceEvent")
  Call<ExternalServiceEvent> create(@Body ExternalServiceEvent externalServiceEvent);

  @PUT("externalServiceEvent/{id}")
  Call<ExternalServiceEvent> update(@Path("id") String id, @Body ExternalServiceEvent externalServiceEvent);

  @DELETE("externalServiceEvent/{id}")
  Call<Void> delete(@Path("id") String id);
  
  @POST("externalServiceEvent/{id}?action=remove")
  Call<ExternalEvent> remove(@Path("id") String id);
  
}
