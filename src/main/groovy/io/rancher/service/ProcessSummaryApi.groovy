package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ProcessSummary
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ProcessSummaryApi {
  @GET('processSummary')
  Call<TypeCollection<ProcessSummary>> list()

  @GET('processSummary')
  Call<TypeCollection<ProcessSummary>> query(@QueryMap Map<String, String> filters)

  @GET('processSummary/{id}')
  Call<ProcessSummary> findById(@Path('id') String id)

}
