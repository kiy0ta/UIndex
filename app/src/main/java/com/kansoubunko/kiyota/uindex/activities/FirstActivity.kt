package com.kansoubunko.kiyota.uindex.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kansoubunko.kiyota.uindex.R
import com.kansoubunko.kiyota.uindex.fragments.FirstFragment
import com.kansoubunko.kiyota.uindex.utils.ActivityUtil

class FirstActivity : AppCompatActivity() {
    /**
     * 画面生成時処理メソッド
     * @param savedInstanceState 画面保持情報
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
        ActivityUtil.setFragment(
            R.id.contents,
            FirstFragment.createInstance(),
            supportFragmentManager
        )
    }
}