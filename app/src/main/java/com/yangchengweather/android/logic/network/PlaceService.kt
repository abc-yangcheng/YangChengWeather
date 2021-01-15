package com.yangchengweather.android.logic.network


import com.yangchengweather.android.SunnyWeatherApplication
import com.yangchengweather.android.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService  {

    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces (@Query("query") query: String) : Call<PlaceResponse>

}