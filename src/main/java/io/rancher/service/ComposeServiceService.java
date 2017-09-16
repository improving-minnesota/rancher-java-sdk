package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.ComposeService;
import io.rancher.type.Service;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ComposeServiceService {

  @GET("composeService")
  Call<TypeCollection<ComposeService>> list();

  @GET("composeService")
  Call<TypeCollection<ComposeService>> list(@QueryMap HashMap<String,String> filters);

  @GET("composeService/{id}")
  Call<ComposeService> get(@Path("id") String id);

  @POST("composeService")
  Call<ComposeService> create(@Body ComposeService composeService);

  @PUT("composeService/{id}")
  Call<ComposeService> update(@Path("id") String id, @Body ComposeService composeService);

  @DELETE("composeService/{id}")
  Call<Void> delete(@Path("id") String id);
  
  @POST("composeService/{id}?action=activate")
  Call<Service> activate(@Path("id") String id);
  
  @POST("composeService/{id}?action=cancelupgrade")
  Call<Service> cancelupgrade(@Path("id") String id);
  
  @POST("composeService/{id}?action=continueupgrade")
  Call<Service> continueupgrade(@Path("id") String id);
  
  @POST("composeService/{id}?action=finishupgrade")
  Call<Service> finishupgrade(@Path("id") String id);
  
  @POST("composeService/{id}?action=remove")
  Call<Service> remove(@Path("id") String id);
  
  @POST("composeService/{id}?action=rollback")
  Call<Service> rollback(@Path("id") String id);
  
}
