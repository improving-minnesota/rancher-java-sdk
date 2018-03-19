package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.KubernetesStack
import io.rancher.type.Stack
import io.rancher.type.KubernetesStackUpgrade
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface KubernetesStackApi {
  @GET('kubernetesStacks')
  Call<TypeCollection<KubernetesStack>> list()

  @GET('kubernetesStacks')
  Call<TypeCollection<KubernetesStack>> query(@QueryMap Map<String, String> filters)

  @GET('kubernetesStacks/{id}')
  Call<KubernetesStack> findById(@Path('id') String id)

  @POST('kubernetesStacks/{id}?action=rollback')
  Call<Stack> rollback(@Path('id') String id)

  @POST('kubernetesStacks/{id}?action=upgrade')
  Call<KubernetesStack> upgrade(@Path('id') String id, @Body KubernetesStackUpgrade kubernetesStackUpgrade)
  @POST('kubernetesStacks/{id}?action=error')
  Call<Stack> error(@Path('id') String id)

  @POST('kubernetesStacks/{id}?action=cancelupgrade')
  Call<Stack> cancelupgrade(@Path('id') String id)

  @POST('kubernetesStacks/{id}?action=remove')
  Call<Stack> remove(@Path('id') String id)

  @POST('kubernetesStacks/{id}?action=finishupgrade')
  Call<Stack> finishupgrade(@Path('id') String id)

}
