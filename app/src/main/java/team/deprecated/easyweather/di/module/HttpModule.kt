package team.deprecated.easyweather.di.component

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import team.deprecated.easyweather.ApplicationVersionSwitch
import team.deprecated.easyweather.api.WeatherService
import team.deprecated.easyweather.di.scope.ApplicationScope

/**
 * Created by Łukasz on 2017-06-30.
 */
@Module
class HttpModule{

    @Provides
    @ApplicationScope
    fun provideRetrofit(okHttpClient: OkHttpClient):Retrofit = Retrofit.Builder()
            .baseUrl(ApplicationVersionSwitch.SERVICE_ADDRES)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(okHttpClient)
            .build()

    @Provides
    @ApplicationScope
    fun proviceHttpLogging(): OkHttpClient{
        val logging = HttpLoggingInterceptor()
        return OkHttpClient.Builder()
                .addInterceptor(logging)
                .build()
    }

    @Provides
    @ApplicationScope
    fun provideApiService(retrofit: Retrofit):WeatherService = retrofit.create(WeatherService::class.java)
}