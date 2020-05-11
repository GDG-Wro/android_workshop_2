package com.example.mycardapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class ActivityB : AppCompatActivity(R.layout.activity_b) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        findViewById<TextView>(R.id.label).text = "${Random.nextInt()}"
    }

    fun onOpenBAgainButtonClick(view: View) {
        startActivity(Intent(this, this::class.java))
    }
}
