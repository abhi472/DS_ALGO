package recursion

fun main() {
    val n = 6 /*[0,1,1,2,3,5,8]*/


    print(fibonacci(n))

}

fun fibonacci(n: Int): Int {

    if (n == 0) return 0
    if (n == 1) return 1
        return fibonacci(n-1) + fibonacci(n-2)



}