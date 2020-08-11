package com.iichirokawashima.conpassclient.API

import com.iichirokawashima.conpassclient.Entity.Events
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiClientInterface {
    @GET("api/v2/items?page=1&per_page=20")
    fun fetchEvents(
        @Query("query") query: String
    ): retrofit2.Call<List<Events>>
}

object ApiClientBuilder {
    private val baseApiUrl = "https://qiita.com/"
    private val client = OkHttpClient.Builder().build()

    private val retrofit = Retrofit.Builder()
        .baseUrl(baseApiUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()

    fun <T> buildService(service: Class<T>): T {
        return retrofit.create(service)
    }
}