package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.RevertToSnapshotInput;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface RevertToSnapshotInputService {

  @GET("revertToSnapshotInput")
  Call<TypeCollection<RevertToSnapshotInput>> list();

  @GET("revertToSnapshotInput")
  Call<TypeCollection<RevertToSnapshotInput>> list(@QueryMap Filters filters);

  @GET("revertToSnapshotInput/{id}")
  Call<RevertToSnapshotInput> get(@Path("id") String id);

  @POST("revertToSnapshotInput")
  Call<RevertToSnapshotInput> create(@Body RevertToSnapshotInput revertToSnapshotInput);

  @PUT("revertToSnapshotInput/{id}")
  Call<RevertToSnapshotInput> update(@Path("id") String id, @Body RevertToSnapshotInput revertToSnapshotInput);

  @DELETE("revertToSnapshotInput/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
