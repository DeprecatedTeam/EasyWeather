package team.deprecated.easyweather.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Łukasz on 2017-07-04.
 */
class Coord(@SerializedName("lon") val lon: String, @SerializedName("lat")val lat: String)