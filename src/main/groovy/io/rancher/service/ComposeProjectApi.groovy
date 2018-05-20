package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ComposeProject
import io.rancher.type.Stack
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ComposeProjectApi {
  @GET('composeProjects')
  Call<TypeCollection<ComposeProject>> list()

  @GET('composeProjects')
  Call<TypeCollection<ComposeProject>> query(@QueryMap Map<String, String> filters)

  @GET('composeProjects/{id}')
  Call<ComposeProject> findById(@Path('id') String id)

  @POST('composeProjects/{id}?action=rollback')
  Call<Stack> rollback(@Path('id') String id)

  @POST('composeProjects/{id}?action=error')
  Call<Stack> error(@Path('id') String id)

  @POST('composeProjects/{id}?action=cancelupgrade')
  Call<Stack> cancelupgrade(@Path('id') String id)

  @POST('composeProjects/{id}?action=remove')
  Call<Stack> remove(@Path('id') String id)

  @POST('composeProjects/{id}?action=finishupgrade')
  Call<Stack> finishupgrade(@Path('id') String id)

}
