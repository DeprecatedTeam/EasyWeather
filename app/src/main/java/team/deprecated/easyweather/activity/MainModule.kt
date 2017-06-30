package team.deprecated.easyweather.activity

import dagger.Binds
import dagger.Module
import team.deprecated.easyweather.activity.mvp.MainPresenter
import team.deprecated.easyweather.activity.mvp.MainPresenterImpl

@Module
abstract class MainModule {

    @Binds
    abstract fun provideActivity(activity : MainActivity): MainActivity

    @Binds
    abstract fun providePresenter(presenter: MainPresenterImpl): MainPresenter
}