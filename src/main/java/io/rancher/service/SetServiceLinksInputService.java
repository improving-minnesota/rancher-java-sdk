package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.SetServiceLinksInput;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface SetServiceLinksInputService {

  @GET("setServiceLinksInput")
  Call<TypeCollection<SetServiceLinksInput>> list();

  @GET("setServiceLinksInput")
  Call<TypeCollection<SetServiceLinksInput>> list(@QueryMap Filters filters);

  @GET("setServiceLinksInput/{id}")
  Call<SetServiceLinksInput> get(@Path("id") String id);

  @POST("setServiceLinksInput")
  Call<SetServiceLinksInput> create(@Body SetServiceLinksInput setServiceLinksInput);

  @PUT("setServiceLinksInput/{id}")
  Call<SetServiceLinksInput> update(@Path("id") String id, @Body SetServiceLinksInput setServiceLinksInput);

  @DELETE("setServiceLinksInput/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
