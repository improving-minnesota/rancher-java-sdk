package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
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

public interface CredentialService {

  @GET("credential")
  Call<TypeCollection<Credential>> list();

  @GET("credential")
  Call<TypeCollection<Credential>> list(@QueryMap Filters filters);

  @GET("credential/{id}")
  Call<Credential> get(@Path("id") String id);

  @POST("credential")
  Call<Credential> create(@Body Credential credential);

  @PUT("credential/{id}")
  Call<Credential> update(@Path("id") String id, @Body Credential credential);

  @DELETE("credential/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("credential/{id}?action=activate")
  Call<Credential> activate(@Path("id") String id);
  
  @POST("credential/{id}?action=deactivate")
  Call<Credential> deactivate(@Path("id") String id);
  
  @POST("credential/{id}?action=purge")
  Call<Credential> purge(@Path("id") String id);
  
  @POST("credential/{id}?action=remove")
  Call<Credential> remove(@Path("id") String id);
  
}
