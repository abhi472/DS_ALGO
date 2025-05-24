package recursion

import java.text.SimpleDateFormat
import java.util.*

fun main() {
    val n = 60 /*[0,1,1,2,3,5,8]*/

    var memo = IntArray(n+1) {-1} //dynamic programming



    print(fibonacci(n, memo))


}

fun fibonacci(n: Int, memo: IntArray): Int {

   if(memo[n] == -1) {
       var res = 0;
       res = if (n == 0 || n==1) {
           n
       }else fibonacci(n - 1, memo) + fibonacci(n - 2, memo)
       memo[n] = res
   }
    return memo[n]



}