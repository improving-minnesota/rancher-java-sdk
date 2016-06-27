package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.MachineDriver;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface MachineDriverService {

  @GET("machineDriver")
  Call<TypeCollection<MachineDriver>> list();

  @GET("machineDriver")
  Call<TypeCollection<MachineDriver>> list(@QueryMap Filters filters);

  @GET("machineDriver/{id}")
  Call<MachineDriver> get(@Path("id") String id);

  @POST("machineDriver")
  Call<MachineDriver> create(@Body MachineDriver machineDriver);

  @PUT("machineDriver/{id}")
  Call<MachineDriver> update(@Path("id") String id, @Body MachineDriver machineDriver);

  @DELETE("machineDriver/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("machineDriver/{id}?action=activate")
  Call<MachineDriver> activate(@Path("id") String id);
  
  @POST("machineDriver/{id}?action=deactivate")
  Call<MachineDriver> deactivate(@Path("id") String id);
  
  @POST("machineDriver/{id}?action=error")
  Call<MachineDriver> error(@Path("id") String id);
  
  @POST("machineDriver/{id}?action=reactivate")
  Call<MachineDriver> reactivate(@Path("id") String id);
  
  @POST("machineDriver/{id}?action=remove")
  Call<MachineDriver> remove(@Path("id") String id);
  
}
