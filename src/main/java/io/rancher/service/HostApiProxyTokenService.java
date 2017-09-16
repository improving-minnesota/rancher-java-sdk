package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.HostApiProxyToken;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface HostApiProxyTokenService {

  @GET("hostApiProxyToken")
  Call<TypeCollection<HostApiProxyToken>> list();

  @GET("hostApiProxyToken")
  Call<TypeCollection<HostApiProxyToken>> list(@QueryMap HashMap<String,String> filters);

  @GET("hostApiProxyToken/{id}")
  Call<HostApiProxyToken> get(@Path("id") String id);

  @POST("hostApiProxyToken")
  Call<HostApiProxyToken> create(@Body HostApiProxyToken hostApiProxyToken);

  @PUT("hostApiProxyToken/{id}")
  Call<HostApiProxyToken> update(@Path("id") String id, @Body HostApiProxyToken hostApiProxyToken);

  @DELETE("hostApiProxyToken/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
