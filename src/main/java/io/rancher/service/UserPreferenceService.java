package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.UserPreference;
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

public interface UserPreferenceService {

  @GET("userPreference")
  Call<TypeCollection<UserPreference>> list();

  @GET("userPreference")
  Call<TypeCollection<UserPreference>> list(@QueryMap Filters<String, String> filters);

  @GET("userPreference/{id}")
  Call<UserPreference> get(@Path("id") String id);

  @POST("userPreference")
  Call<UserPreference> create(@Body UserPreference userPreference);

  @PUT("userPreference/{id}")
  Call<UserPreference> update(@Path("id") String id, @Body UserPreference userPreference);

  @DELETE("userPreference/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("userPreference/{id}?action=activate")
  Call<UserPreference> activate(@Path("id") String id);
  
  @POST("userPreference/{id}?action=deactivate")
  Call<UserPreference> deactivate(@Path("id") String id);
  
  @POST("userPreference/{id}?action=purge")
  Call<UserPreference> purge(@Path("id") String id);
  
  @POST("userPreference/{id}?action=remove")
  Call<UserPreference> remove(@Path("id") String id);
  
  @POST("userPreference/{id}?action=restore")
  Call<UserPreference> restore(@Path("id") String id);
  

  
  @GET
  Call<Account> getLinkAccount(@Url String url );
  
}
