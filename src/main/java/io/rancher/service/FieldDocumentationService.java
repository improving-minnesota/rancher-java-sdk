package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.FieldDocumentation;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface FieldDocumentationService {

  @GET("fieldDocumentation")
  Call<TypeCollection<FieldDocumentation>> list();

  @GET("fieldDocumentation")
  Call<TypeCollection<FieldDocumentation>> list(@QueryMap HashMap<String,String> filters);

  @GET("fieldDocumentation/{id}")
  Call<FieldDocumentation> get(@Path("id") String id);

  @POST("fieldDocumentation")
  Call<FieldDocumentation> create(@Body FieldDocumentation fieldDocumentation);

  @PUT("fieldDocumentation/{id}")
  Call<FieldDocumentation> update(@Path("id") String id, @Body FieldDocumentation fieldDocumentation);

  @DELETE("fieldDocumentation/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
