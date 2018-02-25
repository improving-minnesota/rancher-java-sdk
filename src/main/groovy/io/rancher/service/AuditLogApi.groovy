package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.AuditLog
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface AuditLogApi {
  @GET("projects/{projectId}/auditLog")
  Call<TypeCollection<AuditLog>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/auditLog")
  Call<TypeCollection<AuditLog>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/auditLog/{id}")
  Call<AuditLog> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/auditLog")
  Call<AuditLog> create(@Path("projectId") String projectId, @Body AuditLog auditLog)

  @PUT("projects/{projectId}/auditLog/{id}")
  Call<AuditLog> update(@Path("projectId") String projectId, @Path("id") String id, @Body AuditLog auditLog)

  @DELETE("projects/{projectId}/auditLog/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
