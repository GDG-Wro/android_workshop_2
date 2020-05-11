package com.example.mycardapp

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import kotlinx.android.synthetic.main.fragment_a.*

class FragmentA : Fragment(R.layout.fragment_a) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonA.setOnClickListener {
            parentFragmentManager.commit {
                val fragmentB = FragmentB()
                fragmentB.arguments = bundleOf("label" to textToB.text.toString())
                replace(R.id.fragmentContainer, fragmentB, "tagB")
                addToBackStack("nameB")
            }
        }
    }
}
