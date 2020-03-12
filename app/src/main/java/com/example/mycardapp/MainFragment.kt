package com.example.mycardapp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

class MainFragment : Fragment() {
    var numberOfTaps = 0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        tapsTextView.text = getString(R.string.number_of_taps, numberOfTaps)
    }

}