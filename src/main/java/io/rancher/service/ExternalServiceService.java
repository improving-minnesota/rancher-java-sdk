package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ExternalService;
import io.rancher.type.Account;
import io.rancher.type.Environment;
import io.rancher.type.Instance;
import io.rancher.type.Service;
import io.rancher.type.ServiceRestart;
import io.rancher.type.ServiceUpgrade;

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

public interface ExternalServiceService {

  @GET("externalService")
  Call<TypeCollection<ExternalService>> list();

  @GET("externalService")
  Call<TypeCollection<ExternalService>> list(@QueryMap Filters<String, String> filters);

  @GET("externalService/{id}")
  Call<ExternalService> get(@Path("id") String id);

  @POST("externalService")
  Call<ExternalService> create(@Body ExternalService externalService);

  @PUT("externalService/{id}")
  Call<ExternalService> update(@Path("id") String id, @Body ExternalService externalService);

  @DELETE("externalService/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("externalService/{id}?action=activate")
  Call<Service> activate(@Path("id") String id);
  
  @POST("externalService/{id}?action=cancelrollback")
  Call<Service> cancelrollback(@Path("id") String id);
  
  @POST("externalService/{id}?action=cancelupgrade")
  Call<Service> cancelupgrade(@Path("id") String id);
  
  @POST("externalService/{id}?action=deactivate")
  Call<Service> deactivate(@Path("id") String id);
  
  @POST("externalService/{id}?action=finishupgrade")
  Call<Service> finishupgrade(@Path("id") String id);
  
  @POST("externalService/{id}?action=remove")
  Call<Service> remove(@Path("id") String id);
  
  @POST("externalService/{id}?action=restart")
  Call<Service> restart(@Path("id") String id, @Body ServiceRestart serviceRestart);
  
  @POST("externalService/{id}?action=rollback")
  Call<Service> rollback(@Path("id") String id);
  
  @POST("externalService/{id}?action=upgrade")
  Call<Service> upgrade(@Path("id") String id, @Body ServiceUpgrade serviceUpgrade);
  

  
  @GET
  Call<Account> getLinkAccount(@Url String url );
  
  @GET
  Call<Environment> getLinkEnvironment(@Url String url );
  
  @GET
  Call<TypeCollection<Instance>> getLinkInstances(@Url String url );
  
}
