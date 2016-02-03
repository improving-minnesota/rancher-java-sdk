package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.RestartPolicy;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface RestartPolicyService {

  @GET("restartPolicy")
  Call<TypeCollection<RestartPolicy>> list();

  @GET("restartPolicy")
  Call<TypeCollection<RestartPolicy>> list(@QueryMap Filters filters);

  @GET("restartPolicy/{id}")
  Call<RestartPolicy> get(@Path("id") String id);

  @POST("restartPolicy")
  Call<RestartPolicy> create(@Body RestartPolicy restartPolicy);

  @PUT("restartPolicy/{id}")
  Call<RestartPolicy> update(@Path("id") String id, @Body RestartPolicy restartPolicy);

  @DELETE("restartPolicy/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
