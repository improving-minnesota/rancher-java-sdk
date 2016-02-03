package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.TypeDocumentation;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface TypeDocumentationService {

  @GET("typeDocumentation")
  Call<TypeCollection<TypeDocumentation>> list();

  @GET("typeDocumentation")
  Call<TypeCollection<TypeDocumentation>> list(@QueryMap Filters filters);

  @GET("typeDocumentation/{id}")
  Call<TypeDocumentation> get(@Path("id") String id);

  @POST("typeDocumentation")
  Call<TypeDocumentation> create(@Body TypeDocumentation typeDocumentation);

  @PUT("typeDocumentation/{id}")
  Call<TypeDocumentation> update(@Path("id") String id, @Body TypeDocumentation typeDocumentation);

  @DELETE("typeDocumentation/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
