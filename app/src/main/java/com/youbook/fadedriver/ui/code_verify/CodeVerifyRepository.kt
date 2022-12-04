package com.youbook.fadedriver.ui.code_verify

import com.youbook.fadedriver.network.MyApi
import com.youbook.fadedriver.repository.BaseRepository

class CodeVerifyRepository constructor(private val api : MyApi) : BaseRepository() {

    suspend fun login(
        mobile: String,
        phone_code : String
    ) = safeApiCall {
        api.login(mobile,phone_code)
    }

}
