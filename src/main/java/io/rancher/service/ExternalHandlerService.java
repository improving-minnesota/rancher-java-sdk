package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ExternalHandler;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ExternalHandlerService {

  @GET("externalHandler")
  Call<TypeCollection<ExternalHandler>> list();

  @GET("externalHandler")
  Call<TypeCollection<ExternalHandler>> list(@QueryMap Filters filters);

  @GET("externalHandler/{id}")
  Call<ExternalHandler> get(@Path("id") String id);

  @POST("externalHandler")
  Call<ExternalHandler> create(@Body ExternalHandler externalHandler);

  @PUT("externalHandler/{id}")
  Call<ExternalHandler> update(@Path("id") String id, @Body ExternalHandler externalHandler);

  @DELETE("externalHandler/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("externalHandler/{id}?action=activate")
  Call<ExternalHandler> activate(@Path("id") String id);
  
  @POST("externalHandler/{id}?action=deactivate")
  Call<ExternalHandler> deactivate(@Path("id") String id);
  
  @POST("externalHandler/{id}?action=purge")
  Call<ExternalHandler> purge(@Path("id") String id);
  
  @POST("externalHandler/{id}?action=remove")
  Call<ExternalHandler> remove(@Path("id") String id);
  
  @POST("externalHandler/{id}?action=restore")
  Call<ExternalHandler> restore(@Path("id") String id);
  
}
