package com.anwar.weatherforcastmvvm.features.showinfo.model

import com.anwar.weatherforcastmvvm.features.showinfo.model.dataclass.City
import com.anwar.weatherforcastmvvm.features.showinfo.model.dataclass.WeatherInfoResponse
import com.anwar.weatherforcastmvvm.common.RequestCompleteListener


interface WeatherInfoShowModel {
    fun getCityList(callback: RequestCompleteListener<MutableList<City>>)
    fun getWeatherInfo(cityId: Int, callback: RequestCompleteListener<WeatherInfoResponse>)
    fun getWeathergpsInfo(lat:Double,lan:Double, callback: RequestCompleteListener<WeatherInfoResponse>)
}