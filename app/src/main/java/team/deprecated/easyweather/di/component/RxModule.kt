package team.deprecated.easyweather.di.component

import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import team.deprecated.easyweather.di.scope.ApplicationScope

/**
 * Created by Łukasz on 2017-07-03.
 */
@Module
class RxModule{
    @Provides
    @ApplicationScope
    fun provideCompositeDisposable() = CompositeDisposable()
}