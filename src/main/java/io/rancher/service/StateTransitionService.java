package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.StateTransition;

import retrofit2.Call;
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
  Call<TypeCollection<StateTransition>> list(@QueryMap HashMap<String,String> filters);

  @GET("stateTransition/{id}")
  Call<StateTransition> get(@Path("id") String id);

  @POST("stateTransition")
  Call<StateTransition> create(@Body StateTransition stateTransition);

  @PUT("stateTransition/{id}")
  Call<StateTransition> update(@Path("id") String id, @Body StateTransition stateTransition);

  @DELETE("stateTransition/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
