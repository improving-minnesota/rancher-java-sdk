package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.AzureConfig;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface AzureConfigService {

  @GET("azureConfig")
  Call<TypeCollection<AzureConfig>> list();

  @GET("azureConfig")
  Call<TypeCollection<AzureConfig>> list(@QueryMap HashMap<String,String> filters);

  @GET("azureConfig/{id}")
  Call<AzureConfig> get(@Path("id") String id);

  @POST("azureConfig")
  Call<AzureConfig> create(@Body AzureConfig azureConfig);

  @PUT("azureConfig/{id}")
  Call<AzureConfig> update(@Path("id") String id, @Body AzureConfig azureConfig);

  @DELETE("azureConfig/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
