package com.example.mycardapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit

class FragmentA : Fragment(R.layout.fragment_a) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.buttonA).setOnClickListener {
            parentFragmentManager.commit {
                replace(R.id.fragmentContainer, FragmentB())
                addToBackStack(null)
            }
        }
    }
}
