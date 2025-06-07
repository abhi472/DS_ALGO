package leetcode150


/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 *
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the
 * future to sell that stock.
 *
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 *
 *
 *
 * Example 1:
 *
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 * Example 2:
 *
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transactions are done and the max profit = 0.
 *
 * [1,2,4,2,5,7,2,4,9,0]
 *
 *
 * **/
fun main() {

    //println(stockBuySellMaxProfit(prices = intArrayOf(7,1,5,3,6,4)))

    println(stockBuyAndSellMaxProfitKTransactions(intArrayOf(1,3,5,2,0,1,6,2,3,8), 2, ))

}

fun stockBuySellMaxProfit(prices: IntArray): Int {

    var price0=prices[0]
    var sum = 0;
    for (price in prices) {
        if(price>price0) {
            sum+=price-price0
        }
        price0 = price

    }

    return sum
}

fun stockBuyAndSellMaxProfitKTransactions(prices: IntArray, k: Int): Int {

    val n = prices.size

    val arr2 = IntArray(8) { 1 }
    val arr = Array(10) {arr2}
    val list =  MutableList(6){index -> index }

    val list2 = listOf(3,4)
    list.add(0, 2)
    list.addAll(list2)


    for (i in arr) {
        for (j in i) {
            when (j){
                2 -> {

                }

            }
        }
    }

    return arr[0][0]






}

