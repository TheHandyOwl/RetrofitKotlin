package com.journaldev.retrofitintro.pojo.pojolocalhost

import com.google.gson.annotations.SerializedName


class User (@field:SerializedName("email")
        var email: String,
        @field:SerializedName("password")
        var password: String) {

        @SerializedName("token")
        var token: String? = null

}
