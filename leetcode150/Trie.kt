package leetcode150

// Node class for the Trie
data class TrieNode(
    val children: MutableMap<Char, TrieNode> = mutableMapOf(),
    var isEndOfWord: Boolean = false
)

data class DigitTrieNode(
    val children: Array<DigitTrieNode?> = Array(10){null},
    var isEnd: Boolean = false
)

class DigitTrie{
    private val root = DigitTrieNode()

    fun inset(number: String) {
        var node = root
        for (ch in number) {
            val digit = ch - '0'
            if (node.children[digit] == null)
                node.children[digit] = DigitTrieNode()
            node = node.children[digit]!!
        }
        node.isEnd = true
    }

    fun search(number: String): Boolean {
        var node = root
        for (ch in number) {
            val digit = ch - '0'
            node = node.children[digit] ?: return false
        }
        return node.isEnd
    }

    fun printLexical(current: String = "", node: DigitTrieNode? = root) {
        if (node == null) return
        if (node.isEnd) println(current)

        for (digit in 0..9) {
            val child = node.children[digit]
            if (child != null) {
                printLexical(current + digit, child)
            }
        }
    }


}



class Trie {
    private val root = TrieNode()

    // Inserts a word into the trie.
    fun insert(word: String) {
        var currentNode = root
        for (char in word) {
            // Get the child node for the character. If it doesn't exist, create it.
            currentNode = currentNode.children.getOrPut(char) { TrieNode() }
        }
        currentNode.isEndOfWord = true // Mark the last node as the end of a word
    }


    // A simple function to print the structure (for visualization)
    fun printTrie() {
        printNode(root, "")
    }

    private fun printNode(node: TrieNode, prefix: String) {
        if (node.isEndOfWord) {
            println("$prefix (End of Word)")
        }
        for ((char, childNode) in node.children) {
            printNode(childNode, "$prefix$char")
        }
    }
}



fun main() {
//    val trie = Trie()
//    val myString = "abcde"
//
//    println("Inserting '$myString' into the Trie...")
//    trie.insert(myString)
//
//    // Let's add another word to see how the Trie handles shared prefixes
//    trie.insert("abcf")
//
//    println("\nVisual representation of the Trie:")
//    trie.printTrie()

    val digitTrie = DigitTrie()
    for (i in 1..50) {
        digitTrie.inset(i.toString())
    }

    digitTrie.printLexical()
}