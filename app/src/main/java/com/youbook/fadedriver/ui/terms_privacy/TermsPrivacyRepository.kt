package com.youbook.fadedriver.ui.terms_privacy

import com.youbook.fadedriver.network.MyApi
import com.youbook.fadedriver.repository.BaseRepository

class TermsPrivacyRepository(private val api: MyApi) : BaseRepository() {

    // 2 = Driver
    suspend fun getTermsPolicy(
    ) = safeApiCall {
        api.getTermsPolicy("2")
    }

}