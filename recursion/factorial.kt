package recursion

fun main() {

    println(fact(5))
}

fun fact(n: Int): Int {
    return if(n == 1) 1
    else {
        n * fact(n-1)
    }
}