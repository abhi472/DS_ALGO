package recursion

/**
 *
 *
 * **/
fun main() {
    val n = 189
    print(sumOfDigits(n))
}

fun sumOfDigits(n: Int): Int {
    return if(n <= 9) n
    else n%10 + sumOfDigits(n/10)
}