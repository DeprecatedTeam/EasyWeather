package team.deprecated.easyweather.activity.mvp

import android.content.SharedPreferences
import team.deprecated.easyweather.data.sharedprefs.AppSharedPrefs
import javax.inject.Inject


class MainPresenterImpl : MainPresenter {
    var mainView : MainView? = null
    @Inject
    lateinit var sharedPrefs : AppSharedPrefs


    override fun setDefaultLocation(location: String) {
        sharedPrefs.setDefaultLocation(location)
        var location  = sharedPrefs.getDefaultLocation()
        location.toString()
    }


    override fun attachView(view: MainView?) = view.let { mainView = it }

    override fun detachView(retainInstance: Boolean) { mainView = null }

}