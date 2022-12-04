package com.youbook.fadedriver.ui.select_country

import com.youbook.fadedriver.network.MyApi
import com.youbook.fadedriver.repository.BaseRepository


class SelectCountryRepository constructor(private val api : MyApi) : BaseRepository() {

    suspend fun getCountryCode() = safeApiCall {
        api.getCountryCode()
    }

}