package arrays

fun maxWaterContainer(a: IntArray): Int {


    val n = a.size
    if(n == 0) return 0
    if( n == 1 ) return 0
    var i = 0
    var j = n-1
    var currMax = 0
    var max = 0

    while (i<j) {
        if(a[i]>a[j]) {
            j--
        } else {
            i++
        }
        currMax = minOf(a[i], a[j])*(j-i)
        max = maxOf(currMax,max)

    }

    return max

}


fun main() {
    val arr = intArrayOf(1, 8, 6, 7)

    print(maxWaterContainer(arr))
}