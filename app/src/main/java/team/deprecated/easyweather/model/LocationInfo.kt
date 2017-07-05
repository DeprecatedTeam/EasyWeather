package team.deprecated.easyweather.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Łukasz on 2017-07-04.
 */
class LocationInfo(@SerializedName("type") val type: String, @SerializedName("id") val id: String,
                   @SerializedName("message") val message: String, @SerializedName("country") val country: String,
                   @SerializedName("sunrise") val sunrise: String, @SerializedName("sunset") val sunset: String)