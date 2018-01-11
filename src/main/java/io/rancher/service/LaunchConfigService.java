package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.LaunchConfig;
import io.rancher.type.Account;
import io.rancher.type.Agent;
import io.rancher.type.Container;
import io.rancher.type.ContainerExec;
import io.rancher.type.ContainerProxy;
import io.rancher.type.Credential;
import io.rancher.type.Host;
import io.rancher.type.HostAccess;
import io.rancher.type.Instance;
import io.rancher.type.InstanceConsole;
import io.rancher.type.InstanceConsoleInput;
import io.rancher.type.InstanceStop;
import io.rancher.type.Mount;
import io.rancher.type.Port;
import io.rancher.type.Service;
import io.rancher.type.SetLabelsInput;
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

public interface LaunchConfigService {

  @GET("launchConfig")
  Call<TypeCollection<LaunchConfig>> list();

  @GET("launchConfig")
  Call<TypeCollection<LaunchConfig>> list(@QueryMap Filters<String, String> filters);

  @GET("launchConfig/{id}")
  Call<LaunchConfig> get(@Path("id") String id);

  @POST("launchConfig")
  Call<LaunchConfig> create(@Body LaunchConfig launchConfig);

  @PUT("launchConfig/{id}")
  Call<LaunchConfig> update(@Path("id") String id, @Body LaunchConfig launchConfig);

  @DELETE("launchConfig/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("launchConfig/{id}?action=allocate")
  Call<Instance> allocate(@Path("id") String id);
  
  @POST("launchConfig/{id}?action=console")
  Call<InstanceConsole> console(@Path("id") String id, @Body InstanceConsoleInput instanceConsoleInput);
  
  @POST("launchConfig/{id}?action=deallocate")
  Call<Instance> deallocate(@Path("id") String id);
  
  @POST("launchConfig/{id}?action=error")
  Call<Instance> error(@Path("id") String id);
  
  @POST("launchConfig/{id}?action=execute")
  Call<HostAccess> execute(@Path("id") String id, @Body ContainerExec containerExec);
  
  @POST("launchConfig/{id}?action=migrate")
  Call<Instance> migrate(@Path("id") String id);
  
  @POST("launchConfig/{id}?action=proxy")
  Call<HostAccess> proxy(@Path("id") String id, @Body ContainerProxy containerProxy);
  
  @POST("launchConfig/{id}?action=purge")
  Call<Instance> purge(@Path("id") String id);
  
  @POST("launchConfig/{id}?action=remove")
  Call<Instance> remove(@Path("id") String id);
  
  @POST("launchConfig/{id}?action=restart")
  Call<Instance> restart(@Path("id") String id);
  
  @POST("launchConfig/{id}?action=restore")
  Call<Instance> restore(@Path("id") String id);
  
  @POST("launchConfig/{id}?action=setlabels")
  Call<Container> setlabels(@Path("id") String id, @Body SetLabelsInput setLabelsInput);
  
  @POST("launchConfig/{id}?action=start")
  Call<Instance> start(@Path("id") String id);
  
  @POST("launchConfig/{id}?action=stop")
  Call<Instance> stop(@Path("id") String id, @Body InstanceStop instanceStop);
  
  @POST("launchConfig/{id}?action=updatehealthy")
  Call<Instance> updatehealthy(@Path("id") String id);
  
  @POST("launchConfig/{id}?action=updatereinitializing")
  Call<Instance> updatereinitializing(@Path("id") String id);
  
  @POST("launchConfig/{id}?action=updateunhealthy")
  Call<Instance> updateunhealthy(@Path("id") String id);
  

  
  @GET
  Call<Account> getLinkAccount(@Url String url );
  
  @GET
  Call<Agent> getLinkAgent(@Url String url );
  
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
