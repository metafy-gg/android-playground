package gg.metafy.playground.api

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * If you feel like there is a better place for the retrofit initialization, feel free to move the code around
 */
class ApiFactory(private val host: String = HOST) {
    fun create(): PlaygroundApi {
        val httpClient = OkHttpClient.Builder()
            .connectTimeout(TIMEOUT_SECONDS, TimeUnit.SECONDS)
            .readTimeout(TIMEOUT_SECONDS, TimeUnit.SECONDS)
            .build()

        return Retrofit.Builder()
            .baseUrl(host)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .client(httpClient)
            .build()
            .create(PlaygroundApi::class.java)
    }

    companion object {
        private const val TIMEOUT_SECONDS = 24L
        private const val HOST = "http://demo8082354.mockable.io/"
    }
}