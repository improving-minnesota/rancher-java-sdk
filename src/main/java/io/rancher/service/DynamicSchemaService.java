package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.DynamicSchema;
import io.rancher.type.Account;

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

public interface DynamicSchemaService {

  @GET("dynamicSchema")
  Call<TypeCollection<DynamicSchema>> list();

  @GET("dynamicSchema")
  Call<TypeCollection<DynamicSchema>> list(@QueryMap Filters<String, String> filters);

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
  

  
  @GET
  Call<Account> getLinkAccount(@Url String url );
  
}
