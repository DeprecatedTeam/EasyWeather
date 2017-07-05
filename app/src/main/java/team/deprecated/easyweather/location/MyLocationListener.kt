package team.deprecated.easyweather.location

import android.location.Location
import android.location.LocationListener
import android.os.Bundle

/**
 * Created by Łukasz on 2017-07-04.
 */
class MyLocationListener
constructor(var locationProvider: LocationProvider): LocationListener {
    override fun onLocationChanged(location: Location?) {
        locationProvider.provideLocation(location!!.longitude,location!!.latitude)
    }

    override fun onStatusChanged(provider: String?, status: Int, extras: Bundle?) {
    }

    override fun onProviderEnabled(provider: String?) {
    }

    override fun onProviderDisabled(provider: String?) {
    }

}