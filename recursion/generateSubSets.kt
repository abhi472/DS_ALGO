package recursion

fun main() {

    val str = "abcd"
    val result = mutableListOf<String>()
     generateSubsets(str, "",0, result)
    print(result)
}


fun generateSubsets(input: String, current: String, index: Int, result: MutableList<String>) {
    if (index == input.length) {
        result.add(current)
        return
    }
    // Exclude the current character
    generateSubsets(input, current, index + 1, result)
    // Include the current character
    generateSubsets(input, current + input[index], index + 1, result)
}
