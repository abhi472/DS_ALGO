package recursion

fun main() {

    println(getStringAtRank(4, 1))

}

fun factorialSaved(n: Int) : IntArray {
    var fact = IntArray(n+1) {1}
    for(i in 1..n) {
        fact[i] = fact[i-1]*i
    }

    return fact

}

fun getStringAtRank(n: Int, kt: Int): String {

    if(n == 0 || kt == 0) return ""
    val list = MutableList(n) {i->i+1}
    val string: StringBuilder = StringBuilder()
    val fact = factorialSaved(n)
    var s = list.size
    var k = kt - 1
    while(s>0) {
        val blockSize = fact[s - 1]
        val index = k/blockSize
        string.append(list.removeAt(index))
        k %= blockSize
        s--
    }
    return string.toString()



}







