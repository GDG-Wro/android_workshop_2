package com.example.mycardapp

import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_a.*
import kotlin.random.Random

class ActivityA : AppCompatActivity(R.layout.activity_a) {

    private val pickImageLauncher =
        registerForActivityResult(ActivityResultContracts.GetContent(), ::onItemPicked)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        label.text = "${Random.nextInt()}"
    }

    fun onOpenBButtonClick(view: View) {
        pickImageLauncher.launch("image/*")
    }

    private fun onItemPicked(uri: Uri?) {
        if (uri != null) {
            findViewById<ImageView>(R.id.image).setImageURI(uri)
        }
    }
}
