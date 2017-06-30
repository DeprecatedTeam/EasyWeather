package team.deprecated.easyweather.activity

import dagger.Binds
import dagger.Module
import dagger.android.support.DaggerAppCompatActivity
import team.deprecated.easyweather.di.scope.ActivityScope

@Module
abstract class MainModule {
    @Binds
    abstract fun provideActivity(activity : MainActivity) : DaggerAppCompatActivity

}