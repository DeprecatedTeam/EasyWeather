package team.deprecated.easyweather.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import team.deprecated.easyweather.activity.MainActivity
import team.deprecated.easyweather.activity.MainModule
//import team.deprecated.easyweather.activity.MainModule
import team.deprecated.easyweather.di.scope.ActivityScope

@Module
abstract class ActivityBindingModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = arrayOf(
            MainModule::class
    ))
    abstract fun bindMainActivity(): MainActivity

}
