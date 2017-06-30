package team.deprecated.easyweather.activity.mvp

/**
 * Created by kpiega on 29.06.2017.
 */

class MainPresenterImpl: MainPresenter {

    var mainView: MainView? = null

    override fun attachView(view: MainView?) = view.let { mainView = it }

    override fun detachView(retainInstance: Boolean) {
        mainView = null
    }

}