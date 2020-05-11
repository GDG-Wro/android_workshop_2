package com.example.mycardapp

import android.content.Intent
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class ActivityA : AppCompatActivity(R.layout.activity_a) {

    fun onOpenBButtonClick(view: View) {
        val intent = Intent("com.example.show.b")
        startActivity(intent)
    }
}
