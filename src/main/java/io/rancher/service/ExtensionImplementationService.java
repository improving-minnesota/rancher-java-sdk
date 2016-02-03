package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ExtensionImplementation;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ExtensionImplementationService {

  @GET("extensionImplementation")
  Call<TypeCollection<ExtensionImplementation>> list();

  @GET("extensionImplementation")
  Call<TypeCollection<ExtensionImplementation>> list(@QueryMap Filters filters);

  @GET("extensionImplementation/{id}")
  Call<ExtensionImplementation> get(@Path("id") String id);

  @POST("extensionImplementation")
  Call<ExtensionImplementation> create(@Body ExtensionImplementation extensionImplementation);

  @PUT("extensionImplementation/{id}")
  Call<ExtensionImplementation> update(@Path("id") String id, @Body ExtensionImplementation extensionImplementation);

  @DELETE("extensionImplementation/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
