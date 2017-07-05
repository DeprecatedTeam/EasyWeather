package team.deprecated.easyweather.ui.mvp.implementation

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import team.deprecated.easyweather.ui.mvp.presenter.MainPresenter
import team.deprecated.easyweather.ui.mvp.view.MainView
import team.deprecated.easyweather.api.WeaterApi
import team.deprecated.easyweather.data.sharedprefs.AppSharedPrefs
import team.deprecated.easyweather.model.WeatherResponse
import javax.inject.Inject


class MainPresenterImpl
@Inject constructor(val disposable: CompositeDisposable, val manager: WeaterApi, val sharedPrefs :AppSharedPrefs)
    : MainPresenter {

    var mainView: MainView? = null

    override fun attachView(view: MainView?) = view.let { mainView = it }

    override fun detachView(retainInstance: Boolean) {
        mainView = null
    }

    override fun testRequest() {
        sharedPrefs.setDefaultLocation("TEST")
        val  location = sharedPrefs.getDefaultLocation()
        disposable.add(
                manager.featchWeater(object : DisposableSingleObserver<WeatherResponse>() {
                    override fun onError(e: Throwable?) {
                        e.toString()
                    }

                    override fun onSuccess(t: WeatherResponse?) {
                        t.toString()
                    }

                })
        )
    }


}