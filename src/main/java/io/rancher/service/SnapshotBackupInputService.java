package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.SnapshotBackupInput;
import io.rancher.type.Backup;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface SnapshotBackupInputService {

  @GET("snapshotBackupInput")
  Call<TypeCollection<SnapshotBackupInput>> list();

  @GET("snapshotBackupInput")
  Call<TypeCollection<SnapshotBackupInput>> list(@QueryMap Filters filters);

  @GET("snapshotBackupInput/{id}")
  Call<SnapshotBackupInput> get(@Path("id") String id);

  @POST("snapshotBackupInput")
  Call<SnapshotBackupInput> create(@Body SnapshotBackupInput snapshotBackupInput);

  @PUT("snapshotBackupInput/{id}")
  Call<SnapshotBackupInput> update(@Path("id") String id, @Body SnapshotBackupInput snapshotBackupInput);

  @DELETE("snapshotBackupInput/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("snapshotBackupInput/{id}?action=remove")
  Call<Backup> remove(@Path("id") String id);
  
}
