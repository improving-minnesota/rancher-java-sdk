package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Image;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ImageService {

  @GET("image")
  Call<TypeCollection<Image>> list();

  @GET("image")
  Call<TypeCollection<Image>> list(@QueryMap Filters filters);

  @GET("image/{id}")
  Call<Image> get(@Path("id") String id);

  @POST("image")
  Call<Image> create(@Body Image image);

  @PUT("image/{id}")
  Call<Image> update(@Path("id") String id, @Body Image image);

  @DELETE("image/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("image/{id}?action=activate")
  Call<Image> activate(@Path("id") String id);
  
  @POST("image/{id}?action=deactivate")
  Call<Image> deactivate(@Path("id") String id);
  
  @POST("image/{id}?action=purge")
  Call<Image> purge(@Path("id") String id);
  
  @POST("image/{id}?action=remove")
  Call<Image> remove(@Path("id") String id);
  
  @POST("image/{id}?action=restore")
  Call<Image> restore(@Path("id") String id);
  
}
