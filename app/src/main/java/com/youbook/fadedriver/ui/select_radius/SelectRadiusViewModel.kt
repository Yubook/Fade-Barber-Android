package com.youbook.fadedriver.ui.select_radius

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.youbook.fadedriver.base.BaseViewModel
import com.youbook.fadedriver.network.CommonResponse
import com.youbook.fadedriver.network.Resource
import kotlinx.coroutines.launch

class SelectRadiusViewModel constructor(private val repository: SelectRadiusRepository) :
    BaseViewModel(repository) {

    private val _selectRadiusResponse: MutableLiveData<Resource<CommonResponse>> = MutableLiveData()
    val selectRadiusResponse: LiveData<Resource<CommonResponse>>
        get() = _selectRadiusResponse


    suspend fun addBarberService(
        params: Map<String,String>
    ) = viewModelScope.launch {
        _selectRadiusResponse.value = Resource.Loading
        _selectRadiusResponse.value = repository.addDriverRadius(params)
    }
}