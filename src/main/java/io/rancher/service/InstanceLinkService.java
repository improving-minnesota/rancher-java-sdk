package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.InstanceLink;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface InstanceLinkService {

  @GET("instanceLink")
  Call<TypeCollection<InstanceLink>> list();

  @GET("instanceLink")
  Call<TypeCollection<InstanceLink>> list(@QueryMap Filters filters);

  @GET("instanceLink/{id}")
  Call<InstanceLink> get(@Path("id") String id);

  @POST("instanceLink")
  Call<InstanceLink> create(@Body InstanceLink instanceLink);

  @PUT("instanceLink/{id}")
  Call<InstanceLink> update(@Path("id") String id, @Body InstanceLink instanceLink);

  @DELETE("instanceLink/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("instanceLink/{id}?action=activate")
  Call<InstanceLink> activate(@Path("id") String id);
  
  @POST("instanceLink/{id}?action=deactivate")
  Call<InstanceLink> deactivate(@Path("id") String id);
  
  @POST("instanceLink/{id}?action=purge")
  Call<InstanceLink> purge(@Path("id") String id);
  
  @POST("instanceLink/{id}?action=remove")
  Call<InstanceLink> remove(@Path("id") String id);
  
  @POST("instanceLink/{id}?action=restore")
  Call<InstanceLink> restore(@Path("id") String id);
  
}
