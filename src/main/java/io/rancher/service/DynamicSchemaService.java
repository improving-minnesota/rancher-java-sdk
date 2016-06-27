package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.DynamicSchema;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface DynamicSchemaService {

  @GET("dynamicSchema")
  Call<TypeCollection<DynamicSchema>> list();

  @GET("dynamicSchema")
  Call<TypeCollection<DynamicSchema>> list(@QueryMap Filters filters);

  @GET("dynamicSchema/{id}")
  Call<DynamicSchema> get(@Path("id") String id);

  @POST("dynamicSchema")
  Call<DynamicSchema> create(@Body DynamicSchema dynamicSchema);

  @PUT("dynamicSchema/{id}")
  Call<DynamicSchema> update(@Path("id") String id, @Body DynamicSchema dynamicSchema);

  @DELETE("dynamicSchema/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("dynamicSchema/{id}?action=remove")
  Call<DynamicSchema> remove(@Path("id") String id);
  
}
