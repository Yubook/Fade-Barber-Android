package com.youbook.fadedriver.ui.login

import com.youbook.fadedriver.network.MyApi
import com.youbook.fadedriver.repository.BaseRepository


class LoginRepository constructor(private val api : MyApi) : BaseRepository() {

    suspend fun getCountryCode() = safeApiCall {
        api.getCountryCode()
    }

}