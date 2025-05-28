package leetcode150


class StockSpanner {
    private data class PriceSpan(val price: Int, val span: Int)

    private val stack: ArrayDeque<PriceSpan> = ArrayDeque()

    fun next(price: Int): Int {

        var calSpan = 1

        while (stack.isNotEmpty() && stack.last().price <= price) {

            calSpan += stack.removeLast().span

        }

        stack.addLast(PriceSpan(price = price, span = calSpan))




        return calSpan

    }
}

fun main() {
    val stockSpanner = StockSpanner()
    println("next(100): ${stockSpanner.next(100)}") // Expected: 1
    println("next(80):  ${stockSpanner.next(80)}")  // Expected: 1
    println("next(60):  ${stockSpanner.next(60)}")  // Expected: 1
    println("next(70):  ${stockSpanner.next(70)}")  // Expected: 2
    println("next(60):  ${stockSpanner.next(60)}")  // Expected: 1
    println("next(75):  ${stockSpanner.next(75)}")  // Expected: 4
    println("next(85):  ${stockSpanner.next(85)}")  // Expected: 6

    // Example 2 from description:
    // Prices before today: [7,2,1,2], today's price: 2, span: 4
    val spanner2 = StockSpanner()
    spanner2.next(7)
    spanner2.next(2)
    spanner2.next(1)
    spanner2.next(2) // After this, stack based on [7,2,1,2] would be [(7,1), (2,3)]
    println("\nExample 2: Prices [7,2,1,2] processed. Next price is 2.")
    println("next(2): ${spanner2.next(2)}") // Expected: 4

    // Example 3 from description:
    // Prices before today: [7,34,1,2], today's price: 8, span: 3
    val spanner3 = StockSpanner()
    spanner3.next(7)
    spanner3.next(34)
    spanner3.next(1)
    spanner3.next(2)
    println("\nExample 3: Prices [7,34,1,2] processed. Next price is 8.")
    println("next(8): ${spanner3.next(8)}")

}