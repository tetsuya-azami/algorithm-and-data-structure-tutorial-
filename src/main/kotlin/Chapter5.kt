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
    }
}