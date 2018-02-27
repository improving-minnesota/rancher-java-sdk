package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.Region
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface RegionApi { 
  @GET("region")
  Call<TypeCollection<Region>> list()

  @GET("region")
  Call<TypeCollection<Region>> query(@QueryMap Map<String, String> filters)

  @POST("region")
  Call<Region> create(@Body Region region)

  @GET("region/{id}")
  Call<Region> findById(@Path("id") String id)

  @PUT("region/{id}")
  Call<Region> update(@Path("id") String id, @Body Region region)

  @DELETE("region/{id}")
  Call<Region> delete(@Path("id") String id)

  @POST("region/{id}?action=activate")
  Call<Region> activate(@Path("id") String id)

  @POST("region/{id}?action=deactivate")
  Call<Region> deactivate(@Path("id") String id)

  @POST("region/{id}?action=purge")
  Call<Region> purge(@Path("id") String id)

  @POST("region/{id}?action=remove")
  Call<Region> remove(@Path("id") String id)
}
