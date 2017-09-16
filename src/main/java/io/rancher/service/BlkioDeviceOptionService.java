package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.BlkioDeviceOption;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface BlkioDeviceOptionService {

  @GET("blkioDeviceOption")
  Call<TypeCollection<BlkioDeviceOption>> list();

  @GET("blkioDeviceOption")
  Call<TypeCollection<BlkioDeviceOption>> list(@QueryMap HashMap<String,String> filters);

  @GET("blkioDeviceOption/{id}")
  Call<BlkioDeviceOption> get(@Path("id") String id);

  @POST("blkioDeviceOption")
  Call<BlkioDeviceOption> create(@Body BlkioDeviceOption blkioDeviceOption);

  @PUT("blkioDeviceOption/{id}")
  Call<BlkioDeviceOption> update(@Path("id") String id, @Body BlkioDeviceOption blkioDeviceOption);

  @DELETE("blkioDeviceOption/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
