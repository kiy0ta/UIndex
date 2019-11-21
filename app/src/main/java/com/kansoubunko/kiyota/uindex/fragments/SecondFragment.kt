package com.kansoubunko.kiyota.uindex.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kansoubunko.kiyota.uindex.R

class SecondFragment : Fragment() {
    companion object {
        fun createInstance(): SecondFragment {
            val secondFragment = SecondFragment()
            val args = Bundle()
            secondFragment.arguments = args
            return secondFragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        return view
    }
}