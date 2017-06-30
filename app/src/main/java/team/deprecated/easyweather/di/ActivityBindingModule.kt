package team.deprecated.easyweather.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import team.deprecated.easyweather.activity.MainActivity
//import team.deprecated.easyweather.activity.MainModule
import team.deprecated.easyweather.di.scope.ActivityScope

@Module
abstract class ActivityBindingModule {

    @ContributesAndroidInjector
    @ActivityScope
    abstract fun bindMainActivity(): MainActivity

}
