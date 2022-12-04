package com.youbook.fadedriver.ui.select_radius

import com.youbook.fadedriver.network.MyApi
import com.youbook.fadedriver.repository.BaseRepository

class SelectRadiusRepository (private val api: MyApi) : BaseRepository(){
    suspend fun addDriverRadius(
        params: Map<String,String>
    ) = safeApiCall {
        api.addDriverRadius(params)
    }

}