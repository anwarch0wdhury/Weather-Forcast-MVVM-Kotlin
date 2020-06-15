package com.anwar.weatherforcastmvvm.features.showinfo.model.dataclass


import com.google.gson.annotations.SerializedName

data class Clouds(
        @SerializedName("all")
        val all: Int = 0
)