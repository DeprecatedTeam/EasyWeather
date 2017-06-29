package team.deprecated.easyweather

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.hannesdorfmann.mosby3.mvp.MvpActivity
import team.deprecated.easyweather.mvp.MainPresenter
import team.deprecated.easyweather.mvp.MainPresenterImpl
import team.deprecated.easyweather.mvp.MainView

class MainActivity : MvpActivity<MainView, MainPresenter>(), MainView{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun createPresenter(): MainPresenter = MainPresenterImpl()
}
