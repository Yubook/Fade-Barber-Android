package com.youbook.fadedriver.ui.review

import com.youbook.fadedriver.network.MyApi
import com.youbook.fadedriver.repository.BaseRepository

class ReviewRepository constructor(private val api : MyApi) : BaseRepository() {

    suspend fun getReview(
    ) = safeApiCall {
        api.getReview()
    }
}
