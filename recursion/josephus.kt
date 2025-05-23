package recursion

fun main() {
    val n = 8
    val k = 3
    print(josephus(n,k))
}

fun josephus(n:Int, k: Int):Int {
    if(n == 1)
        return 0
    else
        return (josephus(n-1,k) + k) % n
}