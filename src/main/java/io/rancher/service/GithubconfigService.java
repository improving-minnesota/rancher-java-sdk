package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Githubconfig;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface GithubconfigService {

  @GET("githubconfig")
  Call<TypeCollection<Githubconfig>> list();

  @GET("githubconfig")
  Call<TypeCollection<Githubconfig>> list(@QueryMap Filters filters);

  @GET("githubconfig/{id}")
  Call<Githubconfig> get(@Path("id") String id);

  @POST("githubconfig")
  Call<Githubconfig> create(@Body Githubconfig githubconfig);

  @PUT("githubconfig/{id}")
  Call<Githubconfig> update(@Path("id") String id, @Body Githubconfig githubconfig);

  @DELETE("githubconfig/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
