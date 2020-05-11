package com.example.mycardapp

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import kotlin.random.Random

class WarningDialogFragment : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?) =
        AlertDialog.Builder(requireContext())
            .setTitle("Warning")
            .setMessage("test " + Random.nextInt())
            .create()
}