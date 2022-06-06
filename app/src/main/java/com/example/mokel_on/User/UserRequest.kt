package com.example.mokel_on.User

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class userRequest {
    @SerializedName("email")
    @Expose
    var email: String? = null

    @SerializedName("password")
    @Expose
    var password: String? = null
}