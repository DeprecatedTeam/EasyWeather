package team.deprecated.easyweather.api

import io.reactivex.disposables.Disposable
import io.reactivex.observers.DisposableSingleObserver
import team.deprecated.easyweather.model.BaseResponse

/**
 * Created by Łukasz on 2017-06-30.
 */

interface WeaterApi {
    fun featchWeater(observ:DisposableSingleObserver<BaseResponse>) : Disposable
}