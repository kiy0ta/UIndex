package com.kansoubunko.kiyota.uindex.fragments

import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AlphaAnimation
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.kansoubunko.kiyota.uindex.R
import com.kansoubunko.kiyota.uindex.constants.Constants
import com.kansoubunko.kiyota.uindex.constants.PropertyName

class SecondFragment : Fragment() {
    private var sharedPreferences: SharedPreferences? = null
    private lateinit var firstView: ImageView
    private lateinit var secondView: ImageView
    private lateinit var thirdView: ImageView
    private lateinit var forthView: ImageView
    private lateinit var firstButton: View
    private lateinit var secondButton: View
    private lateinit var thirdButton: View
    private lateinit var forthButton: View
    private var clickedCount = 0


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
        firstView = view.findViewById(R.id.first_image)
        secondView = view.findViewById(R.id.second_image)
        thirdView = view.findViewById(R.id.third_image)
        forthView = view.findViewById(R.id.fourth_image)
        firstButton = view.findViewById(R.id.first_button)
        secondButton = view.findViewById(R.id.second_button)
        thirdButton = view.findViewById(R.id.third_button)
        forthButton = view.findViewById(R.id.fourth_button)
        this.sharedPreferences =
            this.activity?.getSharedPreferences(
                PropertyName.PREFERENCE_TITLE,
                AppCompatActivity.MODE_PRIVATE
            )
        this.clickedCount =
            this.sharedPreferences?.getInt(PropertyName.LAST_SET_TEMP, Constants.CLICKED_COUNT)
                ?: Constants.CLICKED_COUNT

        val rightArrow: TextView = view.findViewById(R.id.right_arrow)
        rightArrow.setOnClickListener {
            this.clickedCount++
            setBackColor()
            val alpha = AlphaAnimation(0.1f, 1f) // 透明度を0.1から1に変化させる
            alpha.duration = 200 // 3000msかけてアニメーションする
            firstView.startAnimation(alpha) // アニメーション適用
            val alpha2 = AlphaAnimation(0.1f, 1f)
            alpha2.duration = 600
            secondView.startAnimation(alpha2)
            val alpha3 = AlphaAnimation(0.1f, 1f)
            alpha3.duration = 900
            thirdView.startAnimation(alpha3)
            val alpha4 = AlphaAnimation(0.1f, 1f)
            alpha4.duration = 1000
            forthView.startAnimation(alpha4)
        }
        val leftArrow: TextView = view.findViewById(R.id.left_arrow)
        leftArrow.setOnClickListener {
            this.clickedCount--
            setBackColor()
            val alpha = AlphaAnimation(0.1f, 1f) // 透明度を0.1から1に変化させる
            alpha.duration = 1000 // 3000msかけてアニメーションする
            firstView.startAnimation(alpha) // アニメーション適用
            val alpha2 = AlphaAnimation(0.1f, 1f)
            alpha2.duration = 900
            secondView.startAnimation(alpha2)
            val alpha3 = AlphaAnimation(0.1f, 1f)
            alpha3.duration = 600
            thirdView.startAnimation(alpha3)
            val alpha4 = AlphaAnimation(0.1f, 1f)
            alpha4.duration = 200
            forthView.startAnimation(alpha4)
        }
        return view
    }

    private fun changeBackColor(
        first: Int,
        second: Int,
        third: Int,
        forth: Int,
        buttonColor: Int,
        button: View
    ) {
        context?.resources?.getColor(first)
            ?.let { firstView.setBackgroundColor(it) }
        context?.resources?.getColor(second)
            ?.let { secondView.setBackgroundColor(it) }
        context?.resources?.getColor(third)
            ?.let { thirdView.setBackgroundColor(it) }
        context?.resources?.getColor(forth)
            ?.let { forthView.setBackgroundColor(it) }
        when (button) {
            firstButton -> {
                context?.resources?.getColor(buttonColor)
                    ?.let { firstButton.setBackgroundColor(it) }
                context?.resources?.getColor(R.color.carousel_non)
                    ?.let { secondButton.setBackgroundColor(it) }
                context?.resources?.getColor(R.color.carousel_non)
                    ?.let { thirdButton.setBackgroundColor(it) }
                context?.resources?.getColor(R.color.carousel_non)
                    ?.let { forthButton.setBackgroundColor(it) }
            }
            secondButton -> {
                context?.resources?.getColor(buttonColor)
                    ?.let { secondButton.setBackgroundColor(it) }
                context?.resources?.getColor(R.color.carousel_non)
                    ?.let { firstButton.setBackgroundColor(it) }
                context?.resources?.getColor(R.color.carousel_non)
                    ?.let { thirdButton.setBackgroundColor(it) }
                context?.resources?.getColor(R.color.carousel_non)
                    ?.let { forthButton.setBackgroundColor(it) }
            }
            thirdButton -> {
                context?.resources?.getColor(buttonColor)
                    ?.let { thirdButton.setBackgroundColor(it) }
                context?.resources?.getColor(R.color.carousel_non)
                    ?.let { secondButton.setBackgroundColor(it) }
                context?.resources?.getColor(R.color.carousel_non)
                    ?.let { firstButton.setBackgroundColor(it) }
                context?.resources?.getColor(R.color.carousel_non)
                    ?.let { forthButton.setBackgroundColor(it) }
            }
            else -> {
                context?.resources?.getColor(buttonColor)
                    ?.let { forthButton.setBackgroundColor(it) }
                context?.resources?.getColor(R.color.carousel_non)
                    ?.let { secondButton.setBackgroundColor(it) }
                context?.resources?.getColor(R.color.carousel_non)
                    ?.let { thirdButton.setBackgroundColor(it) }
                context?.resources?.getColor(R.color.carousel_non)
                    ?.let { firstButton.setBackgroundColor(it) }
            }
        }
    }

    private fun setBackColor() {
        when (this.clickedCount) {
            0 -> {
                changeBackColor(
                    R.color.first_moomin_color,
                    R.color.second_moomin_color,
                    R.color.third_moomin_color,
                    R.color.fourth_moomin_color,
                    R.color.first_moomin_color,
                    firstButton
                )
            }
            1 -> {
                changeBackColor(
                    R.color.fifth_moomin_color,
                    R.color.sixth_moomin_color,
                    R.color.seventh_moomin_color,
                    R.color.eighth_moomin_color,
                    R.color.sixth_moomin_color,
                    secondButton
                )
            }
            2 -> {
                changeBackColor(
                    R.color.nine_moomin_color,
                    R.color.ten_moomin_color,
                    R.color.eleven_moomin_color,
                    R.color.twelve_moomin_color,
                    R.color.eleven_moomin_color,
                    thirdButton
                )
            }
            3 -> {
                changeBackColor(
                    R.color.thirteen_moomin_color,
                    R.color.fourteen_moomin_color,
                    R.color.fifteen_moomin_color,
                    R.color.sixteen_moomin_color,
                    R.color.sixteen_moomin_color,
                    forthButton
                )
            }
        }
    }
}