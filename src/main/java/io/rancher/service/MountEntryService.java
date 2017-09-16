package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.MountEntry;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface MountEntryService {

  @GET("mountEntry")
  Call<TypeCollection<MountEntry>> list();

  @GET("mountEntry")
  Call<TypeCollection<MountEntry>> list(@QueryMap HashMap<String,String> filters);

  @GET("mountEntry/{id}")
  Call<MountEntry> get(@Path("id") String id);

  @POST("mountEntry")
  Call<MountEntry> create(@Body MountEntry mountEntry);

  @PUT("mountEntry/{id}")
  Call<MountEntry> update(@Path("id") String id, @Body MountEntry mountEntry);

  @DELETE("mountEntry/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
