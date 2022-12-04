package com.youbook.fadedriver.ui.code_verify

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.youbook.fadedriver.base.BaseViewModel
import com.youbook.fadedriver.network.Resource
import com.youbook.fadedriver.ui.profile.ProfileResponseNew
import kotlinx.coroutines.launch

class CodeVerifyViewModel constructor(private val repository: CodeVerifyRepository) :
    BaseViewModel(repository) {
    private val _loginResponse: MutableLiveData<Resource<ProfileResponseNew>> = MutableLiveData()
    val loginResponse: LiveData<Resource<ProfileResponseNew>>
        get() = _loginResponse

    suspend fun login(
        mobile: String,
        phone_code : String
    ) = viewModelScope.launch {
        _loginResponse.value = Resource.Loading
        _loginResponse.value = repository.login(mobile,phone_code)
    }
}