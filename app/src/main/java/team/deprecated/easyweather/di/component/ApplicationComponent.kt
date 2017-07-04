package team.deprecated.easyweather.di.component

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import team.deprecated.easyweather.WeatherApplication
import team.deprecated.easyweather.di.ActivityBindingModule
import team.deprecated.easyweather.di.module.SharedPreferencesModule
import team.deprecated.easyweather.di.scope.ApplicationScope

@Component(modules = arrayOf(
        AndroidSupportInjectionModule::class,
        ActivityBindingModule::class,
       SharedPreferencesModule::class
))
@ApplicationScope
interface ApplicationComponent : AndroidInjector<WeatherApplication> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<WeatherApplication>()
}
