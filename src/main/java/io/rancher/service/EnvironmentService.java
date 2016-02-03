package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Environment;
import io.rancher.type.AddOutputsInput;
import io.rancher.type.ComposeConfigInput;
import io.rancher.type.ComposeConfig;
import io.rancher.type.EnvironmentUpgrade;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface EnvironmentService {

  @GET("environment")
  Call<TypeCollection<Environment>> list();

  @GET("environment")
  Call<TypeCollection<Environment>> list(@QueryMap Filters filters);

  @GET("environment/{id}")
  Call<Environment> get(@Path("id") String id);

  @POST("environment")
  Call<Environment> create(@Body Environment environment);

  @PUT("environment/{id}")
  Call<Environment> update(@Path("id") String id, @Body Environment environment);

  @DELETE("environment/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("environment/{id}?action=activateservices")
  Call<Environment> activateservices(@Path("id") String id);
  
  @POST("environment/{id}?action=addoutputs")
  Call<Environment> addoutputs(@Path("id") String id, @Body AddOutputsInput addOutputsInput);
  
  @POST("environment/{id}?action=cancelrollback")
  Call<Environment> cancelrollback(@Path("id") String id);
  
  @POST("environment/{id}?action=cancelupgrade")
  Call<Environment> cancelupgrade(@Path("id") String id);
  
  @POST("environment/{id}?action=deactivateservices")
  Call<Environment> deactivateservices(@Path("id") String id);
  
  @POST("environment/{id}?action=error")
  Call<Environment> error(@Path("id") String id);
  
  @POST("environment/{id}?action=exportconfig")
  Call<ComposeConfig> exportconfig(@Path("id") String id, @Body ComposeConfigInput composeConfigInput);
  
  @POST("environment/{id}?action=finishupgrade")
  Call<Environment> finishupgrade(@Path("id") String id);
  
  @POST("environment/{id}?action=remove")
  Call<Environment> remove(@Path("id") String id);
  
  @POST("environment/{id}?action=rollback")
  Call<Environment> rollback(@Path("id") String id);
  
  @POST("environment/{id}?action=upgrade")
  Call<Environment> upgrade(@Path("id") String id, @Body EnvironmentUpgrade environmentUpgrade);
  
}
