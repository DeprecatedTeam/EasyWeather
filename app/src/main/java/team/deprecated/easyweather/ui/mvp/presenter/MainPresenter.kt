package team.deprecated.easyweather.ui.mvp.presenter

import com.hannesdorfmann.mosby3.mvp.MvpPresenter
import team.deprecated.easyweather.ui.mvp.view.MainView

interface MainPresenter : MvpPresenter<MainView> {
    fun testRequest()
}
