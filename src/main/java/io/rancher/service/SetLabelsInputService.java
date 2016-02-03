package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.SetLabelsInput;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface SetLabelsInputService {

  @GET("setLabelsInput")
  Call<TypeCollection<SetLabelsInput>> list();

  @GET("setLabelsInput")
  Call<TypeCollection<SetLabelsInput>> list(@QueryMap Filters filters);

  @GET("setLabelsInput/{id}")
  Call<SetLabelsInput> get(@Path("id") String id);

  @POST("setLabelsInput")
  Call<SetLabelsInput> create(@Body SetLabelsInput setLabelsInput);

  @PUT("setLabelsInput/{id}")
  Call<SetLabelsInput> update(@Path("id") String id, @Body SetLabelsInput setLabelsInput);

  @DELETE("setLabelsInput/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
