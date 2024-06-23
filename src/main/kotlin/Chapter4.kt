class Chapter4 {
    companion object {
        private val globalTribonacciMap = mutableMapOf(0 to 0, 1 to 0, 2 to 1)
        fun partialSumProblemWithRecursion(list: List<Int>, w: Int): Boolean {
            // ベースケース
            if (w == 0) return true
            if (w < 0) return false
            if (list.isEmpty()) {
                return false
            }

            val listLastRemoved = list.subList(fromIndex = 0, toIndex = list.size - 1)
            // 最後の要素を使う場合
            val subtractedListResult = partialSumProblemWithRecursion(listLastRemoved, w - list.last())

            // 最後の要素を使わない場合
            val notSubtractedListResult = partialSumProblemWithRecursion(listLastRemoved, w)

            return subtractedListResult || notSubtractedListResult
        }

        fun tribonacci(n: Int): Int {
            if (n < 0) throw IllegalArgumentException("nは0以上です")
            if (n == 0) return 0
            if (n == 1) return 0
            if (n == 2) return 1

            return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3)
        }

        fun improvedTribonacci(n: Int): Int {
            if (n == 0) return globalTribonacciMap[0]!!
            if (n == 1) return globalTribonacciMap[1]!!
            if (n == 2) return globalTribonacciMap[2]!!

            val prev3 = globalTribonacciMap[n - 3] ?: improvedTribonacci(n - 3)
            val prev2 = globalTribonacciMap[n - 2] ?: improvedTribonacci(n - 2)
            val prev1 = globalTribonacciMap[n - 1] ?: improvedTribonacci(n - 1)

            val result = prev3 + prev2 + prev1
            globalTribonacciMap[n] = result

            return result
        }

        var counter: Int = 0

        fun sevenFiveThreeNum(k: Int, current: Int, use: Int) {
            // 357, 375, 537, 573, 735, 753
            if (current > k) return
            if (use == 0b111) counter++

            // 7を追加
            sevenFiveThreeNum(k, current * 10 + 7, use or 0b100)
            // 5を追加
            sevenFiveThreeNum(k, current * 10 + 5, use or 0b010)
            // 3を追加
            sevenFiveThreeNum(k, current * 10 + 3, use or 0b001)
        }

        private lateinit var cache: Array<Array<Boolean?>>
        fun memorizedPartialSum(w: Int, list: List<Int>, index: Int): Boolean {
            if (!::cache.isInitialized) {
                cache = Array(w + 1) { arrayOfNulls<Boolean?>(list.size) }
            }
            if (w == 0) return true
            if (w < 0) return false
            // ベースケース
            if (index == 0) {
                val result = w - list[0] == 0
                cache[w][0] = result
                return result
            }
            // キャッシュがあればキャッシュの値を返す。
            if (cache[w][index] != null) {
                return cache[w][index]!!
            }

            // list[index]を使う場合
            val nextW = w - list[index]
            if (nextW < 0) return false
            val useIndexElementResult = memorizedPartialSum(nextW, list, index - 1)
            cache[nextW][index - 1] = useIndexElementResult

            // list[index]を使わない場合
            val notUseIndexElementResult = memorizedPartialSum(w, list, index - 1)
            cache[w][index - 1] = notUseIndexElementResult

            return useIndexElementResult || notUseIndexElementResult
        }
    }
}