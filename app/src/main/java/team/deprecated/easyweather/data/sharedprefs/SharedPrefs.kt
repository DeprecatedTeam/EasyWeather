package team.deprecated.easyweather.data.sharedprefs

import android.content.Context
import team.deprecated.easyweather.di.qualifier.ApplicationContext
import team.deprecated.easyweather.di.qualifier.SharedInfo
import team.deprecated.easyweather.di.scope.ApplicationScope
import javax.inject.Inject

@ApplicationScope
class SharedPrefs
@Inject constructor(@ApplicationContext private  val context: Context, @SharedInfo private val prefsName: String) : AppSharedPrefs {
    val DEFAULT_LOCATION = "default_location"
    private val prefs = context.getSharedPreferences(prefsName, Context.MODE_PRIVATE)
    override fun setDefaultLocation(defaultLocation: String) = prefs.edit().putString(DEFAULT_LOCATION, defaultLocation).apply()

    override fun getDefaultLocation(): String = prefs.getString(DEFAULT_LOCATION, "")

}