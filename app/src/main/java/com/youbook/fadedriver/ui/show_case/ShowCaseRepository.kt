package com.youbook.fadedriver.ui.show_case

import com.youbook.fadedriver.network.MyApi
import com.youbook.fadedriver.repository.BaseRepository

class ShowCaseRepository constructor(private val api: MyApi) : BaseRepository() {

    suspend fun getBarberPortfolio(
    ) = safeApiCall {
        api.getBarberPortfolio()
    }

    suspend fun deletePortfolioImage(
        portfolioId: String
    ) = safeApiCall {
        api.removePortfolio(portfolioId)
    }
}