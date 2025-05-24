package recursion

fun main() {

    val arr = intArrayOf(10,20,30)
    val req = 37
    val result = mutableListOf<Int>()
    subsetSum(arr,0, 0, result, req)
    println(result)


}

fun subsetSum(arr:IntArray, curr: Int,i: Int, result: MutableList<Int>, req:Int) {

    if(i == arr.size) {
        if(curr == req)
            result.add(curr)
        return
    }

    subsetSum(arr, curr, i+1, result, req)
    subsetSum(arr, curr+arr[i], i+1, result, req)

}