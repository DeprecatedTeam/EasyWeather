package team.deprecated.easyweather.activity.mvp

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import team.deprecated.easyweather.api.WeaterApi
import team.deprecated.easyweather.model.BaseResponse
import javax.inject.Inject


class MainPresenterImpl
@Inject constructor(val disposable: CompositeDisposable, val manager: WeaterApi)
    : MainPresenter {

    var mainView: MainView? = null

    override fun attachView(view: MainView?) = view.let { mainView = it }

    override fun detachView(retainInstance: Boolean) {
        mainView = null
    }

    override fun testRequest() {
        disposable.add(
                manager.featchWeater(object : DisposableSingleObserver<BaseResponse>() {
                    override fun onError(e: Throwable?) {
                        e.toString()
                    }

                    override fun onSuccess(t: BaseResponse?) {
                        t.toString()
                    }

                })
        )
    }


}