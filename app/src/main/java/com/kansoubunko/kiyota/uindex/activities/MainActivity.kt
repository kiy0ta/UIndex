package com.kansoubunko.kiyota.uindex.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.kansoubunko.kiyota.uindex.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initDate(first_date, first_practice, "11/21", "パスワード")
        first_date.setOnClickListener {
            startActivity(Intent(this, FirstActivity::class.java))
        }
        initDate(second_date, second_practice, "11/22", "カルーセル")
        second_date.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
        initDate(third_date, third_practice, "11/22", "タグクラウド")
        third_date.setOnClickListener {
            startActivity(Intent(this, ThirdActivity::class.java))
        }
        initDate(fourth_date, fourth_practice, "11/22", "タギング")
        fourth_date.setOnClickListener {
            startActivity(Intent(this, FourthActivity::class.java))
        }
        initDate(fifth_date, fifth_practice, "11/23", "メタモン")
        fifth_date.setOnClickListener {
            startActivity(Intent(this, FifthActivity::class.java))
        }
    }

    private fun initDate(
        dateView: TextView,
        practiceView: TextView,
        date: String,
        practice: String
    ) {
        dateView.text = date
        practiceView.text = practice
    }
}
