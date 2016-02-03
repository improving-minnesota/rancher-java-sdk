package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
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

public interface AccountService {

  @GET("account")
  Call<TypeCollection<Account>> list();

  @GET("account")
  Call<TypeCollection<Account>> list(@QueryMap Filters filters);

  @GET("account/{id}")
  Call<Account> get(@Path("id") String id);

  @POST("account")
  Call<Account> create(@Body Account account);

  @PUT("account/{id}")
  Call<Account> update(@Path("id") String id, @Body Account account);

  @DELETE("account/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("account/{id}?action=activate")
  Call<Account> activate(@Path("id") String id);
  
  @POST("account/{id}?action=deactivate")
  Call<Account> deactivate(@Path("id") String id);
  
  @POST("account/{id}?action=purge")
  Call<Account> purge(@Path("id") String id);
  
  @POST("account/{id}?action=remove")
  Call<Account> remove(@Path("id") String id);
  
  @POST("account/{id}?action=restore")
  Call<Account> restore(@Path("id") String id);
  
}
