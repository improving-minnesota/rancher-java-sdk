package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ExternalHandler
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ExternalHandlerApi {
  @GET('externalHandlers')
  Call<TypeCollection<ExternalHandler>> list()

  @GET('externalHandlers')
  Call<TypeCollection<ExternalHandler>> query(@QueryMap Map<String, String> filters)

  @POST('externalHandlers')
  Call<ExternalHandler> create(@Body ExternalHandler externalHandler)

  @GET('externalHandlers/{id}')
  Call<ExternalHandler> findById(@Path('id') String id)

  @PUT('externalHandlers/{id}')
  Call<ExternalHandler> update(@Path('id') String id, @Body ExternalHandler externalHandler)

  @POST('externalHandlers/{id}?action=activate')
  Call<ExternalHandler> activate(@Path('id') String id)

  @POST('externalHandlers/{id}?action=purge')
  Call<ExternalHandler> purge(@Path('id') String id)

  @POST('externalHandlers/{id}?action=remove')
  Call<ExternalHandler> remove(@Path('id') String id)

  @POST('externalHandlers/{id}?action=deactivate')
  Call<ExternalHandler> deactivate(@Path('id') String id)

}
