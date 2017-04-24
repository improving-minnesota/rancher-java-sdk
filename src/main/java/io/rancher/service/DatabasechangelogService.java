package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Databasechangelog;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

public interface DatabasechangelogService {

  @GET("databasechangelog")
  Call<TypeCollection<Databasechangelog>> list();

  @GET("databasechangelog")
  Call<TypeCollection<Databasechangelog>> list(@QueryMap Filters<String, String> filters);

  @GET("databasechangelog/{id}")
  Call<Databasechangelog> get(@Path("id") String id);

  @POST("databasechangelog")
  Call<Databasechangelog> create(@Body Databasechangelog databasechangelog);

  @PUT("databasechangelog/{id}")
  Call<Databasechangelog> update(@Path("id") String id, @Body Databasechangelog databasechangelog);

  @DELETE("databasechangelog/{id}")
  Call<Response> delete(@Path("id") String id);
  

  
}
