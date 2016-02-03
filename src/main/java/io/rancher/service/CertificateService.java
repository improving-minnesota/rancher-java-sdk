package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Certificate;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface CertificateService {

  @GET("certificate")
  Call<TypeCollection<Certificate>> list();

  @GET("certificate")
  Call<TypeCollection<Certificate>> list(@QueryMap Filters filters);

  @GET("certificate/{id}")
  Call<Certificate> get(@Path("id") String id);

  @POST("certificate")
  Call<Certificate> create(@Body Certificate certificate);

  @PUT("certificate/{id}")
  Call<Certificate> update(@Path("id") String id, @Body Certificate certificate);

  @DELETE("certificate/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("certificate/{id}?action=remove")
  Call<Certificate> remove(@Path("id") String id);
  
}
