package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.AddRemoveClusterHostInput;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface AddRemoveClusterHostInputService {

  @GET("addRemoveClusterHostInput")
  Call<TypeCollection<AddRemoveClusterHostInput>> list();

  @GET("addRemoveClusterHostInput")
  Call<TypeCollection<AddRemoveClusterHostInput>> list(@QueryMap Filters filters);

  @GET("addRemoveClusterHostInput/{id}")
  Call<AddRemoveClusterHostInput> get(@Path("id") String id);

  @POST("addRemoveClusterHostInput")
  Call<AddRemoveClusterHostInput> create(@Body AddRemoveClusterHostInput addRemoveClusterHostInput);

  @PUT("addRemoveClusterHostInput/{id}")
  Call<AddRemoveClusterHostInput> update(@Path("id") String id, @Body AddRemoveClusterHostInput addRemoveClusterHostInput);

  @DELETE("addRemoveClusterHostInput/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
