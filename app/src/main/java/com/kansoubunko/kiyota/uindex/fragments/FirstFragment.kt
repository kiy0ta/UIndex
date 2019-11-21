package com.kansoubunko.kiyota.uindex.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kansoubunko.kiyota.uindex.R

class FirstFragment : Fragment() {
    companion object {
        fun createInstance(): FirstFragment {
            val firstFragment = FirstFragment()
            val args = Bundle()
            firstFragment.arguments = args
            return firstFragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        return view
    }
}