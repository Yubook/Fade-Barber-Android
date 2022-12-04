package com.youbook.fadedriver.ui.notification

import com.youbook.fadedriver.network.MyApi
import com.youbook.fadedriver.repository.BaseRepository

class NotificationListRepository(private val api: MyApi) : BaseRepository() {

    suspend fun getNotification(
    ) = safeApiCall {
        api.getNotification()
    }

    suspend fun readNotification(
    ) = safeApiCall {
        api.readNotification()
    }

}