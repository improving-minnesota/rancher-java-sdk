package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.Mount;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface MountService {

  @GET("mount")
  Call<TypeCollection<Mount>> list();

  @GET("mount")
  Call<TypeCollection<Mount>> list(@QueryMap HashMap<String,String> filters);

  @GET("mount/{id}")
  Call<Mount> get(@Path("id") String id);

  @POST("mount")
  Call<Mount> create(@Body Mount mount);

  @PUT("mount/{id}")
  Call<Mount> update(@Path("id") String id, @Body Mount mount);

  @DELETE("mount/{id}")
  Call<Void> delete(@Path("id") String id);
  
  @POST("mount/{id}?action=deactivate")
  Call<Mount> deactivate(@Path("id") String id);
  
  @POST("mount/{id}?action=remove")
  Call<Mount> remove(@Path("id") String id);
  
}
