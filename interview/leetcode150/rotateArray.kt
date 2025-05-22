class Solution {
    fun rotate(arr: IntArray, nk: Int): Unit {
        val n = arr.size
        val k = nk%n
        if(n < 2 || k == 0) return

        var fInd = n - 1 - k
        var nInt = fInd/2

        for(i in 0..nInt) {
            var temp = arr[i]
            arr[i] = arr[fInd - i]
            arr[fInd - i] = temp
        }
        nInt = (k - 1)/2
        fInd++
        


        for(i in 0..nInt) {
            var temp = arr[fInd+i]
            arr[fInd+i] = arr[n - i - 1]
            arr[n - i - 1] = temp
        }

        for(i in 0..(n-1)/2) {
            var temp = arr[i] 
            arr[i] = arr[n - 1 - i]
            arr[n - 1 -i] = temp
        }

        }
}




