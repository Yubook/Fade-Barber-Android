package com.youbook.fadedriver.ui.fragment.profile_frag
import com.youbook.fadedriver.network.MyApi
import com.youbook.fadedriver.repository.BaseRepository

class ProfileFragRepository constructor(private val api : MyApi): BaseRepository() {

    suspend fun logoutUser(
    ) = safeApiCall {
        api.logout()
    }

    suspend fun getOffer(
        params: Map<String,String>
    ) = safeApiCall {
        api.getOffer(params)
    }

    suspend fun barberOnOff(
        status: Int
    ) = safeApiCall {
        api.barberOnOff(status)
    }
}