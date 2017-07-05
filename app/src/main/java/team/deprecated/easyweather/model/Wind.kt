package team.deprecated.easyweather.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Łukasz on 2017-07-04.
 */
class Wind(@SerializedName("speed") val speed: String, @SerializedName("deg") val deg: String)