package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Host;
import io.rancher.type.Account;
import io.rancher.type.Agent;
import io.rancher.type.Host;
import io.rancher.type.HostAccess;
import io.rancher.type.Instance;
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

public interface HostService {

  @GET("host")
  Call<TypeCollection<Host>> list();

  @GET("host")
  Call<TypeCollection<Host>> list(@QueryMap Filters<String, String> filters);

  @GET("host/{id}")
  Call<Host> get(@Path("id") String id);

  @POST("host")
  Call<Host> create(@Body Host host);

  @PUT("host/{id}")
  Call<Host> update(@Path("id") String id, @Body Host host);

  @DELETE("host/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("host/{id}?action=activate")
  Call<Host> activate(@Path("id") String id);
  
  @POST("host/{id}?action=deactivate")
  Call<Host> deactivate(@Path("id") String id);
  
  @POST("host/{id}?action=dockersocket")
  Call<HostAccess> dockersocket(@Path("id") String id);
  
  @POST("host/{id}?action=purge")
  Call<Host> purge(@Path("id") String id);
  
  @POST("host/{id}?action=remove")
  Call<Host> remove(@Path("id") String id);
  
  @POST("host/{id}?action=restore")
  Call<Host> restore(@Path("id") String id);
  

  
  @GET
  Call<Account> getLinkAccount(@Url String url );
  
  @GET
  Call<Agent> getLinkAgent(@Url String url );
  
  @GET
  Call<TypeCollection<Host>> getLinkHosts(@Url String url );
  
  @GET
  Call<TypeCollection<Instance>> getLinkInstances(@Url String url );
  
  @GET
  Call<TypeCollection<Volume>> getLinkVolumes(@Url String url );
  
}
