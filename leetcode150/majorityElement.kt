package leetcode150

fun majorityElement(nums: IntArray): Int {
        if(nums.size == 1)
        return nums[0]
        val map:MutableMap<Int, Int> = mutableMapOf()
        for(num in nums) {
            if(map.get(num) == null){
                map.put(num, 1)
            } else {
                var count = map.get(num)
                count = count?.plus(1)
                if(count!!.compareTo(nums.size/2) > 0)
                    return num
                map.put(num, count)
            }
        }
        return -1


    }

    fun main() {
        val arr = intArrayOf(1,3,5,5,1,2,3,3,3,5,1,5,8,5,9,5,10)
        val maj = majorityElement(arr)
        println(maj)

    }



