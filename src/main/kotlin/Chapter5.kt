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

        fun editDistance(s: String, t: String): Int {
            val dp = Array(s.length + 1) { Array(t.length + 1) { Int.MAX_VALUE } }

            dp[0][0] = 0
            for (sIndex in 0..s.length) {
                for (tIndex in 0..t.length) {
                    if (sIndex - 1 >= 0 && tIndex - 1 >= 0) {
                        if (s[sIndex - 1] == t[tIndex - 1]) {
                            dp[sIndex][tIndex] = dp[sIndex - 1][tIndex - 1]
                        } else {
                            dp[sIndex][tIndex] = dp[sIndex - 1][tIndex - 1] + 1
                        }
                    }
                    if (sIndex - 1 >= 0) dp[sIndex][tIndex] = minOf(dp[sIndex][tIndex], dp[sIndex - 1][tIndex] + 1)
                    if (tIndex - 1 >= 0) dp[sIndex][tIndex] = minOf(dp[sIndex][tIndex], dp[sIndex][tIndex - 1] + 1)
                }
            }

            // 監視用
            dp.forEach { array ->
                array.forEach { e ->
                    print("$e,")
                }
                println()
            }

            return dp[s.length][t.length]
        }

        fun editDistanceRetry(s: String, t: String): Int {
            val dp = Array(s.length + 1) { Array(t.length + 1) { Int.MAX_VALUE } }

            dp[0][0] = 0
            for (sIndex in 0..s.length) {
                for (tIndex in 0..t.length) {
                    if (sIndex - 1 >= 0 && tIndex - 1 >= 0) {
                        if (s[sIndex - 1] == t[tIndex - 1]) dp[sIndex][tIndex] = dp[sIndex - 1][tIndex - 1]
                        else dp[sIndex][tIndex] = dp[sIndex - 1][tIndex - 1] + 1
                    }
                    if (sIndex - 1 >= 0) dp[sIndex][tIndex] = minOf(dp[sIndex][tIndex], dp[sIndex - 1][tIndex] + 1)
                    if (tIndex - 1 >= 0) dp[sIndex][tIndex] = minOf(dp[sIndex][tIndex], dp[sIndex][tIndex - 1] + 1)
                }
            }

            dp.forEach { array ->
                array.forEach { e ->
                    print("$e,")
                }
                println()
            }

            return dp[s.length][t.length]
        }

        fun enjoySummerVacation(enjoyPoints: List<Map<String, Int>>): Int {
            val dp = Array(enjoyPoints.size + 1) { enjoyPoints.first().keys.associateWith { 0 }.toMutableMap() }

            for (date in enjoyPoints.indices) { // 夏休みの日数分回す
                for (enjoyedYesterday in enjoyPoints[date].keys) {
                    for (enjoyToday in enjoyPoints[date].keys) {
                        if (enjoyedYesterday == enjoyToday) continue
                        dp[date + 1][enjoyToday] = maxOf(
                            dp[date + 1][enjoyToday]!!, // 元々の値
                            dp[date][enjoyedYesterday]!! + enjoyPoints[date][enjoyToday]!! //
                        )
                    }
                }
            }

            dp.forEach { m ->
                println(m)
            }

            return dp[enjoyPoints.size].maxBy { it.value }.value
        }

        fun enjoySummerVacationRetry(enjoyPoints: List<Map<String, Int>>): Int {
            val summerVacationDays = enjoyPoints.size
            val dp = Array(summerVacationDays + 1) { enjoyPoints.first().keys.associateWith { 0 }.toMutableMap() }
            for (i in 1..summerVacationDays) {
                for (enjoyedYesterday in enjoyPoints[i - 1]) {
                    for (enjoyToday in enjoyPoints[i - 1]) {
                        if (enjoyToday == enjoyedYesterday) continue
                        dp[i][enjoyToday.key] =
                            maxOf(dp[i][enjoyToday.key]!!, dp[i - 1][enjoyedYesterday.key]!! + enjoyToday.value)
                    }
                }
            }

            dp.forEach { map ->
                map.forEach { entry ->
                    print("$entry,")
                }
                println()
            }

            return dp[summerVacationDays].maxBy { it.value }.value
        }

        fun partialSum(list: List<Int>, w: Int): Boolean {
            val dp = Array(list.size + 1) { BooleanArray(w + 1) }
            for (i in dp.indices) dp[i][0] = true
            for (i in 1..list.size) {
                for (k in 1..w) {
                    // i番目を使わない場合
                    if (dp[i - 1][k]) dp[i][k] = true
                    // i番目を使う場合
                    if (k - list[i - 1] >= 0 && dp[i - 1][k - list[i - 1]]) dp[i][k] = true
                }
            }

            dp.forEach { array ->
                array.forEach { bool ->
                    print("$bool,")
                }
                println()
            }

            return dp[list.size][w]
        }

        fun partialSumRetry(list: List<Int>, w: Int): Boolean {
            val dp = Array(list.size + 1) { BooleanArray(w + 1) }
            for (i in 0..(list.size + 1)) dp[i][0] = true
            for (i in list.indices) {
                for (k in 0..w) {
                    // i番目を使わない場合
                    if (dp[i][k]) dp[i + 1][k] = true
                    // i番目を使う場合
                    if (k - list[i] >= 0 && dp[i][k - list[i]]) dp[i + 1][k] = true
                }
            }

            return dp[list.size][w]
        }
    }
}