package leetcode150

import java.lang.NumberFormatException
import kotlin.math.pow

fun main() {
    val num = 2147483476

    println(smallestNumberGreater(num))

}

fun smallestNumberGreater(num: Int): Int {
    if(num>=Int.MAX_VALUE) return -1
    var arr = num.toString().map { it.digitToInt() }.toIntArray()
    val n = arr.size
    var pivot = -1
    var pivotVal = -1
    for(i in n-1 downTo  1) {
        if(arr[i] > arr[i-1]) {
         pivot = i - 1
         pivotVal = arr[i-1]
         break
        }
    }

    if (pivot == -1)
        return -1
     arr.sort(fromIndex = pivot+1, toIndex = n)

    for (i in (pivot + 1) ..< n) {
        if(arr[i] > pivotVal) {
            val temp = pivotVal
            arr[pivot] = arr[i]
            arr[i]=temp
            break

        }
    }

    return arr.joinToString("").toInt()
//    return try {
//        arr.joinToString("").toInt()
//
//    } catch (e: NumberFormatException) {
//        -1
//    }
}