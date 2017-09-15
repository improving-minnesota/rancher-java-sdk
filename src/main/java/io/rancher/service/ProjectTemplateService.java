package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ProjectTemplate;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ProjectTemplateService {

  @GET("projectTemplate")
  Call<TypeCollection<ProjectTemplate>> list();

  @GET("projectTemplate")
  Call<TypeCollection<ProjectTemplate>> list(@QueryMap Filters filters);

  @GET("projectTemplate/{id}")
  Call<ProjectTemplate> get(@Path("id") String id);

  @POST("projectTemplate")
  Call<ProjectTemplate> create(@Body ProjectTemplate projectTemplate);

  @PUT("projectTemplate/{id}")
  Call<ProjectTemplate> update(@Path("id") String id, @Body ProjectTemplate projectTemplate);

  @DELETE("projectTemplate/{id}")
  Call<Void> delete(@Path("id") String id);
  
  @POST("projectTemplate/{id}?action=remove")
  Call<ProjectTemplate> remove(@Path("id") String id);
  
}
