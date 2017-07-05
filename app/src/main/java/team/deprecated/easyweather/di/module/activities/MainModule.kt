package team.deprecated.easyweather.di.module.activities

import dagger.Binds
import dagger.Module
import team.deprecated.easyweather.di.scope.ActivityScope
import team.deprecated.easyweather.ui.activity.MainActivity
import team.deprecated.easyweather.ui.mvp.presenter.MainPresenter
import team.deprecated.easyweather.ui.mvp.implementation.MainPresenterImpl

@Module
abstract class MainModule {
    @Binds
    @ActivityScope
    abstract fun provideActivity(activity : MainActivity): MainActivity

    @Binds
    @ActivityScope
    abstract fun providePresenter(presenter: MainPresenterImpl): MainPresenter
}