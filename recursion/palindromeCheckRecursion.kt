package recursion


fun main() {
    val str = "aba"
    print( palindromeCheckRecursion(0, str.length-1, str))
}
fun palindromeCheckRecursion(first: Int, last:Int, str: String): Boolean {
    return if (first >= last) {
        true;
    } else if(str[first] == str[last])
        palindromeCheckRecursion(first+1, last-1, str)
    else false
}