package com.kansoubunko.kiyota.uindex.fragments

import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import android.view.Gravity.CENTER
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.kansoubunko.kiyota.uindex.R

class FourthFragment : Fragment() {
    private lateinit var tagArea: LinearLayout
    private lateinit var button: Button

    companion object {
        fun createInstance(): FourthFragment {
            val fourthFragment = FourthFragment()
            val args = Bundle()
            fourthFragment.arguments = args
            return fourthFragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.fragment_fourth, container, false)
        tagArea = view.findViewById(R.id.tag_area)
        button = view.findViewById(R.id.button)
        button.setOnClickListener {
            var tagDialogFragment = TagDialogFragment()
            tagDialogFragment.show(fragmentManager, "sample")
            tagDialogFragment.onPositiveListener = DialogInterface.OnClickListener { _, _ ->
                var text = tagDialogFragment.inputText()
                createCustomView(text)
            }
            tagDialogFragment.onNegativeListener = DialogInterface.OnClickListener { _, _ ->
            }
        }
        return view
    }

    private fun createCustomView(text: String) {
        var textView = TextView(context)
        var textViewParam =
            LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, 70)
        textViewParam.setMargins(0, 0, 0, 30)
        textView.layoutParams = textViewParam
        textView.text = " # $text "
        context?.resources?.getColor(R.color.thirteen_moomin_color)?.let {
            textView.setBackgroundColor(
                it
            )
        }
        context?.resources?.getColor(R.color.date_text_color)?.let {
            textView.setTextColor(
                it
            )
        }
        textView.textSize = 20F
        textView.gravity = CENTER
        tagArea.addView(textView)
    }
}