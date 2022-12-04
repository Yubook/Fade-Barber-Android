package com.youbook.fadedriver.ui.payment_history


import com.youbook.fadedriver.network.MyApi
import com.youbook.fadedriver.repository.BaseRepository

class PaymentHistoryRepository constructor(private val api : MyApi) : BaseRepository() {

    suspend fun getUserOrders(
        user_id: String
    ) = safeApiCall {
        api.getPaymentHistory()
    }

}
