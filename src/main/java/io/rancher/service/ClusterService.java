package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Cluster;
import io.rancher.type.AddRemoveClusterHostInput;
import io.rancher.type.HostAccess;
import io.rancher.type.Host;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ClusterService {

  @GET("cluster")
  Call<TypeCollection<Cluster>> list();

  @GET("cluster")
  Call<TypeCollection<Cluster>> list(@QueryMap Filters filters);

  @GET("cluster/{id}")
  Call<Cluster> get(@Path("id") String id);

  @POST("cluster")
  Call<Cluster> create(@Body Cluster cluster);

  @PUT("cluster/{id}")
  Call<Cluster> update(@Path("id") String id, @Body Cluster cluster);

  @DELETE("cluster/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("cluster/{id}?action=activate")
  Call<Host> activate(@Path("id") String id);
  
  @POST("cluster/{id}?action=addhost")
  Call<Cluster> addhost(@Path("id") String id, @Body AddRemoveClusterHostInput addRemoveClusterHostInput);
  
  @POST("cluster/{id}?action=deactivate")
  Call<Host> deactivate(@Path("id") String id);
  
  @POST("cluster/{id}?action=dockersocket")
  Call<HostAccess> dockersocket(@Path("id") String id);
  
  @POST("cluster/{id}?action=purge")
  Call<Host> purge(@Path("id") String id);
  
  @POST("cluster/{id}?action=remove")
  Call<Host> remove(@Path("id") String id);
  
  @POST("cluster/{id}?action=removehost")
  Call<Cluster> removehost(@Path("id") String id, @Body AddRemoveClusterHostInput addRemoveClusterHostInput);
  
  @POST("cluster/{id}?action=restore")
  Call<Host> restore(@Path("id") String id);
  
}
