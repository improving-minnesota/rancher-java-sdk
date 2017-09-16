package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.ComposeConfigInput;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ComposeConfigInputService {

  @GET("composeConfigInput")
  Call<TypeCollection<ComposeConfigInput>> list();

  @GET("composeConfigInput")
  Call<TypeCollection<ComposeConfigInput>> list(@QueryMap HashMap<String,String> filters);

  @GET("composeConfigInput/{id}")
  Call<ComposeConfigInput> get(@Path("id") String id);

  @POST("composeConfigInput")
  Call<ComposeConfigInput> create(@Body ComposeConfigInput composeConfigInput);

  @PUT("composeConfigInput/{id}")
  Call<ComposeConfigInput> update(@Path("id") String id, @Body ComposeConfigInput composeConfigInput);

  @DELETE("composeConfigInput/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
