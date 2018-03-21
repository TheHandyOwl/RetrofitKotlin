package com.journaldev.retrofitintro.api.apilocalhost

import com.journaldev.retrofitintro.pojo.pojolocalhost.MultipleResource
import com.journaldev.retrofitintro.pojo.pojolocalhost.User
import com.journaldev.retrofitintro.pojo.pojolocalhost.UserList

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query


internal interface APIInterfaceLocalhost {

    @POST("/apiv1/users/authenticate")
    fun createUser(@Body user: User): Call<User>

}
