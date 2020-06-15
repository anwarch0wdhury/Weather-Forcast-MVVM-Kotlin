package com.anwar.weatherforcastmvvm.network


import com.anwar.weatherforcastmvvm.features.showinfo.model.dataclass.WeatherInfoResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
    @GET("weather")
    fun callApiForWeatherInfo(@Query("id") cityId: Int): Call<WeatherInfoResponse>

    @GET("weather")
    fun callApiForgpsWeatherInfo(@Query("lat") lat: Double, @Query("lon") lon: Double): Call<WeatherInfoResponse>

}