package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.TaskInstance
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface TaskInstanceApi {
  @GET("taskInstance")
  Call<TypeCollection<TaskInstance>> list()

  @GET("taskInstance")
  Call<TypeCollection<TaskInstance>> query(@QueryMap Map<String, String> filters)

  @GET("taskInstance/{id}")
  Call<TaskInstance> findById(@Path("id") String id)
}
