package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.ExternalHandlerProcess;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ExternalHandlerProcessService {

  @GET("externalHandlerProcess")
  Call<TypeCollection<ExternalHandlerProcess>> list();

  @GET("externalHandlerProcess")
  Call<TypeCollection<ExternalHandlerProcess>> list(@QueryMap HashMap<String,String> filters);

  @GET("externalHandlerProcess/{id}")
  Call<ExternalHandlerProcess> get(@Path("id") String id);

  @POST("externalHandlerProcess")
  Call<ExternalHandlerProcess> create(@Body ExternalHandlerProcess externalHandlerProcess);

  @PUT("externalHandlerProcess/{id}")
  Call<ExternalHandlerProcess> update(@Path("id") String id, @Body ExternalHandlerProcess externalHandlerProcess);

  @DELETE("externalHandlerProcess/{id}")
  Call<Void> delete(@Path("id") String id);
  
  @POST("externalHandlerProcess/{id}?action=activate")
  Call<ExternalHandlerProcess> activate(@Path("id") String id);
  
  @POST("externalHandlerProcess/{id}?action=deactivate")
  Call<ExternalHandlerProcess> deactivate(@Path("id") String id);
  
  @POST("externalHandlerProcess/{id}?action=purge")
  Call<ExternalHandlerProcess> purge(@Path("id") String id);
  
  @POST("externalHandlerProcess/{id}?action=remove")
  Call<ExternalHandlerProcess> remove(@Path("id") String id);
  
}
