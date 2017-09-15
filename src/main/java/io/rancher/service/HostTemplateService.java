package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.HostTemplate;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface HostTemplateService {

  @GET("hostTemplate")
  Call<TypeCollection<HostTemplate>> list();

  @GET("hostTemplate")
  Call<TypeCollection<HostTemplate>> list(@QueryMap Filters filters);

  @GET("hostTemplate/{id}")
  Call<HostTemplate> get(@Path("id") String id);

  @POST("hostTemplate")
  Call<HostTemplate> create(@Body HostTemplate hostTemplate);

  @PUT("hostTemplate/{id}")
  Call<HostTemplate> update(@Path("id") String id, @Body HostTemplate hostTemplate);

  @DELETE("hostTemplate/{id}")
  Call<Void> delete(@Path("id") String id);
  
  @POST("hostTemplate/{id}?action=remove")
  Call<HostTemplate> remove(@Path("id") String id);
  
}
