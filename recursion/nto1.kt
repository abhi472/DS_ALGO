package recursion
/**
 * A recursive function is tail recursive if last function is recursion call
 * all non-tail recursive solution can't be changed to tail recursive
 * for eg. in mergesort, we do ms1, ms2 then merge(ms1,ms2), here ms1 and ms2 has to be called
 * before calling merge, hence last function is not the recursive one
 * **/

fun main() {
    val n = 6
    nTo1(n)
    oneToN(1,6)
}

fun nTo1(n:Int) {
    if(n == 0) return

    println(n)
     nTo1(n-1)
}

fun oneToN(n:Int, curr: Int) {
     if(n == curr) {
        println(curr)
        return
    } else {
         println(n)
         oneToN(n+1, curr)


     }
}