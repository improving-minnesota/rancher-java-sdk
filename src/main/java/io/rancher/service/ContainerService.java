package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Container;
import io.rancher.type.ContainerLogs;
import io.rancher.type.Instance;
import io.rancher.type.InstanceStop;
import io.rancher.type.InstanceConsoleInput;
import io.rancher.type.InstanceConsole;
import io.rancher.type.ContainerExec;
import io.rancher.type.HostAccess;
import io.rancher.type.SetLabelsInput;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ContainerService {

  @GET("container")
  Call<TypeCollection<Container>> list();

  @GET("container")
  Call<TypeCollection<Container>> list(@QueryMap Filters filters);

  @GET("container/{id}")
  Call<Container> get(@Path("id") String id);

  @POST("container")
  Call<Container> create(@Body Container container);

  @PUT("container/{id}")
  Call<Container> update(@Path("id") String id, @Body Container container);

  @DELETE("container/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("container/{id}?action=allocate")
  Call<Instance> allocate(@Path("id") String id);
  
  @POST("container/{id}?action=console")
  Call<InstanceConsole> console(@Path("id") String id, @Body InstanceConsoleInput instanceConsoleInput);
  
  @POST("container/{id}?action=deallocate")
  Call<Instance> deallocate(@Path("id") String id);
  
  @POST("container/{id}?action=execute")
  Call<HostAccess> execute(@Path("id") String id, @Body ContainerExec containerExec);
  
  @POST("container/{id}?action=logs")
  Call<HostAccess> logs(@Path("id") String id, @Body ContainerLogs containerLogs);
  
  @POST("container/{id}?action=migrate")
  Call<Instance> migrate(@Path("id") String id);
  
  @POST("container/{id}?action=purge")
  Call<Instance> purge(@Path("id") String id);
  
  @POST("container/{id}?action=remove")
  Call<Instance> remove(@Path("id") String id);
  
  @POST("container/{id}?action=restart")
  Call<Instance> restart(@Path("id") String id);
  
  @POST("container/{id}?action=restore")
  Call<Instance> restore(@Path("id") String id);
  
  @POST("container/{id}?action=setlabels")
  Call<Container> setlabels(@Path("id") String id, @Body SetLabelsInput setLabelsInput);
  
  @POST("container/{id}?action=start")
  Call<Instance> start(@Path("id") String id);
  
  @POST("container/{id}?action=stop")
  Call<Instance> stop(@Path("id") String id, @Body InstanceStop instanceStop);
  
  @POST("container/{id}?action=updatehealthy")
  Call<Instance> updatehealthy(@Path("id") String id);
  
  @POST("container/{id}?action=updatereinitializing")
  Call<Instance> updatereinitializing(@Path("id") String id);
  
  @POST("container/{id}?action=updateunhealthy")
  Call<Instance> updateunhealthy(@Path("id") String id);
  
}
