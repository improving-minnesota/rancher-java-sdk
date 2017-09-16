package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.Machine;
import io.rancher.type.PhysicalHost;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface MachineService {

  @GET("machine")
  Call<TypeCollection<Machine>> list();

  @GET("machine")
  Call<TypeCollection<Machine>> list(@QueryMap HashMap<String,String> filters);

  @GET("machine/{id}")
  Call<Machine> get(@Path("id") String id);

  @POST("machine")
  Call<Machine> create(@Body Machine machine);

  @PUT("machine/{id}")
  Call<Machine> update(@Path("id") String id, @Body Machine machine);

  @DELETE("machine/{id}")
  Call<Void> delete(@Path("id") String id);
  
  @POST("machine/{id}?action=bootstrap")
  Call<PhysicalHost> bootstrap(@Path("id") String id);
  
  @POST("machine/{id}?action=error")
  Call<PhysicalHost> error(@Path("id") String id);
  
  @POST("machine/{id}?action=remove")
  Call<PhysicalHost> remove(@Path("id") String id);
  
}
