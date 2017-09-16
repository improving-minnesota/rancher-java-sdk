package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.Register;
import io.rancher.type.GenericObject;
import io.rancher.type.InstanceStop;
import io.rancher.type.Instance;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface RegisterService {

  @GET("register")
  Call<TypeCollection<Register>> list();

  @GET("register")
  Call<TypeCollection<Register>> list(@QueryMap HashMap<String,String> filters);

  @GET("register/{id}")
  Call<Register> get(@Path("id") String id);

  @POST("register")
  Call<Register> create(@Body Register register);

  @PUT("register/{id}")
  Call<Register> update(@Path("id") String id, @Body Register register);

  @DELETE("register/{id}")
  Call<Void> delete(@Path("id") String id);
  
  @POST("register/{id}?action=remove")
  Call<GenericObject> remove(@Path("id") String id);
  
  @POST("register/{id}?action=stop")
  Call<Instance> stop(@Path("id") String id, @Body InstanceStop instanceStop);
  
}
