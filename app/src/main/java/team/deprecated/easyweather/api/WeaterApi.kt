package team.deprecated.easyweather.api

import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Łukasz on 2017-06-30.
 */
interface WeaterApi {

    @GET("")
    fun GetWeater(@Query("q") city: String,
                  @Query("APPID") key:String)

}