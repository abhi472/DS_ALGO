package leetcode150
class SuffixTree(val strings: List<String>) {

    private val root = Node()
    private var text = ""
    private var remainder = 0
    private var active = ActivePoint(root)
    private var position = -1
    private var needSuffixLink: Node? = null
    private var terminators = mutableListOf<Char>()

    init {
        // Append unique terminal symbols to all strings
        var term = 0
        for (s in strings) {
            val termChar = ('#' + term) // Ensures unique terminators
            require(termChar !in s) { "String must not contain terminal character $termChar" }
            terminators.add(termChar)
            addString(s + termChar)
            term++
        }
    }

    private fun addString(s: String) {
        for (ch in s) {
            addChar(ch)
        }
    }

    private fun addChar(c: Char) {
        text += c
        position++
        needSuffixLink = null
        remainder++

        while (remainder > 0) {
            if (active.length == 0) active.edge = position

            val edgeChar = text[active.edge]
            val next = active.node.children[edgeChar]
            if (next == null) {
                // No edge starting with current char, create new leaf
                active.node.children[edgeChar] = Node(position, text.length - 1).also {
                    it.indexes.add(findTerminatorIndex(c))
                    addSuffixLink(active.node)
                }
            } else {
                if (walkDown(next)) continue

                if (text[next.start + active.length] == c) {
                    active.length++
                    addSuffixLink(active.node)
                    break
                }

                // Split edge
                val split = Node(next.start, next.start + active.length - 1)
                active.node.children[edgeChar] = split
                split.children[c] = Node(position, text.length - 1).also {
                    it.indexes.add(findTerminatorIndex(c))
                }
                next.start += active.length
                split.children[text[next.start]] = next
                split.indexes.add(findTerminatorIndex(c))

                addSuffixLink(split)
            }

            remainder--
            if (active.node == root && active.length > 0) {
                active.length--
                active.edge = position - remainder + 1
            } else {
                active.node = active.node.suffixLink ?: root
            }
        }
    }

    private fun findTerminatorIndex(c: Char): Int {
        for ((i, t) in terminators.withIndex()) {
            if (c == t) return i
        }
        return -1
    }

    private fun walkDown(node: Node): Boolean {
        val edgeLength = node.edgeLength(position)
        if (active.length >= edgeLength) {
            active.edge += edgeLength
            active.length -= edgeLength
            active.node = node
            return true
        }
        return false
    }

    private fun addSuffixLink(node: Node) {
        needSuffixLink?.suffixLink = node
        needSuffixLink = node
    }

    fun printTree() {
        printTree(root, "")
    }

    private fun printTree(node: Node, indent: String) {
        for ((ch, child) in node.children) {
            val label = text.substring(child.start, child.end.coerceAtMost(position) + 1)
            println("$indent[$label] -> ${child.indexes}")
            printTree(child, "$indent  ")
        }
    }

    inner class Node(
        var start: Int = -1,
        var end: Int = -1
    ) {
        val children: MutableMap<Char, Node> = mutableMapOf()
        var suffixLink: Node? = null
        val indexes: MutableSet<Int> = mutableSetOf()

        fun edgeLength(currentPos: Int): Int {
            return (end.coerceAtMost(currentPos) - start + 1)
        }
    }

    inner class ActivePoint(var node: Node, var edge: Int = -1, var length: Int = 0)
}


fun main() {

    val suffixTree = SuffixTree("abcabcbb".split(""))

    suffixTree.printTree()

}


