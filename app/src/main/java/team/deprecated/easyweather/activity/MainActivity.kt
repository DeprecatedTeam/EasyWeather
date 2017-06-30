package team.deprecated.easyweather.activity

import android.os.Bundle
import com.hannesdorfmann.mosby3.mvp.MvpActivity
import team.deprecated.easyweather.R
import team.deprecated.easyweather.activity.mvp.MainPresenter
import team.deprecated.easyweather.activity.mvp.MainPresenterImpl
import team.deprecated.easyweather.activity.mvp.MainView

class MainActivity : MvpActivity<MainView, MainPresenter>(), MainView{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun createPresenter(): MainPresenter = MainPresenterImpl()
}
