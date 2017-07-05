package team.deprecated.easyweather.di.module

import dagger.Module
import dagger.Provides
import team.deprecated.easyweather.ApplicationVersionSwitch
import team.deprecated.easyweather.di.qualifier.SharedInfo

@Module
class InfoModule {
    @Provides
    @SharedInfo
    fun provideSharedPrefsInfo() = ApplicationVersionSwitch.Companion.SHARED_PREFERENCES_NAME
}