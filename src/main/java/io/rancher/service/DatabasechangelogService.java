package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.Databasechangelog;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface DatabasechangelogService {

  @GET("databasechangelog")
  Call<TypeCollection<Databasechangelog>> list();

  @GET("databasechangelog")
  Call<TypeCollection<Databasechangelog>> list(@QueryMap HashMap<String,String> filters);

  @GET("databasechangelog/{id}")
  Call<Databasechangelog> get(@Path("id") String id);

  @POST("databasechangelog")
  Call<Databasechangelog> create(@Body Databasechangelog databasechangelog);

  @PUT("databasechangelog/{id}")
  Call<Databasechangelog> update(@Path("id") String id, @Body Databasechangelog databasechangelog);

  @DELETE("databasechangelog/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
