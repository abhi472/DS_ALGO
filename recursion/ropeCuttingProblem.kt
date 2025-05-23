package recursion

/**
 * for a given rope of length n, we can cut it in multiple parts of set length
 * represented as a, b, c. Calculate the maximum number of pieces the rope can be cut
 *
 * I/P: n = 5, a = 2, b = 5, c = 1
 * O/P: 5 (5 pieces of size 1)
 *
 * **/
fun main() {

    val n = 23;
    val a = 12
    val b = 9
    val c = 11
    print(cutTheRope(n, a, b, c, 0))
}

fun cutTheRope(n: Int, a: Int, b: Int, c: Int, count: Int): Int {
    if(n == 0) {
        return count
    } else if (n<0) return 0

    return maxOf(cutTheRope(n-a,a, b, c,count+1),
        cutTheRope(n-b,a, b, c,count+1),
        cutTheRope(n-c,a, b, c,count+1)
        )

}