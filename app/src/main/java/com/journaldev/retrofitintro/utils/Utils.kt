package com.journaldev.retrofitintro.utils

import android.content.Context
import android.util.Log
import android.widget.Toast

fun ToastIt(context: Context, msg: String) {
    Log.d("App", msg)
    Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
}
