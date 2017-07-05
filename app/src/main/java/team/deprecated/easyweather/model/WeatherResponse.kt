package team.deprecated.easyweather.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Łukasz on 2017-07-04.
 */
class WeatherResponse(@SerializedName("coord") val coord:Coord,@SerializedName("weather") val weatherList:List<Weather>,
                      @SerializedName("main") val weaterValues:WeatherValues, @SerializedName("wind") val wind: Wind,
                      @SerializedName("clouds") val clouds:Clouds, @SerializedName("rain") val rain: Rain,
                      @SerializedName("sys") val locationInfo: LocationInfo)