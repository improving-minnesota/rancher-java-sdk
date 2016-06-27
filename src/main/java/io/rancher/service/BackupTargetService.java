package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.BackupTarget;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface BackupTargetService {

  @GET("backupTarget")
  Call<TypeCollection<BackupTarget>> list();

  @GET("backupTarget")
  Call<TypeCollection<BackupTarget>> list(@QueryMap Filters filters);

  @GET("backupTarget/{id}")
  Call<BackupTarget> get(@Path("id") String id);

  @POST("backupTarget")
  Call<BackupTarget> create(@Body BackupTarget backupTarget);

  @PUT("backupTarget/{id}")
  Call<BackupTarget> update(@Path("id") String id, @Body BackupTarget backupTarget);

  @DELETE("backupTarget/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("backupTarget/{id}?action=remove")
  Call<BackupTarget> remove(@Path("id") String id);
  
}
