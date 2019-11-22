package com.kansoubunko.kiyota.uindex.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kansoubunko.kiyota.uindex.R
import net.alhazmy13.wordcloud.ColorTemplate
import net.alhazmy13.wordcloud.WordCloud
import net.alhazmy13.wordcloud.WordCloudView
import java.util.*
import kotlin.collections.ArrayList

//TODO:もしURLを付加したい場合は、カスタムビューをランダムサイズで生成していくしかない

class ThirdFragment : Fragment() {
    private lateinit var list: List<WordCloud>
    private var text: String =
        "aaa bbb ccc Java Kotlin android python RUBY swift C++ javascript docker c# eclipse"

    companion object {
        fun createInstance(): ThirdFragment {
            val thirdFragment = ThirdFragment()
            val args = Bundle()
            thirdFragment.arguments = args
            return thirdFragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.fragment_third, container, false)
        generateRandomText()
        val wordCloud = view.findViewById(R.id.wordCloud) as WordCloudView
        wordCloud.setDataSet(list)
        context?.resources?.getColor(R.color.date_back_color)
            ?.let { wordCloud.setBackgroundColor(it) }
        wordCloud.setColors(ColorTemplate.MATERIAL_COLORS)
        wordCloud.notifyDataSetChanged()
        return view
    }

    private fun generateRandomText() {
        val data = text.split(" ").toTypedArray()
        list = ArrayList()
        val random = Random()
        for (s in data) {
            (list as ArrayList<WordCloud>).add(WordCloud(s, random.nextInt(50)))
        }
    }
}