package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.Volume;
import io.rancher.type.RestoreFromBackupInput;
import io.rancher.type.RevertToSnapshotInput;
import io.rancher.type.VolumeSnapshotInput;
import io.rancher.type.Snapshot;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface VolumeService {

  @GET("volume")
  Call<TypeCollection<Volume>> list();

  @GET("volume")
  Call<TypeCollection<Volume>> list(@QueryMap HashMap<String,String> filters);

  @GET("volume/{id}")
  Call<Volume> get(@Path("id") String id);

  @POST("volume")
  Call<Volume> create(@Body Volume volume);

  @PUT("volume/{id}")
  Call<Volume> update(@Path("id") String id, @Body Volume volume);

  @DELETE("volume/{id}")
  Call<Void> delete(@Path("id") String id);
  
  @POST("volume/{id}?action=allocate")
  Call<Volume> allocate(@Path("id") String id);
  
  @POST("volume/{id}?action=deallocate")
  Call<Volume> deallocate(@Path("id") String id);
  
  @POST("volume/{id}?action=purge")
  Call<Volume> purge(@Path("id") String id);
  
  @POST("volume/{id}?action=remove")
  Call<Volume> remove(@Path("id") String id);
  
  @POST("volume/{id}?action=restorefrombackup")
  Call<Volume> restorefrombackup(@Path("id") String id, @Body RestoreFromBackupInput restoreFromBackupInput);
  
  @POST("volume/{id}?action=reverttosnapshot")
  Call<Volume> reverttosnapshot(@Path("id") String id, @Body RevertToSnapshotInput revertToSnapshotInput);
  
  @POST("volume/{id}?action=snapshot")
  Call<Snapshot> snapshot(@Path("id") String id, @Body VolumeSnapshotInput volumeSnapshotInput);
  
}
