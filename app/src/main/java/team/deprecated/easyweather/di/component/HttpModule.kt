package team.deprecated.easyweather.di.component

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import team.deprecated.easyweather.ApplicationVersionSwitch
import team.deprecated.easyweather.api.WeaterApi
import javax.inject.Singleton

/**
 * Created by Łukasz on 2017-06-30.
 */
@Module
class HttpModule{

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient):Retrofit = Retrofit.Builder()
            .baseUrl(ApplicationVersionSwitch.SERVICE_ADDRES)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(okHttpClient)
            .build()

    @Provides
    @Singleton
    fun proviceHttpLogging(): OkHttpClient{
        val logging = HttpLoggingInterceptor()
        return OkHttpClient.Builder()
                .addInterceptor(logging)
                .build()
    }

    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit):WeaterApi = retrofit.create(WeaterApi::class.java)
}