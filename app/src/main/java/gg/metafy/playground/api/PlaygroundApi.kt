package gg.metafy.playground.api

import gg.metafy.playground.entity.SessionEntity
import io.reactivex.rxjava3.core.Single
import retrofit2.Call
import retrofit2.http.GET

interface PlaygroundApi {
    @GET("sessions")
    suspend fun getSessions(): List<SessionEntity>

    @GET("sessions")
    fun getSessionsRx(): Single<List<SessionEntity>>

    @GET("sessions")
    fun getSessionsCall(): Call<List<SessionEntity>>
}