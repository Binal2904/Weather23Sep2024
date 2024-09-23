package  com.demo.advanced.daggerhilt.data.response.weather


import com.google.gson.annotations.SerializedName

data class Clouds(
        @SerializedName("all")
        val all: Int = 0
)