package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.BlkioDeviceOption;

import retrofit2.Call;
import retrofit2.Response;
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
  Call<TypeCollection<BlkioDeviceOption>> list(@QueryMap Filters filters);

  @GET("blkioDeviceOption/{id}")
  Call<BlkioDeviceOption> get(@Path("id") String id);

  @POST("blkioDeviceOption")
  Call<BlkioDeviceOption> create(@Body BlkioDeviceOption blkioDeviceOption);

  @PUT("blkioDeviceOption/{id}")
  Call<BlkioDeviceOption> update(@Path("id") String id, @Body BlkioDeviceOption blkioDeviceOption);

  @DELETE("blkioDeviceOption/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
