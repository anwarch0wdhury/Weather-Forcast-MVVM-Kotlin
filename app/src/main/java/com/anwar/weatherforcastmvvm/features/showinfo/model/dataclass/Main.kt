package com.anwar.weatherforcastmvvm.features.showinfo.model.dataclass


import com.google.gson.annotations.SerializedName

data class Main(
        @SerializedName("temp")
        val temp: Double = 0.0,
        @SerializedName("feels_like")
        val feels_like: Double = 0.0,
        @SerializedName("pressure")
        val pressure: Double = 0.0,
        @SerializedName("humidity")
        val humidity: Int = 0,
        @SerializedName("temp_min")
        val tempMin: Double = 0.0,
        @SerializedName("temp_max")
        val tempMax: Double = 0.0
)