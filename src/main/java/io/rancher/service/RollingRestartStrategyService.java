package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.RollingRestartStrategy;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface RollingRestartStrategyService {

  @GET("rollingRestartStrategy")
  Call<TypeCollection<RollingRestartStrategy>> list();

  @GET("rollingRestartStrategy")
  Call<TypeCollection<RollingRestartStrategy>> list(@QueryMap HashMap<String,String> filters);

  @GET("rollingRestartStrategy/{id}")
  Call<RollingRestartStrategy> get(@Path("id") String id);

  @POST("rollingRestartStrategy")
  Call<RollingRestartStrategy> create(@Body RollingRestartStrategy rollingRestartStrategy);

  @PUT("rollingRestartStrategy/{id}")
  Call<RollingRestartStrategy> update(@Path("id") String id, @Body RollingRestartStrategy rollingRestartStrategy);

  @DELETE("rollingRestartStrategy/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
