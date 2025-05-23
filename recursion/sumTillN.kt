package recursion

fun main() {
    val n = 10
    print(sumTillN(n))
}

fun sumTillN(n: Int): Int {
    return if(n == 0) 0
    else n + sumTillN(n-1)
}