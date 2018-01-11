package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ApiKey;
import io.rancher.type.Account;
import io.rancher.type.Credential;
import io.rancher.type.Image;
import io.rancher.type.Instance;

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

public interface ApiKeyService {

  @GET("apiKey")
  Call<TypeCollection<ApiKey>> list();

  @GET("apiKey")
  Call<TypeCollection<ApiKey>> list(@QueryMap Filters<String, String> filters);

  @GET("apiKey/{id}")
  Call<ApiKey> get(@Path("id") String id);

  @POST("apiKey")
  Call<ApiKey> create(@Body ApiKey apiKey);

  @PUT("apiKey/{id}")
  Call<ApiKey> update(@Path("id") String id, @Body ApiKey apiKey);

  @DELETE("apiKey/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("apiKey/{id}?action=activate")
  Call<Credential> activate(@Path("id") String id);
  
  @POST("apiKey/{id}?action=deactivate")
  Call<Credential> deactivate(@Path("id") String id);
  
  @POST("apiKey/{id}?action=purge")
  Call<Credential> purge(@Path("id") String id);
  
  @POST("apiKey/{id}?action=remove")
  Call<Credential> remove(@Path("id") String id);
  

  
  @GET
  Call<Account> getLinkAccount(@Url String url );
  
  @GET
  Call<TypeCollection<Image>> getLinkImages(@Url String url );
  
  @GET
  Call<TypeCollection<Instance>> getLinkInstances(@Url String url );
  
}
