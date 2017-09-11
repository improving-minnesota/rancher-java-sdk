package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ProcessSummary;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ProcessSummaryService {

  @GET("processSummary")
  Call<TypeCollection<ProcessSummary>> list();

  @GET("processSummary")
  Call<TypeCollection<ProcessSummary>> list(@QueryMap Filters filters);

  @GET("processSummary/{id}")
  Call<ProcessSummary> get(@Path("id") String id);

  @POST("processSummary")
  Call<ProcessSummary> create(@Body ProcessSummary processSummary);

  @PUT("processSummary/{id}")
  Call<ProcessSummary> update(@Path("id") String id, @Body ProcessSummary processSummary);

  @DELETE("processSummary/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
