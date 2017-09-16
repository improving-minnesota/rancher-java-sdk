package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.ScalePolicy;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ScalePolicyService {

  @GET("scalePolicy")
  Call<TypeCollection<ScalePolicy>> list();

  @GET("scalePolicy")
  Call<TypeCollection<ScalePolicy>> list(@QueryMap HashMap<String,String> filters);

  @GET("scalePolicy/{id}")
  Call<ScalePolicy> get(@Path("id") String id);

  @POST("scalePolicy")
  Call<ScalePolicy> create(@Body ScalePolicy scalePolicy);

  @PUT("scalePolicy/{id}")
  Call<ScalePolicy> update(@Path("id") String id, @Body ScalePolicy scalePolicy);

  @DELETE("scalePolicy/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
