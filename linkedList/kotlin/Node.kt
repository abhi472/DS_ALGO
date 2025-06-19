package linkedList.kotlin

class Node<T>(var data: T, var next: Node<T>? = null, var prev: Node<T>? = null) {
    // You can add more functionality to the Node class here if needed.
    // For example, a toString() method for easy printing:
    override fun toString(): String {
        return "Node(data=$data, next=${next?.data ?: "null"})"
    }
}