import kotlin.math.abs

class Chapter5 {
    companion object {
        fun frog1(list: List<Int>): Int {
            val size = list.size
            val costs = mutableMapOf<Int, Int>()
            costs[0] = 0
            costs[1] = abs(list[1] - list[0])
            for (i in 2..<size) {
                costs[i] =
                    minOf(costs[i - 1]!! + abs(list[i] - list[i - 1]), costs[i - 2]!! + abs(list[i] - list[i - 2]))
            }

            return costs[size - 1]!!
        }

        fun knapsack(weightValueList: List<List<Int>>, knapsackAllowWeight: Int): Int {
            val n = weightValueList.size
            val array = Array(n + 1) { IntArray(knapsackAllowWeight + 1) }

            for (i in 0 until n) {
                for (w in 0..knapsackAllowWeight) {
                    val itemWeight = weightValueList[i][0]
                    val itemValue = weightValueList[i][1]
                    // 要素i+1を選ぶ場合
                    if (w - itemWeight >= 0) {
                        array[i + 1][w] = array[i][w - itemWeight] + itemValue
                    }

                    // 要素i+1を選ばない場合
                    array[i + 1][w] = maxOf(array[i + 1][w], array[i][w])
                }
            }
            // チェック用
            array.forEach { innerArray ->
                innerArray.forEach { e ->
                    print("$e,")
                }
                println()
            }

            return array[n][knapsackAllowWeight]
        }

        fun knapsackRetry(weightList: List<Int>, valueList: List<Int>, allowWeight: Int): Int {
            if (weightList.size != valueList.size) throw IllegalArgumentException()
            val itemSize = weightList.size
            val dp = Array(itemSize + 1) { IntArray(allowWeight + 1) }
            for (i in 1..itemSize) {
                for (w in 1..allowWeight) {
                    // i番目の商品を選べない場合
                    if (w - weightList[i - 1] < 0) {
                        dp[i][w] = dp[i - 1][w]
                    } else { // i番目の商品を選べる場合
                        dp[i][w] = maxOf(dp[i - 1][w], dp[i - 1][w - weightList[i - 1]] + valueList[i - 1])
                    }
                }
            }

            dp.forEach { array ->
                array.forEach { e ->
                    print("$e,")
                }
                println()
            }

            return dp[itemSize][allowWeight]
        }
    }
}