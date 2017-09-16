package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.VirtualMachineDisk;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface VirtualMachineDiskService {

  @GET("virtualMachineDisk")
  Call<TypeCollection<VirtualMachineDisk>> list();

  @GET("virtualMachineDisk")
  Call<TypeCollection<VirtualMachineDisk>> list(@QueryMap HashMap<String,String> filters);

  @GET("virtualMachineDisk/{id}")
  Call<VirtualMachineDisk> get(@Path("id") String id);

  @POST("virtualMachineDisk")
  Call<VirtualMachineDisk> create(@Body VirtualMachineDisk virtualMachineDisk);

  @PUT("virtualMachineDisk/{id}")
  Call<VirtualMachineDisk> update(@Path("id") String id, @Body VirtualMachineDisk virtualMachineDisk);

  @DELETE("virtualMachineDisk/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
