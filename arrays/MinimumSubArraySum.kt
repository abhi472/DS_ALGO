package arrays

fun minimumSubArraySum(arr: IntArray): Int {

    val n = arr.size
    var currMin = arr[0]
    var min = arr[0]

    for( i in 1 until n) {
        currMin = minOf(currMin+arr[i], arr[i])
        min = minOf(currMin, min)

    }

    return min
}


fun maximumSumSubArray(arr:IntArray): Int {

    val n = arr.size
    var currMax = arr[0]
    var max = arr[0]
    for(curr in arr.drop(1)) {
        currMax = maxOf(curr, currMax+curr)
        max = maxOf(currMax, max)
    }
    return max
}

fun main() {

    val arr = intArrayOf(-7, 32, -11, 21, 18, 35, -26, -17, 35, -12, -38, -33, 32, 16, 44, 11, -40, -21, 2, 27, -35, 21, -37, -12, 1)
    var sum = 0

    arr.forEach { sum+=it }

    var fVal = maxOf(maximumSumSubArray(arr), sum - minimumSubArraySum(arr) )

    print(fVal)
}