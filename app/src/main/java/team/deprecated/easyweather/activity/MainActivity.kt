package team.deprecated.easyweather.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
<<<<<<< HEAD:app/src/main/java/team/deprecated/easyweather/MainActivity.kt
import com.hannesdorfmann.mosby3.mvp.MvpActivity
import team.deprecated.easyweather.mvp.MainPresenter
import team.deprecated.easyweather.mvp.MainPresenterImpl
import team.deprecated.easyweather.mvp.MainView
=======
import team.deprecated.easyweather.R
>>>>>>> 7773a7dfca3a05bca49828f22e8028de2198b2cf:app/src/main/java/team/deprecated/easyweather/activity/MainActivity.kt

class MainActivity : MvpActivity<MainView, MainPresenter>(), MainView{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun createPresenter(): MainPresenter = MainPresenterImpl()
}
