package  com.demo.advanced.daggerhilt.data.response.weather


import com.google.gson.annotations.SerializedName

data class Wind(
        @SerializedName("speed")
        val speed: Double = 0.0,
        @SerializedName("deg")
        val deg: Double = 0.0
)