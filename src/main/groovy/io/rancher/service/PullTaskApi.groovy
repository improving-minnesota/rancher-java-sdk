package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.PullTask
import io.rancher.type.GenericObject
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface PullTaskApi {
  @GET('pullTasks')
  Call<TypeCollection<PullTask>> list()

  @GET('pullTasks')
  Call<TypeCollection<PullTask>> query(@QueryMap Map<String, String> filters)

  @GET('pullTasks/{id}')
  Call<PullTask> findById(@Path('id') String id)

  @POST('pullTasks/{id}?action=remove')
  Call<GenericObject> remove(@Path('id') String id)

}
