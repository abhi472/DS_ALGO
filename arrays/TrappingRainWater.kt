package arrays

fun trappingRainWaterRefined(a: IntArray): Int {
    val n = a.size
    // 1. Combined edge case check
    if (n < 2) return 0

    var i = 0
    var j = n - 1
    var maxL = a[0]
    var maxR = a[n - 1]
    var sum = 0

    while (i < j) {
        // 2. Main condition compares maxL and maxR directly
        if (maxL < maxR) {
            i++ // Move left pointer
            if (a[i] >= maxL) {
                maxL = a[i] // Update left max
            } else {
                sum += maxL - a[i] // Add trapped water
            }
        } else {
            j-- // Move right pointer
            if (a[j] >= maxR) {
                maxR = a[j] // Update right max
            } else {
                sum += maxR - a[j] // Add trapped water
            }
        }
    }
    return sum
}