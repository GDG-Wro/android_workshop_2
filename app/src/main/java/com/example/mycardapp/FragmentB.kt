package com.example.mycardapp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_b.*

class FragmentB : Fragment(R.layout.fragment_b) {

    private val navigationArguments by navArgs<FragmentBArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        label.text = navigationArguments.text

        view.setOnClickListener {
            findNavController().navigate(FragmentBDirections.showWarning())
        }
    }
}
