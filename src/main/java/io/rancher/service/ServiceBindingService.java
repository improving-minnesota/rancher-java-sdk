package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ServiceBinding;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ServiceBindingService {

  @GET("serviceBinding")
  Call<TypeCollection<ServiceBinding>> list();

  @GET("serviceBinding")
  Call<TypeCollection<ServiceBinding>> list(@QueryMap Filters filters);

  @GET("serviceBinding/{id}")
  Call<ServiceBinding> get(@Path("id") String id);

  @POST("serviceBinding")
  Call<ServiceBinding> create(@Body ServiceBinding serviceBinding);

  @PUT("serviceBinding/{id}")
  Call<ServiceBinding> update(@Path("id") String id, @Body ServiceBinding serviceBinding);

  @DELETE("serviceBinding/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
