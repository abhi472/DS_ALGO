package leetcode150

/**
 * Given an array of integers temperatures represents the daily temperatures,
 * return an array answer such that answer[i] is the number of days you have to wait after the
 * ith day to get a warmer temperature. If there is no future day for which this is possible,
 * keep answer[i] == 0 instead.
 *
 *
 *
 * Example 1:
 *
 * Input: temperatures = [73,74,75,71,69,72,76,73]
 * Output: [1,1,4,2,1,1,0,0]
 * Example 2:
 *
 * Input: temperatures = [30,40,50,60]
 * Output: [1,1,1,0]
 * Example 3:
 *
 * Input: temperatures = [30,60,90]
 * Output: [1,1,0]
 * **/


fun main() {

    val tempArr = intArrayOf(60)
    println(dailyTemperatures(tempArr).contentToString())
}

fun dailyTemperatures(temperatures: IntArray): IntArray {

    var distArray = IntArray(temperatures.size){0}
    var stack = ArrayDeque<Int>()
        for(i in temperatures.indices) {
            val num = temperatures[i]
            while(stack.isNotEmpty() && temperatures[stack.last()] < num) {
                val last = stack.last()
                stack.removeLast()
                distArray[last] = i-last
            }
            stack.addLast(i)
        }
    return distArray
}