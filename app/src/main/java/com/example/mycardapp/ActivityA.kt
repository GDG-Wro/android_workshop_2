package com.example.mycardapp

import android.content.Intent
import android.net.Uri
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class ActivityA : AppCompatActivity(R.layout.activity_a) {

    fun onOpenBButtonClick(view: View) {
        val intent = Intent(Intent.ACTION_VIEW)
            .setData(Uri.parse("https://google.pl"))
        startActivity(intent)
    }
}
