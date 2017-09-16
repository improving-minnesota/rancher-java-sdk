package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.RestoreFromBackupInput;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface RestoreFromBackupInputService {

  @GET("restoreFromBackupInput")
  Call<TypeCollection<RestoreFromBackupInput>> list();

  @GET("restoreFromBackupInput")
  Call<TypeCollection<RestoreFromBackupInput>> list(@QueryMap HashMap<String,String> filters);

  @GET("restoreFromBackupInput/{id}")
  Call<RestoreFromBackupInput> get(@Path("id") String id);

  @POST("restoreFromBackupInput")
  Call<RestoreFromBackupInput> create(@Body RestoreFromBackupInput restoreFromBackupInput);

  @PUT("restoreFromBackupInput/{id}")
  Call<RestoreFromBackupInput> update(@Path("id") String id, @Body RestoreFromBackupInput restoreFromBackupInput);

  @DELETE("restoreFromBackupInput/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
