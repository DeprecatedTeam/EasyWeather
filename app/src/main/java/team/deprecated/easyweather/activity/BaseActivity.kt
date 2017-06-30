package team.deprecated.easyweather.activity

import android.os.Bundle
import android.os.PersistableBundle
import dagger.android.support.DaggerAppCompatActivity

/**
 * Created by Artur on 30.06.2017.
 */

abstract class BaseActivity : DaggerAppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
    }
}
