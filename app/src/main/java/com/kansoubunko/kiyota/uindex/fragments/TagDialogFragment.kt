package com.kansoubunko.kiyota.uindex.fragments

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import androidx.fragment.app.DialogFragment
import com.kansoubunko.kiyota.uindex.R

class TagDialogFragment : DialogFragment() {
    var onPositiveListener: DialogInterface.OnClickListener? = null
    var onNegativeListener: DialogInterface.OnClickListener? = null
    var text: String = ""
    private lateinit var editText: EditText

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(context)
        builder.apply {
            setTitle(context.resources.getText(R.string.fourth_title))
            setPositiveButton(context.resources.getText(R.string.fourth_ok), onPositiveListener)
            setNegativeButton(context.resources.getText(R.string.fourth_cancel), onNegativeListener)
        }
        editText = EditText(activity)
        editText.hint = "# かわいい"
        builder.setView(editText)
        return builder.create()
    }

    fun inputText(): String {
        this.text = editText.text.toString()
        return this.text
    }
}