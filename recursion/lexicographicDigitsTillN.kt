package recursion

/**
 * Given an integer n, return all the numbers in the range [1, n] sorted in lexicographical order.
 *
 * You must write an algorithm that runs in O(n) time and uses O(1) extra space.
 *
 *
 *
 * Example 1:
 *
 * Input: n = 13
 * Output: [1,10,11,12,13,2,3,4,5,6,7,8,9]
 * Example 2:
 *
 * Input: n = 2
 * Output: [1,2]
 *
 *
 * Constraints:
 *
 * 1 <= n <= 5 * 104
 *
 * **/
fun main() {
    println( lexicalOrder(50))

}
    fun lexicalOrder(n: Int): List<Int> {
        val list: MutableList<Int> = mutableListOf()


        fun dfs(current: Int) {
            if(current>n) return
            list.add(current)

            for(i in 0..9) {
                val next = current*10+i
                if(next>n) return
                dfs(next)
            }
        }


        for (i in 1..9) {
            dfs(i)
        }

        return list

    }
