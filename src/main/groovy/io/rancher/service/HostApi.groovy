package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.Host
import io.rancher.type.HostAccess
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface HostApi {
  @GET('hosts')
  Call<TypeCollection<Host>> list()

  @GET('hosts')
  Call<TypeCollection<Host>> query(@QueryMap Map<String, String> filters)

  @GET('hosts/{id}')
  Call<Host> findById(@Path('id') String id)

  @POST('hosts/{id}?action=evacuate')
  Call<Host> evacuate(@Path('id') String id)

  @POST('hosts/{id}?action=provision')
  Call<Host> provision(@Path('id') String id)

  @POST('hosts/{id}?action=dockersocket')
  Call<HostAccess> dockersocket(@Path('id') String id)

  @POST('hosts/{id}?action=activate')
  Call<Host> activate(@Path('id') String id)

  @POST('hosts/{id}?action=purge')
  Call<Host> purge(@Path('id') String id)

  @POST('hosts/{id}?action=error')
  Call<Host> error(@Path('id') String id)

  @POST('hosts/{id}?action=remove')
  Call<Host> remove(@Path('id') String id)

  @POST('hosts/{id}?action=deactivate')
  Call<Host> deactivate(@Path('id') String id)

}
