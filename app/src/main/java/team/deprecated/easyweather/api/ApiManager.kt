package team.deprecated.easyweather.api

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers
import team.deprecated.easyweather.ApplicationVersionSwitch
import team.deprecated.easyweather.model.WeatherResponse
import javax.inject.Inject

/**
 * Created by Łukasz on 2017-07-03.
 */

class ApiManager
@Inject constructor(var service: WeatherService):WeaterApi {

    override fun featchWeater(observ: DisposableSingleObserver<WeatherResponse>): Disposable =
            service.GetWeater("katowice,pl", ApplicationVersionSwitch.SECRET_KEY)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribeWith(observ)
}

