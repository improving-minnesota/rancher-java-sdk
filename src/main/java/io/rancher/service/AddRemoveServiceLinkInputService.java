package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.AddRemoveServiceLinkInput;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface AddRemoveServiceLinkInputService {

  @GET("addRemoveServiceLinkInput")
  Call<TypeCollection<AddRemoveServiceLinkInput>> list();

  @GET("addRemoveServiceLinkInput")
  Call<TypeCollection<AddRemoveServiceLinkInput>> list(@QueryMap HashMap<String,String> filters);

  @GET("addRemoveServiceLinkInput/{id}")
  Call<AddRemoveServiceLinkInput> get(@Path("id") String id);

  @POST("addRemoveServiceLinkInput")
  Call<AddRemoveServiceLinkInput> create(@Body AddRemoveServiceLinkInput addRemoveServiceLinkInput);

  @PUT("addRemoveServiceLinkInput/{id}")
  Call<AddRemoveServiceLinkInput> update(@Path("id") String id, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput);

  @DELETE("addRemoveServiceLinkInput/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
