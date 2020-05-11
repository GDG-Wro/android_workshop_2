package com.example.mycardapp

import android.net.Uri
import android.view.View
import android.widget.ImageView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class ActivityA : AppCompatActivity(R.layout.activity_a) {

    private val pickImageLauncher =
        registerForActivityResult(ActivityResultContracts.GetContent(), ::onItemPicked)

    fun onOpenBButtonClick(view: View) {
        pickImageLauncher.launch("image/*")
    }

    private fun onItemPicked(uri: Uri?) {
        if (uri != null) {
            findViewById<ImageView>(R.id.image).setImageURI(uri)
        }
    }
}
