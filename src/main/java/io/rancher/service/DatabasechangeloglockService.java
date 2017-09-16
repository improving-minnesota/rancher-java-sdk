package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.Databasechangeloglock;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface DatabasechangeloglockService {

  @GET("databasechangeloglock")
  Call<TypeCollection<Databasechangeloglock>> list();

  @GET("databasechangeloglock")
  Call<TypeCollection<Databasechangeloglock>> list(@QueryMap HashMap<String,String> filters);

  @GET("databasechangeloglock/{id}")
  Call<Databasechangeloglock> get(@Path("id") String id);

  @POST("databasechangeloglock")
  Call<Databasechangeloglock> create(@Body Databasechangeloglock databasechangeloglock);

  @PUT("databasechangeloglock/{id}")
  Call<Databasechangeloglock> update(@Path("id") String id, @Body Databasechangeloglock databasechangeloglock);

  @DELETE("databasechangeloglock/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
