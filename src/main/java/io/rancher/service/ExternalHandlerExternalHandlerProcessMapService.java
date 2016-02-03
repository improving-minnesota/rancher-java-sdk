package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ExternalHandlerExternalHandlerProcessMap;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ExternalHandlerExternalHandlerProcessMapService {

  @GET("externalHandlerExternalHandlerProcessMap")
  Call<TypeCollection<ExternalHandlerExternalHandlerProcessMap>> list();

  @GET("externalHandlerExternalHandlerProcessMap")
  Call<TypeCollection<ExternalHandlerExternalHandlerProcessMap>> list(@QueryMap Filters filters);

  @GET("externalHandlerExternalHandlerProcessMap/{id}")
  Call<ExternalHandlerExternalHandlerProcessMap> get(@Path("id") String id);

  @POST("externalHandlerExternalHandlerProcessMap")
  Call<ExternalHandlerExternalHandlerProcessMap> create(@Body ExternalHandlerExternalHandlerProcessMap externalHandlerExternalHandlerProcessMap);

  @PUT("externalHandlerExternalHandlerProcessMap/{id}")
  Call<ExternalHandlerExternalHandlerProcessMap> update(@Path("id") String id, @Body ExternalHandlerExternalHandlerProcessMap externalHandlerExternalHandlerProcessMap);

  @DELETE("externalHandlerExternalHandlerProcessMap/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("externalHandlerExternalHandlerProcessMap/{id}?action=activate")
  Call<ExternalHandlerExternalHandlerProcessMap> activate(@Path("id") String id);
  
  @POST("externalHandlerExternalHandlerProcessMap/{id}?action=deactivate")
  Call<ExternalHandlerExternalHandlerProcessMap> deactivate(@Path("id") String id);
  
  @POST("externalHandlerExternalHandlerProcessMap/{id}?action=purge")
  Call<ExternalHandlerExternalHandlerProcessMap> purge(@Path("id") String id);
  
  @POST("externalHandlerExternalHandlerProcessMap/{id}?action=remove")
  Call<ExternalHandlerExternalHandlerProcessMap> remove(@Path("id") String id);
  
  @POST("externalHandlerExternalHandlerProcessMap/{id}?action=restore")
  Call<ExternalHandlerExternalHandlerProcessMap> restore(@Path("id") String id);
  
}
