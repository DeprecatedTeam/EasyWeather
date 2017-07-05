package team.deprecated.easyweather.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Łukasz on 2017-07-04.
 */
class WeatherValues(@SerializedName("humidity") val humidity: String, @SerializedName("pressure") val pressure: String,
                    @SerializedName("temp_max") val tempMax: String, @SerializedName("temp_min") val tempMin: String,
                    @SerializedName("temp") val temp: String, @SerializedName("sea_level") val seaLevel: String,
                    @SerializedName("grnd_level") val grndLevel: String)