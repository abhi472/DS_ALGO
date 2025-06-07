package leetcode150

// Data class to represent an edge in the Suffix Tree
data class SuffixTreeEdge(
    val label: String,
    val targetNode: SuffixTreeNode
)

// Data class for a node in thffix Tree
class SuffixTreeNode {
    // A map where the key is the first character of the edge label
    val children: MutableMap<Char, SuffixTreeEdge> = mutableMapOf()

    // Suffix link, used in advanced construction algorithms, but we can omit it here.
    // var suffixLink: SuffixTreeNode? = null

    // Storing the suffix index for leaf nodes
    var suffixIndex: Int? = null

    fun isLeaf(): Boolean = children.isEmpty()
}

// The Suffix Tree class itself
class SuffixTree(text: String) {
    private val root = SuffixTreeNode()
    private val fullText = if (text.endsWith('$')) text else "$text$"

    init {
        // --- Manual construction of the Suffix Tree for "bandana$" ---
        buildForBandana()
    }

    private fun buildForBandana() {
        // Ensure the text is correct for this manual build
        if (this.fullText != "bandana$") {
            println("This manual build is specifically for the string 'bandana$'.")
            return
        }

        // Create all necessary nodes
        val root = this.root
        val nodeA = SuffixTreeNode()
        val nodeAN = SuffixTreeNode()
        val nodeN = SuffixTreeNode()

        // Create leaf nodes with their suffix indices
        val leaf0 = SuffixTreeNode().apply { suffixIndex = 0 }
        val leaf1 = SuffixTreeNode().apply { suffixIndex = 1 }
        val leaf2 = SuffixTreeNode().apply { suffixIndex = 2 }
        val leaf3 = SuffixTreeNode().apply { suffixIndex = 3 }
        val leaf4 = SuffixTreeNode().apply { suffixIndex = 4 }
        val leaf5 = SuffixTreeNode().apply { suffixIndex = 5 }
        val leaf6 = SuffixTreeNode().apply { suffixIndex = 6 }
        val leaf7 = SuffixTreeNode().apply { suffixIndex = 7 }

        // Connect nodes from the root
        root.children['b'] = SuffixTreeEdge("bandana$", leaf0)
        root.children['a'] = SuffixTreeEdge("a", nodeA)
        root.children['n'] = SuffixTreeEdge("n", nodeN)
        root.children['d'] = SuffixTreeEdge("dana$", leaf3)
        root.children['$'] = SuffixTreeEdge("$", leaf7)

        // Connect children of internal node 'Node_A'
        nodeA.children['n'] = SuffixTreeEdge("n", nodeAN)
        nodeA.children['$'] = SuffixTreeEdge("$", leaf6)

        // Connect children of internal node 'Node_AN'
        nodeAN.children['d'] = SuffixTreeEdge("dana$", leaf1)
        nodeAN.children['a'] = SuffixTreeEdge("a$", leaf4)

        // Connect children of internal node 'Node_N'
        nodeN.children['d'] = SuffixTreeEdge("dana$", leaf2)
        nodeN.children['a'] = SuffixTreeEdge("a$", leaf5)
    }

    /**
     * Prints a visual representation of the tree structure.
     */
    fun visualize() {
        println("Visualizing Suffix Tree for: '$fullText'")
        println("(root)")
        visualizeNode(root, "")
    }

    private fun visualizeNode(node: SuffixTreeNode, prefix: String) {
        val childrenCount = node.children.size
        var i = 0
        node.children.values.sortedBy { it.label }.forEach { edge ->
            val connector = if (i == childrenCount - 1) "└--" else "├──"
            val newPrefix = if (i == childrenCount - 1) "    " else "│   "

            if (edge.targetNode.isLeaf()) {
                println("$prefix$connector\"${edge.label}\" ---> Leaf(${edge.targetNode.suffixIndex})")
            } else {
                println("$prefix$connector\"${edge.label}\" ---> (Internal Node)")
                visualizeNode(edge.targetNode, prefix + newPrefix)
            }
            i++
        }
    }
}

fun main() {
    val suffixTree = SuffixTree("bandana")
    suffixTree.visualize()
}