package com.youbook.fadedriver.ui.your_availability

import com.youbook.fadedriver.network.MyApi
import com.youbook.fadedriver.repository.BaseRepository

class YourAvailabilityRepository(private val api: MyApi) : BaseRepository() {

    suspend fun getTimesSlots(
    ) = safeApiCall {
        api.getTimesSlots()
    }

    suspend fun addBarberTime(
        dateList : ArrayList<String>,
        slotTimeList : ArrayList<String>,
    ) = safeApiCall {
        api.addBarberTime(dateList, slotTimeList)
    }

}