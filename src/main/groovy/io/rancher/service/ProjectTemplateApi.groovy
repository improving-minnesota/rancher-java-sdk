package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ProjectTemplate
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ProjectTemplateApi {
  @GET('projectTemplates')
  Call<TypeCollection<ProjectTemplate>> list()

  @GET('projectTemplates')
  Call<TypeCollection<ProjectTemplate>> query(@QueryMap Map<String, String> filters)

  @POST('projectTemplates')
  Call<ProjectTemplate> create(@Body ProjectTemplate projectTemplate)

  @GET('projectTemplates/{id}')
  Call<ProjectTemplate> findById(@Path('id') String id)

  @PUT('projectTemplates/{id}')
  Call<ProjectTemplate> update(@Path('id') String id, @Body ProjectTemplate projectTemplate)

  @DELETE('projectTemplates/{id}')
  Call<ProjectTemplate> delete(@Path('id') String id)

  @POST('projectTemplates/{id}?action=remove')
  Call<ProjectTemplate> remove(@Path('id') String id)

}
