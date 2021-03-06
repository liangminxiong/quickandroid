package cn.qjm253.quick_android_base.extensions

import java.lang.StringBuilder
import java.math.RoundingMode
import java.text.DecimalFormat

/**
 * @author SunnyQjm
 * @date 19-7-7 上午8:43
 */

fun Double.toFixed(num: Int): String {
    val sb = StringBuilder("0.")
    for(i in 1..num){
        sb.append("0")
    }
    val df = DecimalFormat(sb.toString())
    df.roundingMode = RoundingMode.HALF_UP;
    return df.format(this)
}