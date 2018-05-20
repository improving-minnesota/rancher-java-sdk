package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.Agent
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface AgentApi {
  @GET('agents')
  Call<TypeCollection<Agent>> list()

  @GET('agents')
  Call<TypeCollection<Agent>> query(@QueryMap Map<String, String> filters)

  @POST('agents')
  Call<Agent> create(@Body Agent agent)

  @GET('agents/{id}')
  Call<Agent> findById(@Path('id') String id)

  @PUT('agents/{id}')
  Call<Agent> update(@Path('id') String id, @Body Agent agent)

  @DELETE('agents/{id}')
  Call<Agent> delete(@Path('id') String id)

  @POST('agents/{id}?action=finishreconnect')
  Call<Agent> finishreconnect(@Path('id') String id)

  @POST('agents/{id}?action=disconnect')
  Call<Agent> disconnect(@Path('id') String id)

  @POST('agents/{id}?action=reconnect')
  Call<Agent> reconnect(@Path('id') String id)

  @POST('agents/{id}?action=activate')
  Call<Agent> activate(@Path('id') String id)

  @POST('agents/{id}?action=purge')
  Call<Agent> purge(@Path('id') String id)

  @POST('agents/{id}?action=remove')
  Call<Agent> remove(@Path('id') String id)

  @POST('agents/{id}?action=deactivate')
  Call<Agent> deactivate(@Path('id') String id)

}
