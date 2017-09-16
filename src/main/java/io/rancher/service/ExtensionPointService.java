package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.ExtensionPoint;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ExtensionPointService {

  @GET("extensionPoint")
  Call<TypeCollection<ExtensionPoint>> list();

  @GET("extensionPoint")
  Call<TypeCollection<ExtensionPoint>> list(@QueryMap HashMap<String,String> filters);

  @GET("extensionPoint/{id}")
  Call<ExtensionPoint> get(@Path("id") String id);

  @POST("extensionPoint")
  Call<ExtensionPoint> create(@Body ExtensionPoint extensionPoint);

  @PUT("extensionPoint/{id}")
  Call<ExtensionPoint> update(@Path("id") String id, @Body ExtensionPoint extensionPoint);

  @DELETE("extensionPoint/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
