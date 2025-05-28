package recursion

fun main() {
    val n = 10
    val arr = intArrayOf(2,3,5,6)
    var memo = IntArray(11) {-1}
    println(allCoinsChangeDP(arr, arr.size, n))

}

fun allCoinsChange(arr: IntArray, n: Int, s: Int): Int {
    if(s == 0) return 1
    if(s<0) return 0
    if(n == 0) return 0
    return allCoinsChange(arr, n,s- arr[n-1]) + allCoinsChange(arr, n-1, s)
}


/**
 *
 * this is tabulation used DP solution, the formula for
 *
 * **/

fun allCoinsChangeDP(arr: IntArray, n: Int, s:Int): Int {
    var matrix = Array<IntArray>(n+1){IntArray(s+1) }

    var lost:MutableList<MutableList<Int>> = MutableList(5){ mutableListOf(5) }

    lost[0][1] = 7

    for(i in 0..<matrix.size) {
        val row = matrix[i]
        for (j in 0..<row.size) {
            if(i == 0) {
                if (j == 0)
                    row[j] = 1
                else row[j] = 0
            } else {
                row[0] = 1
                if(arr[i-1]>j) {
                    matrix[i][j] = matrix[i-1][j]
                } else {
                    matrix[i][j] = matrix[i-1][j] + matrix[i][j-arr[i-1]]
                }
            }



        }
    }

    return matrix[n][s]
}