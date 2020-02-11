package com.example.mycardapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main_constraint.*

class MainActivity : AppCompatActivity() {

    var numberOfTaps = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_constraint)

        //findViewById<TextView>(R.id.nameTextView).text = "Marian"

        tapsTextView.text = getString(R.string.number_of_taps, numberOfTaps)

        petDogButton.setOnClickListener {
            Log.d(this::class.java.simpleName, "number of taps: $numberOfTaps")
            numberOfTaps += 1

            tapsTextView.text = getString(R.string.number_of_taps, numberOfTaps)
        }
    }
}
