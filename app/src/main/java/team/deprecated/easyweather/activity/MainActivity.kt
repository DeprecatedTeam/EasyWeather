package team.deprecated.easyweather.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.hannesdorfmann.mosby3.mvp.MvpActivity
import team.deprecated.easyweather.R
import team.deprecated.easyweather.activity.mvp.MainPresenter
import team.deprecated.easyweather.activity.mvp.MainPresenterImpl
import team.deprecated.easyweather.activity.mvp.MainView

<<<<<<< HEAD
class MainActivity : BaseActivity() {
=======
class MainActivity : MvpActivity<MainView, MainPresenter>(), MainView{
>>>>>>> 3cae5f72310743232bb11940951f468ccd72a0c0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun createPresenter(): MainPresenter = MainPresenterImpl()
}
