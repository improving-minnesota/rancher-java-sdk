package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Agent;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface AgentService {

  @GET("agent")
  Call<TypeCollection<Agent>> list();

  @GET("agent")
  Call<TypeCollection<Agent>> list(@QueryMap Filters filters);

  @GET("agent/{id}")
  Call<Agent> get(@Path("id") String id);

  @POST("agent")
  Call<Agent> create(@Body Agent agent);

  @PUT("agent/{id}")
  Call<Agent> update(@Path("id") String id, @Body Agent agent);

  @DELETE("agent/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("agent/{id}?action=activate")
  Call<Agent> activate(@Path("id") String id);
  
  @POST("agent/{id}?action=deactivate")
  Call<Agent> deactivate(@Path("id") String id);
  
  @POST("agent/{id}?action=purge")
  Call<Agent> purge(@Path("id") String id);
  
  @POST("agent/{id}?action=reconnect")
  Call<Agent> reconnect(@Path("id") String id);
  
  @POST("agent/{id}?action=remove")
  Call<Agent> remove(@Path("id") String id);
  
  @POST("agent/{id}?action=restore")
  Call<Agent> restore(@Path("id") String id);
  
}
