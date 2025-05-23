package leetcode150

/**
 * Given an m x n integer matrix, if an element is 0, set its entire row and column to 0's.
 *
 * You must do it in place.
 * Example 1:
 *
 *
 * Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
 * Output: [[1,0,1],[0,0,0],[1,0,1]]
 *
 * */


fun main() {
    var array: Array<IntArray> = arrayOf(intArrayOf(0,1,1,0),
        intArrayOf(1,1,1,1), intArrayOf(1,1,1,1))
    array = setMatrixZero(array, array.size, array[0].size)

    for(item in array) {
        println(item.contentToString())
    }

}

fun setMatrixZero(arr: Array<IntArray>, n: Int, m:Int): Array<IntArray> {

    var vList: MutableList<Int> = mutableListOf()
    var hList: MutableList<Int> = mutableListOf()


    for (i in 0..<n) {
        var ind = 1;
        for (j in 0..<m) {
            if(arr[i][j] == 0) {
                vList.add(j)
                ind = 0;
            }
        }
        if(ind == 0) {
            hList.add(i)
        }

    }

    for(h in hList) {
        for(j in 0..<m) {
            arr[h][j] = 0
        }
    }

    for(i in 0..<n) {
        for(v in vList) {
            arr[i][v] = 0
        }
    }

    return arr
}