package team.deprecated.easyweather.activity.mvp


class MainPresenterImpl: MainPresenter {

    var mainView: MainView? = null

    override fun attachView(view: MainView?) = view.let { mainView = it }

    override fun detachView(retainInstance: Boolean) {
        mainView = null
    }

}