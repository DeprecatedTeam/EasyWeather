package team.deprecated.easyweather.ui.activity

import android.Manifest
import android.annotation.SuppressLint
import android.content.Context
import android.content.pm.PackageManager
import android.location.LocationManager
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import team.deprecated.easyweather.R
import team.deprecated.easyweather.ui.mvp.presenter.MainPresenter
import team.deprecated.easyweather.ui.mvp.view.MainView
import team.deprecated.easyweather.base.BaseActivity
import team.deprecated.easyweather.location.LocationProvider
import team.deprecated.easyweather.location.MyLocationListener

class MainActivity : BaseActivity<MainView, MainPresenter>(), MainView, LocationProvider {
    var permmision:String = Manifest.permission.ACCESS_FINE_LOCATION
    var permmisionReqiest: Int = 0x1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(ContextCompat.checkSelfPermission(this,permmision) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, arrayOf(permmision),permmisionReqiest)
        }else
            getLocation()
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        val per:String = permissions[0]
        if(per?.equals(permissions))
            getLocation()
    }

    override fun provideLocation(lon: Double, lan: Double) {
        presenter.getWeaterByCoordinates(lan.toString(),lon.toString())
    }

    @SuppressLint("MissingPermission")
    fun getLocation(){
        var locationManager:LocationManager = getSystemService(Context.LOCATION_SERVICE) as LocationManager
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,5000,10f,MyLocationListener(this))
    }
}
