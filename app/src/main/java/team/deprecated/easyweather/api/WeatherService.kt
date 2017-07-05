package team.deprecated.easyweather.api

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query
import team.deprecated.easyweather.model.WeatherResponse

/**
 * Created by Łukasz on 2017-07-03.
 */
interface WeatherService{
    @GET("weather?")
    fun GetWeater(@Query("q") city: String,
                  @Query("APPID") key:String) : Single<WeatherResponse>
}
