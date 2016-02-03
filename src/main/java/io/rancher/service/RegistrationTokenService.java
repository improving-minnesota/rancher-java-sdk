package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.RegistrationToken;
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

public interface RegistrationTokenService {

  @GET("registrationToken")
  Call<TypeCollection<RegistrationToken>> list();

  @GET("registrationToken")
  Call<TypeCollection<RegistrationToken>> list(@QueryMap Filters filters);

  @GET("registrationToken/{id}")
  Call<RegistrationToken> get(@Path("id") String id);

  @POST("registrationToken")
  Call<RegistrationToken> create(@Body RegistrationToken registrationToken);

  @PUT("registrationToken/{id}")
  Call<RegistrationToken> update(@Path("id") String id, @Body RegistrationToken registrationToken);

  @DELETE("registrationToken/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("registrationToken/{id}?action=activate")
  Call<Credential> activate(@Path("id") String id);
  
  @POST("registrationToken/{id}?action=deactivate")
  Call<Credential> deactivate(@Path("id") String id);
  
  @POST("registrationToken/{id}?action=purge")
  Call<Credential> purge(@Path("id") String id);
  
  @POST("registrationToken/{id}?action=remove")
  Call<Credential> remove(@Path("id") String id);
  
}
