package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.AuditLog
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface AuditLogApi {
  @GET("auditLog")
  Call<TypeCollection<AuditLog>> list()

  @GET("auditLog")
  Call<TypeCollection<AuditLog>> query(@QueryMap Map<String, String> filters)

  @GET("auditLog/{id}")
  Call<AuditLog> findById(@Path("id") String id)
}
