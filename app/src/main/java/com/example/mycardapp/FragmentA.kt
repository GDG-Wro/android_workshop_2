package com.example.mycardapp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_a.*

class FragmentA : Fragment(R.layout.fragment_a) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonA.setOnClickListener {
            findNavController().navigate(FragmentADirections.showB(textToB.text.toString()))
        }
    }
}
