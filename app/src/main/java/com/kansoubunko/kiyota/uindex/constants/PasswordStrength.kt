package com.kansoubunko.kiyota.uindex.constants

import com.kansoubunko.kiyota.uindex.R
import java.lang.reflect.Constructor


enum class PasswordStrength() {
    WEAK {
        override fun stringId(): Int = R.string.weak
        override fun colorId(): Int = R.color.weak
    },
    MEDIUM {
        override fun stringId(): Int = R.string.medium
        override fun colorId(): Int = R.color.medium
    },
    STRONG {
        override fun stringId(): Int = R.string.strong
        override fun colorId(): Int = R.color.strong
    },
    VERY_STRONG {
        override fun stringId(): Int = R.string.very_strong
        override fun colorId(): Int = R.color.very_strong
    };

    companion object {
        var msg: Int = 0
        var color: Int = 0
        val MIN_LENGTH: Int = 8
        val MAX_LENGTH: Int = 15
    }
    abstract fun stringId(): Int
    abstract fun colorId(): Int
}