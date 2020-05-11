package com.example.mycardapp

import android.content.Intent
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class ActivityA : AppCompatActivity(R.layout.activity_a) {

    fun onOpenBButtonClick(view: View) {
        val intent = Intent(Intent.ACTION_SEND)
            .setType("text/plain")
            .putExtra(Intent.EXTRA_TEXT, "Webinar GDG")
        startActivity(Intent.createChooser(intent, "Wybierz apkę"))
    }
}
