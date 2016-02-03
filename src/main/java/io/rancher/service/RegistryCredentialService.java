package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.RegistryCredential;
import io.rancher.type.Credential;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface RegistryCredentialService {

  @GET("registryCredential")
  Call<TypeCollection<RegistryCredential>> list();

  @GET("registryCredential")
  Call<TypeCollection<RegistryCredential>> list(@QueryMap Filters filters);

  @GET("registryCredential/{id}")
  Call<RegistryCredential> get(@Path("id") String id);

  @POST("registryCredential")
  Call<RegistryCredential> create(@Body RegistryCredential registryCredential);

  @PUT("registryCredential/{id}")
  Call<RegistryCredential> update(@Path("id") String id, @Body RegistryCredential registryCredential);

  @DELETE("registryCredential/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("registryCredential/{id}?action=activate")
  Call<Credential> activate(@Path("id") String id);
  
  @POST("registryCredential/{id}?action=deactivate")
  Call<Credential> deactivate(@Path("id") String id);
  
  @POST("registryCredential/{id}?action=purge")
  Call<Credential> purge(@Path("id") String id);
  
  @POST("registryCredential/{id}?action=remove")
  Call<Credential> remove(@Path("id") String id);
  
}
