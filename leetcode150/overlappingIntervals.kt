package leetcode150

/**
 * Given an array of time intervals where arr[i] = [starti, endi],
 * the task is to merge all the overlapping intervals into one and output the
 * result which should have only mutually exclusive intervals.
 *
 * Examples:
 *
 * Input: arr[] = [[1, 3], [2, 4], [6, 8], [9, 10]]
 * Output: [[1, 4], [6, 8], [9, 10]]
 * Explanation: In the given intervals, we have only two overlapping intervals
 * [1, 3] and [2, 4]. Therefore, we will merge these two and return [[1, 4]], [6, 8], [9, 10]].
 *
 * Input: arr[] = [[7, 8], [1, 5], [2, 4], [4, 6]]  [[1, 5], [2, 4], [4, 6], [7, 8]]
 * Output: [[1, 6], [7, 8]]
 * Explanation: We will merge the overlapping intervals [[1, 5], [2, 4], [4, 6]]
 * into a single interval [1, 6].
 **/

fun main() {
    var arr: Array<IntArray> = arrayOf(intArrayOf(7,8), intArrayOf(1,5), intArrayOf(2,4), intArrayOf(4,6))
    arr.sortBy { it[0] }
    val n = arr.size
    overlappingIntervals(arr, n).forEach { println(it.contentToString()) }


}

fun overlappingIntervals(arr: Array<IntArray>, n: Int): Array<IntArray> {


     for(i in 1 ..<n) {
         if(arr[i][0] <= arr[i-1][1]) {
             val upper: Int = maxOf(arr[i][1], arr[i-1][1])
             arr[i] = intArrayOf(arr[i - 1][0], upper)
             arr[i - 1] = intArrayOf()
         }
     }

    var newArr: Array<IntArray> = arrayOf()

    for(intArr in arr) {
        if(intArr.isNotEmpty()) {
            newArr += intArr
        }
    }


    return newArr


}