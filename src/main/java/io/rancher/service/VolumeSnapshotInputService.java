package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.VolumeSnapshotInput;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface VolumeSnapshotInputService {

  @GET("volumeSnapshotInput")
  Call<TypeCollection<VolumeSnapshotInput>> list();

  @GET("volumeSnapshotInput")
  Call<TypeCollection<VolumeSnapshotInput>> list(@QueryMap HashMap<String,String> filters);

  @GET("volumeSnapshotInput/{id}")
  Call<VolumeSnapshotInput> get(@Path("id") String id);

  @POST("volumeSnapshotInput")
  Call<VolumeSnapshotInput> create(@Body VolumeSnapshotInput volumeSnapshotInput);

  @PUT("volumeSnapshotInput/{id}")
  Call<VolumeSnapshotInput> update(@Path("id") String id, @Body VolumeSnapshotInput volumeSnapshotInput);

  @DELETE("volumeSnapshotInput/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
