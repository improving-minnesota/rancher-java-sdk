package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ChangeSecretInput;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ChangeSecretInputService {

  @GET("changeSecretInput")
  Call<TypeCollection<ChangeSecretInput>> list();

  @GET("changeSecretInput")
  Call<TypeCollection<ChangeSecretInput>> list(@QueryMap Filters filters);

  @GET("changeSecretInput/{id}")
  Call<ChangeSecretInput> get(@Path("id") String id);

  @POST("changeSecretInput")
  Call<ChangeSecretInput> create(@Body ChangeSecretInput changeSecretInput);

  @PUT("changeSecretInput/{id}")
  Call<ChangeSecretInput> update(@Path("id") String id, @Body ChangeSecretInput changeSecretInput);

  @DELETE("changeSecretInput/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
