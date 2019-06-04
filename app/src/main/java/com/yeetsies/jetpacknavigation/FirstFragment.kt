package com.yeetsies.jetpacknavigation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation.findNavController
import kotlinx.android.synthetic.main.fragment_first.bananaBreadButton

class FirstFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bananaBreadButton.setOnClickListener { onButtonPress() }
    }

    private fun onButtonPress() {
        view?.let {
            findNavController(it).navigate(R.id.action_firstFragment_to_secondFragment)
        }
    }
}
