package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.HostAccess;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface HostAccessService {

  @GET("hostAccess")
  Call<TypeCollection<HostAccess>> list();

  @GET("hostAccess")
  Call<TypeCollection<HostAccess>> list(@QueryMap HashMap<String,String> filters);

  @GET("hostAccess/{id}")
  Call<HostAccess> get(@Path("id") String id);

  @POST("hostAccess")
  Call<HostAccess> create(@Body HostAccess hostAccess);

  @PUT("hostAccess/{id}")
  Call<HostAccess> update(@Path("id") String id, @Body HostAccess hostAccess);

  @DELETE("hostAccess/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
