package team.deprecated.easyweather.location

/**
 * Created by Łukasz on 2017-07-04.
 */
interface LocationProvider{
    fun provideLocation(lon:Double, lan:Double)
}