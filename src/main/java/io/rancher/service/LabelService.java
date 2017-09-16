package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.Label;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface LabelService {

  @GET("label")
  Call<TypeCollection<Label>> list();

  @GET("label")
  Call<TypeCollection<Label>> list(@QueryMap HashMap<String,String> filters);

  @GET("label/{id}")
  Call<Label> get(@Path("id") String id);

  @POST("label")
  Call<Label> create(@Body Label label);

  @PUT("label/{id}")
  Call<Label> update(@Path("id") String id, @Body Label label);

  @DELETE("label/{id}")
  Call<Void> delete(@Path("id") String id);
  
  @POST("label/{id}?action=remove")
  Call<Label> remove(@Path("id") String id);
  
}
