package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.AddOutputsInput;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface AddOutputsInputService {

  @GET("addOutputsInput")
  Call<TypeCollection<AddOutputsInput>> list();

  @GET("addOutputsInput")
  Call<TypeCollection<AddOutputsInput>> list(@QueryMap HashMap<String,String> filters);

  @GET("addOutputsInput/{id}")
  Call<AddOutputsInput> get(@Path("id") String id);

  @POST("addOutputsInput")
  Call<AddOutputsInput> create(@Body AddOutputsInput addOutputsInput);

  @PUT("addOutputsInput/{id}")
  Call<AddOutputsInput> update(@Path("id") String id, @Body AddOutputsInput addOutputsInput);

  @DELETE("addOutputsInput/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
