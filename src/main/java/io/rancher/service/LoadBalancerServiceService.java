package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.LoadBalancerService;
import io.rancher.type.ServiceUpgrade;
import io.rancher.type.Service;
import io.rancher.type.AddRemoveServiceLinkInput;
import io.rancher.type.ServiceRestart;
import io.rancher.type.SetServiceLinksInput;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface LoadBalancerServiceService {

  @GET("loadBalancerService")
  Call<TypeCollection<LoadBalancerService>> list();

  @GET("loadBalancerService")
  Call<TypeCollection<LoadBalancerService>> list(@QueryMap HashMap<String,String> filters);

  @GET("loadBalancerService/{id}")
  Call<LoadBalancerService> get(@Path("id") String id);

  @POST("loadBalancerService")
  Call<LoadBalancerService> create(@Body LoadBalancerService loadBalancerService);

  @PUT("loadBalancerService/{id}")
  Call<LoadBalancerService> update(@Path("id") String id, @Body LoadBalancerService loadBalancerService);

  @DELETE("loadBalancerService/{id}")
  Call<Void> delete(@Path("id") String id);
  
  @POST("loadBalancerService/{id}?action=activate")
  Call<Service> activate(@Path("id") String id);
  
  @POST("loadBalancerService/{id}?action=addservicelink")
  Call<Service> addservicelink(@Path("id") String id, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput);
  
  @POST("loadBalancerService/{id}?action=cancelupgrade")
  Call<Service> cancelupgrade(@Path("id") String id);
  
  @POST("loadBalancerService/{id}?action=continueupgrade")
  Call<Service> continueupgrade(@Path("id") String id);
  
  @POST("loadBalancerService/{id}?action=deactivate")
  Call<Service> deactivate(@Path("id") String id);
  
  @POST("loadBalancerService/{id}?action=finishupgrade")
  Call<Service> finishupgrade(@Path("id") String id);
  
  @POST("loadBalancerService/{id}?action=remove")
  Call<Service> remove(@Path("id") String id);
  
  @POST("loadBalancerService/{id}?action=removeservicelink")
  Call<Service> removeservicelink(@Path("id") String id, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput);
  
  @POST("loadBalancerService/{id}?action=restart")
  Call<Service> restart(@Path("id") String id, @Body ServiceRestart serviceRestart);
  
  @POST("loadBalancerService/{id}?action=rollback")
  Call<Service> rollback(@Path("id") String id);
  
  @POST("loadBalancerService/{id}?action=setservicelinks")
  Call<Service> setservicelinks(@Path("id") String id, @Body SetServiceLinksInput setServiceLinksInput);
  
  @POST("loadBalancerService/{id}?action=upgrade")
  Call<Service> upgrade(@Path("id") String id, @Body ServiceUpgrade serviceUpgrade);
  
}
