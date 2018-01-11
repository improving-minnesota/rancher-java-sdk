package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.DockerBuild;

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

public interface DockerBuildService {

  @GET("dockerBuild")
  Call<TypeCollection<DockerBuild>> list();

  @GET("dockerBuild")
  Call<TypeCollection<DockerBuild>> list(@QueryMap Filters<String, String> filters);

  @GET("dockerBuild/{id}")
  Call<DockerBuild> get(@Path("id") String id);

  @POST("dockerBuild")
  Call<DockerBuild> create(@Body DockerBuild dockerBuild);

  @PUT("dockerBuild/{id}")
  Call<DockerBuild> update(@Path("id") String id, @Body DockerBuild dockerBuild);

  @DELETE("dockerBuild/{id}")
  Call<Response> delete(@Path("id") String id);
  

  
}
