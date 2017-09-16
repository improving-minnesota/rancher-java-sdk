package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.Backup;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface BackupService {

  @GET("backup")
  Call<TypeCollection<Backup>> list();

  @GET("backup")
  Call<TypeCollection<Backup>> list(@QueryMap HashMap<String,String> filters);

  @GET("backup/{id}")
  Call<Backup> get(@Path("id") String id);

  @POST("backup")
  Call<Backup> create(@Body Backup backup);

  @PUT("backup/{id}")
  Call<Backup> update(@Path("id") String id, @Body Backup backup);

  @DELETE("backup/{id}")
  Call<Void> delete(@Path("id") String id);
  
  @POST("backup/{id}?action=remove")
  Call<Backup> remove(@Path("id") String id);
  
}
