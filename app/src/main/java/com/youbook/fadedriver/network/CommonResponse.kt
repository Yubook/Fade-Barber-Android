package com.youbook.fadedriver.network

import com.google.gson.annotations.SerializedName

data class CommonResponse(

	@field:SerializedName("success")
	val success: Boolean? = null,

	@field:SerializedName("message")
	val message: String? = null
)
