package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.RecreateOnQuorumStrategyConfig;

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

public interface RecreateOnQuorumStrategyConfigService {

  @GET("recreateOnQuorumStrategyConfig")
  Call<TypeCollection<RecreateOnQuorumStrategyConfig>> list();

  @GET("recreateOnQuorumStrategyConfig")
  Call<TypeCollection<RecreateOnQuorumStrategyConfig>> list(@QueryMap Filters<String, String> filters);

  @GET("recreateOnQuorumStrategyConfig/{id}")
  Call<RecreateOnQuorumStrategyConfig> get(@Path("id") String id);

  @POST("recreateOnQuorumStrategyConfig")
  Call<RecreateOnQuorumStrategyConfig> create(@Body RecreateOnQuorumStrategyConfig recreateOnQuorumStrategyConfig);

  @PUT("recreateOnQuorumStrategyConfig/{id}")
  Call<RecreateOnQuorumStrategyConfig> update(@Path("id") String id, @Body RecreateOnQuorumStrategyConfig recreateOnQuorumStrategyConfig);

  @DELETE("recreateOnQuorumStrategyConfig/{id}")
  Call<Response> delete(@Path("id") String id);
  

  
}
