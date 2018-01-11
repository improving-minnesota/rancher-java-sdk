package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Instance;
import io.rancher.type.Account;
import io.rancher.type.Credential;
import io.rancher.type.Host;
import io.rancher.type.Instance;
import io.rancher.type.InstanceConsole;
import io.rancher.type.InstanceConsoleInput;
import io.rancher.type.InstanceStop;
import io.rancher.type.Mount;
import io.rancher.type.Port;
import io.rancher.type.Service;
import io.rancher.type.Volume;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

public interface InstanceService {

  @GET("instance")
  Call<TypeCollection<Instance>> list();

  @GET("instance")
  Call<TypeCollection<Instance>> list(@QueryMap Filters<String, String> filters);

  @GET("instance/{id}")
  Call<Instance> get(@Path("id") String id);

  @POST("instance")
  Call<Instance> create(@Body Instance instance);

  @PUT("instance/{id}")
  Call<Instance> update(@Path("id") String id, @Body Instance instance);

  @DELETE("instance/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("instance/{id}?action=allocate")
  Call<Instance> allocate(@Path("id") String id);
  
  @POST("instance/{id}?action=console")
  Call<InstanceConsole> console(@Path("id") String id, @Body InstanceConsoleInput instanceConsoleInput);
  
  @POST("instance/{id}?action=deallocate")
  Call<Instance> deallocate(@Path("id") String id);
  
  @POST("instance/{id}?action=error")
  Call<Instance> error(@Path("id") String id);
  
  @POST("instance/{id}?action=migrate")
  Call<Instance> migrate(@Path("id") String id);
  
  @POST("instance/{id}?action=purge")
  Call<Instance> purge(@Path("id") String id);
  
  @POST("instance/{id}?action=remove")
  Call<Instance> remove(@Path("id") String id);
  
  @POST("instance/{id}?action=restart")
  Call<Instance> restart(@Path("id") String id);
  
  @POST("instance/{id}?action=restore")
  Call<Instance> restore(@Path("id") String id);
  
  @POST("instance/{id}?action=start")
  Call<Instance> start(@Path("id") String id);
  
  @POST("instance/{id}?action=stop")
  Call<Instance> stop(@Path("id") String id, @Body InstanceStop instanceStop);
  
  @POST("instance/{id}?action=updatehealthy")
  Call<Instance> updatehealthy(@Path("id") String id);
  
  @POST("instance/{id}?action=updatereinitializing")
  Call<Instance> updatereinitializing(@Path("id") String id);
  
  @POST("instance/{id}?action=updateunhealthy")
  Call<Instance> updateunhealthy(@Path("id") String id);
  

  
  @GET
  Call<Account> getLinkAccount(@Url String url );
  
  @GET
  Call<TypeCollection<Credential>> getLinkCredentials(@Url String url );
  
  @GET
  Call<TypeCollection<Host>> getLinkHosts(@Url String url );
  
  @GET
  Call<TypeCollection<Instance>> getLinkInstances(@Url String url );
  
  @GET
  Call<TypeCollection<Mount>> getLinkMounts(@Url String url );
  
  @GET
  Call<TypeCollection<Port>> getLinkPorts(@Url String url );
  
  @GET
  Call<TypeCollection<Service>> getLinkServices(@Url String url );
  
  @GET
  Call<TypeCollection<Volume>> getLinkVolumes(@Url String url );
  
}
