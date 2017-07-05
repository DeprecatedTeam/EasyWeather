package team.deprecated.easyweather.activity

import android.Manifest
import android.annotation.SuppressLint
import android.content.Context
import android.content.pm.PackageManager
import android.location.LocationManager
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import team.deprecated.easyweather.R
import team.deprecated.easyweather.activity.mvp.MainPresenter
import team.deprecated.easyweather.activity.mvp.MainView
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
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }

    override fun provideLocation(lon: Double, lan: Double) {
//        zrób coś z tym
    }

    fun getLocation(){
        var locationManager:LocationManager = getSystemService(Context.LOCATION_SERVICE) as LocationManager
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,5000,10f,MyLocationListener(this))
    }

}
