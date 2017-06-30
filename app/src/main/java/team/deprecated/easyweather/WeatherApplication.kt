package team.deprecated.easyweather

import com.squareup.leakcanary.LeakCanary
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import team.deprecated.easyweather.di.component.DaggerApplicationComponent


class WeatherApplication : DaggerApplication() {
    override fun onCreate() {
        super.onCreate()
        if (LeakCanary.isInAnalyzerProcess(this)) {
            return
        }
        LeakCanary.install(this)
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication>
            = DaggerApplicationComponent.builder().create(this)

}