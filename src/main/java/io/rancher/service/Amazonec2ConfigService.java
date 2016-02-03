package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Amazonec2Config;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface Amazonec2ConfigService {

  @GET("amazonec2Config")
  Call<TypeCollection<Amazonec2Config>> list();

  @GET("amazonec2Config")
  Call<TypeCollection<Amazonec2Config>> list(@QueryMap Filters filters);

  @GET("amazonec2Config/{id}")
  Call<Amazonec2Config> get(@Path("id") String id);

  @POST("amazonec2Config")
  Call<Amazonec2Config> create(@Body Amazonec2Config amazonec2Config);

  @PUT("amazonec2Config/{id}")
  Call<Amazonec2Config> update(@Path("id") String id, @Body Amazonec2Config amazonec2Config);

  @DELETE("amazonec2Config/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
