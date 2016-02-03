package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.StatsAccess;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface StatsAccessService {

  @GET("statsAccess")
  Call<TypeCollection<StatsAccess>> list();

  @GET("statsAccess")
  Call<TypeCollection<StatsAccess>> list(@QueryMap Filters filters);

  @GET("statsAccess/{id}")
  Call<StatsAccess> get(@Path("id") String id);

  @POST("statsAccess")
  Call<StatsAccess> create(@Body StatsAccess statsAccess);

  @PUT("statsAccess/{id}")
  Call<StatsAccess> update(@Path("id") String id, @Body StatsAccess statsAccess);

  @DELETE("statsAccess/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
