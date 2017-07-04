package team.deprecated.easyweather.activity.mvp

import com.hannesdorfmann.mosby3.mvp.MvpPresenter

interface MainPresenter : MvpPresenter<MainView> {
fun setDefaultLocation(location : String)
}
