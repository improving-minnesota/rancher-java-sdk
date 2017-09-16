package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.Snapshot;
import io.rancher.type.SnapshotBackupInput;
import io.rancher.type.Backup;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface SnapshotService {

  @GET("snapshot")
  Call<TypeCollection<Snapshot>> list();

  @GET("snapshot")
  Call<TypeCollection<Snapshot>> list(@QueryMap HashMap<String,String> filters);

  @GET("snapshot/{id}")
  Call<Snapshot> get(@Path("id") String id);

  @POST("snapshot")
  Call<Snapshot> create(@Body Snapshot snapshot);

  @PUT("snapshot/{id}")
  Call<Snapshot> update(@Path("id") String id, @Body Snapshot snapshot);

  @DELETE("snapshot/{id}")
  Call<Void> delete(@Path("id") String id);
  
  @POST("snapshot/{id}?action=backup")
  Call<Backup> backup(@Path("id") String id, @Body SnapshotBackupInput snapshotBackupInput);
  
  @POST("snapshot/{id}?action=remove")
  Call<Snapshot> remove(@Path("id") String id);
  
}
