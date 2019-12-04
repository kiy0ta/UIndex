package com.kansoubunko.kiyota.uindex.views

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import android.graphics.RectF
import android.util.AttributeSet
import android.view.View
import com.kansoubunko.kiyota.uindex.R

/**
 * サークルカスタムビュークラス
 *
 * @constructor コンストラクタ
 *
 * @param context コンテキスト
 * @param attrs ビューの情報
 * @param defStyleAttr ビューのスタイル情報
 */
class MetamonCustomView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {
    /**
     * 線の色
     */
    private val paint = Paint()
    /**
     * 線の座標位置
     */
    private val rect = RectF()
    /**
     * 線の長さ
     */
    private var angle = 0F

    /**
     * コンストラクタ
     */
    init {
        // 線の幅
        this.paint.isAntiAlias = true
        this.paint.style = Paint.Style.FILL_AND_STROKE
        // 線の色
        this.paint.color = (context.resources.getColor(R.color.metamon))
    }

    /**
     * ビュー描画メソッド
     *
     * @param canvas 描画領域
     */
    @SuppressLint("CanvasSize")
    public override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        // サークルの背景色
        canvas.drawColor(this.context.resources.getColor(R.color.metamon_back))
        // 初期化
        var path = Path()
        path.reset()
        // サークルの領域設定

        val a = 0F
        val b = canvas.height
        val c = canvas.width
        val d = 0F
        val e = 0F
        val f = 0F
        val g = 0F
        val h = 0F
        val i = 0F
        val j = 0F
        val k = 0F
        val l = 0F
        val m = 0F
//        path.moveTo(a,a)
//        path.lineTo(a,b.toFloat())
//        path.lineTo(c.toFloat(),b.toFloat())
//        path.lineTo(c.toFloat(),a)
        path.moveTo(20F, 300F)
        path.lineTo(100F, 400F)
        path.lineTo(120F, 300F)
        path.lineTo(700F, 300F)
        path.lineTo(400F, 600F)
        path.lineTo(1000F, 900F)
        path.lineTo(900F, 1000F)
        path.lineTo(c.toFloat(), b.toFloat())
        path.lineTo(0F, b.toFloat())
        path.lineTo(100F, 900F)
        path.lineTo(20F, 300F)
        // サークルの描画
        canvas.drawPath(
            path,
            this.paint
        )
    }
}