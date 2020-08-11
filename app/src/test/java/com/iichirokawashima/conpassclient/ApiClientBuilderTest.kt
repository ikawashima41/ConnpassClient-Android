package com.iichirokawashima.conpassclient

import com.iichirokawashima.conpassclient.API.ApiClientBuilder
import com.iichirokawashima.conpassclient.API.ApiClientInterface
import com.iichirokawashima.conpassclient.Entity.Events
import org.junit.Test

import org.junit.Assert.*
import retrofit2.Call
import retrofit2.Response
// https://dev.to/paulodhiambo/kotlin-and-retrofit-network-calls-2353

class ApiClientBuilderTest {

    @Test
    fun buildService() {
        val request = ApiClientBuilder.buildService(
            ApiClientInterface::class.java).fetchEvents(query = "swift")
        request.enqueue(object : retrofit2.Callback<List<Events>>{
            override fun onResponse(call: Call<List<Events>>, response: Response<List<Events>>) {
                if (response.isSuccessful){
                    assertNotNull(response.body())
                }
            }
            override fun onFailure(call: Call<List<Events>>, t: Throwable) {
                assertNotNull(null)
            }
        })
    }
}