package com.example.coinswap.data.remote

import com.example.coinswap.data.remote.dto.CurrencyDto
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyApi {


    @GET("v6/0771fe64b3840e58d332e873/latest/USD")
    suspend fun getLatestRates(): CurrencyDto

    companion object {
        const val API_KEY = "0771fe64b3840e58d332e873"
        //const val BASE_URL = "https://api.freecurrencyapi.com/"
        const val BASE_URL = "https://v6.exchangerate-api.com/"
    }

}