package team.deprecated.easyweather.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Łukasz on 2017-07-04.
 */
class Weather(@SerializedName("id") val id: String, @SerializedName("icon") val icon: String, @SerializedName("description") val description: String,
              @SerializedName("main") val main: String)