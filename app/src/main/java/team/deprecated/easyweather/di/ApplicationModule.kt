package team.deprecated.easyweather.di

import android.app.Application
import android.content.Context
import dagger.Binds
import dagger.Module
import team.deprecated.easyweather.WeatherApplication
import team.deprecated.easyweather.di.module.InfoModule
import team.deprecated.easyweather.di.qualifier.ApplicationContext
import team.deprecated.easyweather.di.scope.ApplicationScope

@Module(includes = arrayOf(
        InfoModule::class
))
abstract class ApplicationModule {

    @Binds
    @ApplicationScope
    abstract fun provideApplication(app: WeatherApplication): Application

    @Binds
    @ApplicationContext
    @ApplicationScope
    abstract fun provideContext(app: WeatherApplication): Context


}
