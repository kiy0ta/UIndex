package com.kansoubunko.kiyota.uindex.fragments

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kansoubunko.kiyota.uindex.R

class FifthFragment : Fragment() {
    companion object {
        fun createInstance(): FifthFragment {
            val fifthFragment = FifthFragment()
            val args = Bundle()
            fifthFragment.arguments = args
            return fifthFragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.fragment_fifth, container, false)
        return view
    }
}