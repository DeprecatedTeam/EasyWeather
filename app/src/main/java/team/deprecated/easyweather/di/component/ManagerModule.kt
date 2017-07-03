package team.deprecated.easyweather.di.component

import dagger.Binds
import dagger.Module
import team.deprecated.easyweather.api.ApiManager
import team.deprecated.easyweather.api.WeaterApi
import team.deprecated.easyweather.di.scope.ApplicationScope

/**
 * Created by Łukasz on 2017-07-03.
 */
@Module
abstract class ManagerModule{

    @Binds
    @ApplicationScope
    abstract fun provideApiManager(manager: ApiManager):WeaterApi
}