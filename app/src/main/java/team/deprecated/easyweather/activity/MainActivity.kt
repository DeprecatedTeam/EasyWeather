package team.deprecated.easyweather.activity

import android.os.Bundle
import team.deprecated.easyweather.R
import team.deprecated.easyweather.activity.mvp.MainPresenter
import team.deprecated.easyweather.activity.mvp.MainView
import team.deprecated.easyweather.base.BaseActivity
import javax.inject.Inject
import javax.inject.Provider

class MainActivity : BaseActivity<MainView, MainPresenter>(), MainView {

    @Inject
    lateinit var daggerPresenter: Provider<MainPresenter>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun createPresenter(): MainPresenter = daggerPresenter.get()


}
