package team.deprecated.easyweather.di.module

import dagger.Binds
import dagger.Module
import dagger.Provides
import team.deprecated.easyweather.data.sharedprefs.AppSharedPrefs
import team.deprecated.easyweather.data.sharedprefs.SharedPrefs
import team.deprecated.easyweather.di.ApplicationModule
import team.deprecated.easyweather.di.scope.ApplicationScope
import javax.inject.Singleton

@Module(includes = arrayOf(
        ApplicationModule::class,
        InfoModule::class
))
abstract class SharedPreferencesModule {
    @Binds
    @ApplicationScope
    abstract fun providePreferences(preference: SharedPrefs): AppSharedPrefs
}