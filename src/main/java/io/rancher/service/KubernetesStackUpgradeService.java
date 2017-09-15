package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.KubernetesStackUpgrade;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface KubernetesStackUpgradeService {

  @GET("kubernetesStackUpgrade")
  Call<TypeCollection<KubernetesStackUpgrade>> list();

  @GET("kubernetesStackUpgrade")
  Call<TypeCollection<KubernetesStackUpgrade>> list(@QueryMap Filters filters);

  @GET("kubernetesStackUpgrade/{id}")
  Call<KubernetesStackUpgrade> get(@Path("id") String id);

  @POST("kubernetesStackUpgrade")
  Call<KubernetesStackUpgrade> create(@Body KubernetesStackUpgrade kubernetesStackUpgrade);

  @PUT("kubernetesStackUpgrade/{id}")
  Call<KubernetesStackUpgrade> update(@Path("id") String id, @Body KubernetesStackUpgrade kubernetesStackUpgrade);

  @DELETE("kubernetesStackUpgrade/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
