package com.youbook.fadedriver.ui.show_case

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.youbook.fadedriver.base.BaseViewModel
import com.youbook.fadedriver.network.CommonResponse
import com.youbook.fadedriver.network.Resource
import kotlinx.coroutines.launch

class ShowCaseViewModel constructor(private val repository: ShowCaseRepository) : BaseViewModel(repository){

    private val _barberPortfolioResponse: MutableLiveData<Resource<BarberPortfolioResponse>> = MutableLiveData()
    val barberPortfolioResponse: LiveData<Resource<BarberPortfolioResponse>>
        get() = _barberPortfolioResponse

    private val _deletePortfolioImageResponse: MutableLiveData<Resource<CommonResponse>> = MutableLiveData()
    val deletePortfolioImageResponse: LiveData<Resource<CommonResponse>>
        get() = _deletePortfolioImageResponse

    suspend fun getBarberPortfolio(
    ) = viewModelScope.launch {
        _barberPortfolioResponse.value = Resource.Loading
        _barberPortfolioResponse.value = repository.getBarberPortfolio()
    }

    suspend fun deletePortfolioImage(
        portfolioId : String
    ) = viewModelScope.launch {
        _deletePortfolioImageResponse.value = Resource.Loading
        _deletePortfolioImageResponse.value = repository.deletePortfolioImage(portfolioId)
    }
}