package com.example.mycardapp

import android.content.Intent
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class ActivityA : AppCompatActivity(R.layout.activity_a) {

    fun onOpenBButtonClick(view: View) {
        val intent = Intent(this, ActivityB::class.java)
            .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
            .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        println(intent.flags and Intent.FLAG_ACTIVITY_CLEAR_TASK)
        startActivity(intent)
    }
}
