package team.deprecated.easyweather.data.sharedprefs

interface AppSharedPrefs {
    fun setDefaultLocation(defaultLocation: String)
    fun getDefaultLocation() : String
}