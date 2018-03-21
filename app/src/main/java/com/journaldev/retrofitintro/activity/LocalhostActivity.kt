package com.journaldev.retrofitintro.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

import com.journaldev.retrofitintro.api.apilocalhost.APIClientLocalhost
import com.journaldev.retrofitintro.api.apilocalhost.APIInterfaceLocalhost
import com.journaldev.retrofitintro.R

import com.journaldev.retrofitintro.pojo.pojolocalhost.User
import com.journaldev.retrofitintro.utils.ToastIt

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LocalhostActivity : AppCompatActivity() {

    internal lateinit var responseText: TextView
    internal lateinit var apiInterfaceLocalhost: APIInterfaceLocalhost

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        responseText = findViewById<View>(R.id.responseText) as TextView
        apiInterfaceLocalhost = APIClientLocalhost.client.create(APIInterfaceLocalhost::class.java)

        /**
         * Create new user
         */
        val user = User("fisio@invalid.com", "12345678")
        val callPostNewUser = apiInterfaceLocalhost.createUser(user)
        callPostNewUser.enqueue(object : Callback<User> {
            override fun onResponse(call: Call<User>, response: Response<User>) {
                val user1 = response.body()

                ToastIt(applicationContext, user1!!.email + " " + user1.password + " " + user1.token)

            }

            override fun onFailure(call: Call<User>, t: Throwable) {
                call.cancel()
            }
        })

    }
}
