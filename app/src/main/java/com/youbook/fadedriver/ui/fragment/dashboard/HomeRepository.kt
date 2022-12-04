package com.youbook.fadedriver.ui.fragment.dashboard
import com.youbook.fadedriver.network.MyApi
import com.youbook.fadedriver.repository.BaseRepository

class HomeRepository constructor(private val api : MyApi): BaseRepository() {

    suspend fun getOffer(
        params: Map<String,String>
    ) = safeApiCall {
        api.getOffer(params)
    }

    /*

    suspend fun getNearestDrivers(
    ) = safeApiCall {
        api.getNearestDriver()
    }

    suspend fun searchDriver(
        params: Map<String,String>
    ) = safeApiCall {
        api.searchDriver(params)
    }*/
}