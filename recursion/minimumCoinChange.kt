package recursion

import kotlin.math.min

/**
 * You are given an integer array coins representing coins of different denominations and an integer amount
 * representing a total amount of money.
 *
 * Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be
 * made up by any combination of the coins, return -1.
 *
 * You may assume that you have an infinite number of each kind of coin.
 *
 * Example 1:
 *
 * Input: coins = [1,2,5], amount = 11
 * Output: 3
 * Explanation: 11 = 5 + 5 + 1
 * Example 2:
 *
 * Input: coins = [2], amount = 3
 * Output: -1
 * Example 3:
 *
 * Input: coins
 * **/
fun main() {

    val arr = intArrayOf(1,2,5)
    val amount = 11

    println(minimumCoinChange(arr, amount))




}
    fun minimumCoinChange(coins: IntArray, amount: Int): Int {
      var dpArr = IntArray(amount +1) {amount + 1}

        dpArr[0] = 0
        for (i in 1..amount) {
            for (coin in coins) {
                if(coin <= i) {
                    dpArr[i] = min(dpArr[i], dpArr[i - coin] + 1)
                }
            }
        }

        return if(dpArr[amount] > amount) -1 else dpArr[amount]

    }
