package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.NetworkDriverService;
import io.rancher.type.ServiceRestart;
import io.rancher.type.AddRemoveServiceLinkInput;
import io.rancher.type.SetServiceLinksInput;
import io.rancher.type.Service;
import io.rancher.type.ServiceUpgrade;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface NetworkDriverServiceService {

  @GET("networkDriverService")
  Call<TypeCollection<NetworkDriverService>> list();

  @GET("networkDriverService")
  Call<TypeCollection<NetworkDriverService>> list(@QueryMap Filters filters);

  @GET("networkDriverService/{id}")
  Call<NetworkDriverService> get(@Path("id") String id);

  @POST("networkDriverService")
  Call<NetworkDriverService> create(@Body NetworkDriverService networkDriverService);

  @PUT("networkDriverService/{id}")
  Call<NetworkDriverService> update(@Path("id") String id, @Body NetworkDriverService networkDriverService);

  @DELETE("networkDriverService/{id}")
  Call<Void> delete(@Path("id") String id);
  
  @POST("networkDriverService/{id}?action=activate")
  Call<Service> activate(@Path("id") String id);
  
  @POST("networkDriverService/{id}?action=addservicelink")
  Call<Service> addservicelink(@Path("id") String id, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput);
  
  @POST("networkDriverService/{id}?action=cancelupgrade")
  Call<Service> cancelupgrade(@Path("id") String id);
  
  @POST("networkDriverService/{id}?action=continueupgrade")
  Call<Service> continueupgrade(@Path("id") String id);
  
  @POST("networkDriverService/{id}?action=deactivate")
  Call<Service> deactivate(@Path("id") String id);
  
  @POST("networkDriverService/{id}?action=finishupgrade")
  Call<Service> finishupgrade(@Path("id") String id);
  
  @POST("networkDriverService/{id}?action=remove")
  Call<Service> remove(@Path("id") String id);
  
  @POST("networkDriverService/{id}?action=removeservicelink")
  Call<Service> removeservicelink(@Path("id") String id, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput);
  
  @POST("networkDriverService/{id}?action=restart")
  Call<Service> restart(@Path("id") String id, @Body ServiceRestart serviceRestart);
  
  @POST("networkDriverService/{id}?action=rollback")
  Call<Service> rollback(@Path("id") String id);
  
  @POST("networkDriverService/{id}?action=setservicelinks")
  Call<Service> setservicelinks(@Path("id") String id, @Body SetServiceLinksInput setServiceLinksInput);
  
  @POST("networkDriverService/{id}?action=upgrade")
  Call<Service> upgrade(@Path("id") String id, @Body ServiceUpgrade serviceUpgrade);
  
}
