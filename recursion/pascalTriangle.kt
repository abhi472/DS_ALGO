package recursion

fun main() {

    pascalTriangle(14).map { it -> println(it) }

}

fun pascalTriangle(n: Int) : List<List<Int>> {
    val dpArray = MutableList(size = n, init = {it-> MutableList<Int>(size = it+1, init = {1})})

    for(i in 1..<n) {
        for(j in 1..i) {
            dpArray[i][j] = (dpArray[i][j-1]*(i-j+1))/j
        }
    }


    return dpArray
}