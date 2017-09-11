package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.KubernetesStack;
import io.rancher.type.Stack;
import io.rancher.type.KubernetesStackUpgrade;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface KubernetesStackService {

  @GET("kubernetesStack")
  Call<TypeCollection<KubernetesStack>> list();

  @GET("kubernetesStack")
  Call<TypeCollection<KubernetesStack>> list(@QueryMap Filters filters);

  @GET("kubernetesStack/{id}")
  Call<KubernetesStack> get(@Path("id") String id);

  @POST("kubernetesStack")
  Call<KubernetesStack> create(@Body KubernetesStack kubernetesStack);

  @PUT("kubernetesStack/{id}")
  Call<KubernetesStack> update(@Path("id") String id, @Body KubernetesStack kubernetesStack);

  @DELETE("kubernetesStack/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("kubernetesStack/{id}?action=cancelupgrade")
  Call<Stack> cancelupgrade(@Path("id") String id);
  
  @POST("kubernetesStack/{id}?action=error")
  Call<Stack> error(@Path("id") String id);
  
  @POST("kubernetesStack/{id}?action=finishupgrade")
  Call<Stack> finishupgrade(@Path("id") String id);
  
  @POST("kubernetesStack/{id}?action=remove")
  Call<Stack> remove(@Path("id") String id);
  
  @POST("kubernetesStack/{id}?action=rollback")
  Call<Stack> rollback(@Path("id") String id);
  
  @POST("kubernetesStack/{id}?action=upgrade")
  Call<KubernetesStack> upgrade(@Path("id") String id, @Body KubernetesStackUpgrade kubernetesStackUpgrade);
  
}
