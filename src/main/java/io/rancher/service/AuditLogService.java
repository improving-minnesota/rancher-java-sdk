package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.AuditLog;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface AuditLogService {

  @GET("auditLog")
  Call<TypeCollection<AuditLog>> list();

  @GET("auditLog")
  Call<TypeCollection<AuditLog>> list(@QueryMap HashMap<String,String> filters);

  @GET("auditLog/{id}")
  Call<AuditLog> get(@Path("id") String id);

  @POST("auditLog")
  Call<AuditLog> create(@Body AuditLog auditLog);

  @PUT("auditLog/{id}")
  Call<AuditLog> update(@Path("id") String id, @Body AuditLog auditLog);

  @DELETE("auditLog/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
