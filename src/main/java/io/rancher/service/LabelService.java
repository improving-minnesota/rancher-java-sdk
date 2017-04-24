package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Label;
import io.rancher.type.Account;
import io.rancher.type.Host;
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

public interface LabelService {

  @GET("label")
  Call<TypeCollection<Label>> list();

  @GET("label")
  Call<TypeCollection<Label>> list(@QueryMap Filters<String, String> filters);

  @GET("label/{id}")
  Call<Label> get(@Path("id") String id);

  @POST("label")
  Call<Label> create(@Body Label label);

  @PUT("label/{id}")
  Call<Label> update(@Path("id") String id, @Body Label label);

  @DELETE("label/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("label/{id}?action=remove")
  Call<Label> remove(@Path("id") String id);
  

  
  @GET
  Call<Account> getLinkAccount(@Url String url );
  
  @GET
  Call<TypeCollection<Host>> getLinkHosts(@Url String url );
  
  @GET
  Call<TypeCollection<Instance>> getLinkInstances(@Url String url );
  
}
