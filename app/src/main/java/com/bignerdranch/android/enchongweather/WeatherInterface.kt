package com.bignerdranch.android.enchongweather

import com.bignerdranch.android.enchongweather.Model.Weather
import retrofit2.http.GET
import retrofit2.http.Query
import rx.Observable

interface WeatherInterface {
    @GET("forecast")
    fun getWeather(
            @Query("q") q: String,
            @Query("appid") key: String
    ): Observable<Weather>

}
