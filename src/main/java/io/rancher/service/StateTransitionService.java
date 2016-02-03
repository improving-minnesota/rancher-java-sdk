package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.StateTransition;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface StateTransitionService {

  @GET("stateTransition")
  Call<TypeCollection<StateTransition>> list();

  @GET("stateTransition")
  Call<TypeCollection<StateTransition>> list(@QueryMap Filters filters);

  @GET("stateTransition/{id}")
  Call<StateTransition> get(@Path("id") String id);

  @POST("stateTransition")
  Call<StateTransition> create(@Body StateTransition stateTransition);

  @PUT("stateTransition/{id}")
  Call<StateTransition> update(@Path("id") String id, @Body StateTransition stateTransition);

  @DELETE("stateTransition/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
