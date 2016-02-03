package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ServiceLink;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ServiceLinkService {

  @GET("serviceLink")
  Call<TypeCollection<ServiceLink>> list();

  @GET("serviceLink")
  Call<TypeCollection<ServiceLink>> list(@QueryMap Filters filters);

  @GET("serviceLink/{id}")
  Call<ServiceLink> get(@Path("id") String id);

  @POST("serviceLink")
  Call<ServiceLink> create(@Body ServiceLink serviceLink);

  @PUT("serviceLink/{id}")
  Call<ServiceLink> update(@Path("id") String id, @Body ServiceLink serviceLink);

  @DELETE("serviceLink/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
