package team.deprecated.easyweather.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import team.deprecated.easyweather.activity.MainActivity
import team.deprecated.easyweather.activity.MainModule
import team.deprecated.easyweather.di.scope.ActivityScope

/**
 * Created by Artur on 30.06.2017.
 */
@Module
abstract class ActivityBindingModule {
    @ContributesAndroidInjector(modules = arrayOf(
            MainModule::class
    ))
    @ActivityScope
    abstract fun bindLoginActivity(): MainActivity

}
