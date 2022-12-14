package com.youbook.fadedriver.ui.select_services

import com.youbook.fadedriver.network.MyApi
import com.youbook.fadedriver.repository.BaseRepository

class SelectServiceRepository(private val api: MyApi) : BaseRepository() {
    suspend fun getServices(
    ) = safeApiCall {
        api.getService()
    }

    suspend fun addBarberService(
        serviceList: List<Int>,
        priceList: List<Double>
    ) = safeApiCall {
        api.addBarberService(serviceList, priceList)
    }

    suspend fun getBarberService(
    ) = safeApiCall {
        api.getBarberService()
    }

    suspend fun removeBarberService(
        serviceId: String
    ) = safeApiCall {
        api.removeBarberService(serviceId)
    }
}