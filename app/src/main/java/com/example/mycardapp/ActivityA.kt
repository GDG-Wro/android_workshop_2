package com.example.mycardapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit

class ActivityA : AppCompatActivity(R.layout.activity_a) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportFragmentManager.commit {
            replace(R.id.fragmentContainer, FragmentA())
        }
    }
}
