package com.example.mycardapp

import android.app.Activity
import android.content.Intent
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

private const val PICK_IMAGE_REQUEST_CODE = 1

class ActivityA : AppCompatActivity(R.layout.activity_a) {

    fun onOpenBButtonClick(view: View) {
        val intent = Intent(Intent.ACTION_GET_CONTENT)
            .setType("image/*")
        startActivityForResult(
            Intent.createChooser(intent, "Wybierz apkę"),
            PICK_IMAGE_REQUEST_CODE
        )
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == PICK_IMAGE_REQUEST_CODE && resultCode == Activity.RESULT_OK && data != null) {
            findViewById<ImageView>(R.id.image).setImageURI(data.data)
        }
    }
}
