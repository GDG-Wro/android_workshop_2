package com.example.mycardapp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_b.*

class FragmentB : Fragment(R.layout.fragment_b) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        label.text = requireArguments().getString("label", "No value passed")

        if (savedInstanceState == null) {
            WarningDialogFragment().show(childFragmentManager, "tagDialog")
        }
    }
}
