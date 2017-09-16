package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.PullTask;
import io.rancher.type.GenericObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface PullTaskService {

  @GET("pullTask")
  Call<TypeCollection<PullTask>> list();

  @GET("pullTask")
  Call<TypeCollection<PullTask>> list(@QueryMap HashMap<String,String> filters);

  @GET("pullTask/{id}")
  Call<PullTask> get(@Path("id") String id);

  @POST("pullTask")
  Call<PullTask> create(@Body PullTask pullTask);

  @PUT("pullTask/{id}")
  Call<PullTask> update(@Path("id") String id, @Body PullTask pullTask);

  @DELETE("pullTask/{id}")
  Call<Void> delete(@Path("id") String id);
  
  @POST("pullTask/{id}?action=remove")
  Call<GenericObject> remove(@Path("id") String id);
  
}
