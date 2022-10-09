package com.example.clonetokped.util

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences

// SharedPreferences untuk menyimpan informasi login
class Prefs(activity: Activity) {

    private var sPref : SharedPreferences
    private var sPrefEditor : SharedPreferences.Editor
    private val login = "Login"

    // Yg pertama kali dipanggil untuk inisiasi ShredPreferences
    init {
        sPref = activity.getSharedPreferences("mySP", Context.MODE_PRIVATE)
        sPrefEditor = sPref.edit()
    }

    fun setIsLogin(value: Boolean) {
        sPrefEditor.apply {
            putBoolean(login, value)
        }
    }

    fun getIsLogin() : Boolean {
        return sPref.getBoolean(login, false)
    }

}