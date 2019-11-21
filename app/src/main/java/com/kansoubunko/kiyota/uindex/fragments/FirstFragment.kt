package com.kansoubunko.kiyota.uindex.fragments

import android.os.Bundle
import android.text.Editable
import android.text.InputType
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
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
        var button: Button = view.findViewById(R.id.input_button)
        var text: TextView = view.findViewById(R.id.input_text)
        var result: TextView = view.findViewById(R.id.result_text)
        button.setOnClickListener {
            var password = text.text
            when {
                password.isEmpty() -> {
                    result.setText(R.string.length_null)
                    context?.resources?.getColor(R.color.weak)
                        ?.let { it1 -> result.setTextColor(it1) }
                }
                password.length in 1..5 -> {
                    result.setText(R.string.length_short)
                    context?.resources?.getColor(R.color.medium)
                        ?.let { it1 -> result.setTextColor(it1) }
                }
                password.length in 6..10 -> {
                    result.setText(R.string.length_medium)
                    context?.resources?.getColor(R.color.strong)
                        ?.let { it1 -> result.setTextColor(it1) }
                }
                password.length in 11..20 -> {
                    result.setText(R.string.length_strong)
                    context?.resources?.getColor(R.color.very_strong)
                        ?.let { it1 -> result.setTextColor(it1) }
                }
            }
        }
        return view
    }
}
