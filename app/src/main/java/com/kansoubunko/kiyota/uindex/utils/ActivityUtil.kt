package com.kansoubunko.kiyota.uindex.utils

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

/**
 * ActivityUtilクラス
 */
class ActivityUtil {
    /**
     * コンパニオンオブジェクト
     */
    companion object {
        /**
         * フラグメントセットメソッド
         *
         * @param resId リソースID
         * @param fragment フラグメント
         * @param manager マネージャー
         */
        fun setFragment(resId: Int, fragment: Fragment, manager: FragmentManager) {
            val transaction = manager.beginTransaction()
            transaction.add(
                resId,
                fragment
            )
            transaction.commit()
        }
    }
}