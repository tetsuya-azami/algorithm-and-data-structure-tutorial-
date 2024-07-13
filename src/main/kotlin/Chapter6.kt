class Chapter6 {
    companion object {
        fun binarySearch(sortedList: List<Int>, target: Int): Boolean {
            var left = 0
            var right = sortedList.size - 1
            var result = false
            while (left <= right) {
                val mid = (left + right) / 2
                if (sortedList[mid] == target) {
                    result = true
                    break
                }
                if (sortedList[mid] < target) left = mid + 1
                if (sortedList[mid] > target) right = mid - 1
            }

            return result
        }

        fun findMinimumSumMoreThanOrEqualToK(firstList: List<Int>, secondList: List<Int>, k: Int): Int {
            val sortedSecondList = secondList.sorted()
            var result = Int.MAX_VALUE
            for (i in firstList.indices) {
                var left = 0
                var right = sortedSecondList.size - 1
                while (right >= left) {
                    val mid = (right + left) / 2
                    if (firstList[i] + secondList[mid] >= k) {
                        result = minOf(result, firstList[i] + secondList[mid])
                        right = mid - 1
                    } else {
                        left = mid + 1
                    }
                }
            }

            return result
        }

        fun balloonPenalty(heights: List<Int>, speeds: List<Int>): Int {
            // ペナルティの上限値
            val maxPenalty = heights.mapIndexed { index, height ->
                height + speeds[index] * heights.size
            }.maxBy { it }

            var left = 0
            var right = maxPenalty

            while (right > left + 1) {
                var mid = (left + right) / 2
                var isOk = true
                val timeLimits = MutableList(heights.size) { 0 } // 制限時間

                for (i in heights.indices) {
                    if (mid < heights[i]) isOk = false
                    else timeLimits[i] = (mid - heights[i]) / speeds[i]
                }

                val sortedTimeLimits = timeLimits.sorted()
                for (i in heights.indices) {
                    if (sortedTimeLimits[i] < i) isOk = false
                }
                if (isOk) right = mid
                else left = mid + 1
            }

            return right
        }

        fun balloonPenaltyRetry(heights: List<Int>, speeds: List<Int>): Int {
            val maxPenalty = heights.mapIndexed { index, height ->
                height + speeds[index] * heights.size
            }.max()

            var left = 0
            var right = maxPenalty
            while (right > left + 1) {
                val mid = (left + right) / 2
                var isOk = true

                val timeLimits = MutableList(heights.size) { 0 }
                for (i in heights.indices) {
                    if (mid < heights[i]) isOk = false
                    else timeLimits[i] = (mid - heights[i]) / speeds[i]
                }

                val sortedTimeLimits = timeLimits.sorted()

                for (i in heights.indices) {
                    if (sortedTimeLimits[i] < i) isOk = false
                }

                if (isOk) right = mid
                else left = mid + 1
            }

            return right
        }

        fun coordinateCompression(list: List<Int>, target: Int): Int {
            val sortedList = list.sorted()
            for (i in sortedList.indices) {
                if (list[target] == sortedList[i]) return i
            }
            throw IllegalArgumentException()
        }

        fun CombinationOfThree(a: List<Int>, b: List<Int>, c: List<Int>): Int {
            val sortedA = a.sorted()
            val sortedB = b.sorted()
            val sortedC = c.sorted()

            var result = 0
            // a<b<cの組み合わせ
            for (i in sortedB.indices) {
                // A(Bより小さい値のうち最大値)
                var leftA = -1
                var rightA = sortedA.size
                while (rightA > leftA + 1) {
                    val mid = (leftA + rightA) / 2
                    if (sortedB[i] > sortedA[mid]) leftA = mid
                    else rightA = mid
                }

                // C(Bより大きい値のうち最小値を求めたい)
                var leftC = -1
                var rightC = sortedC.size
                while (rightC > leftC + 1) {
                    val mid = (leftC + rightC) / 2
                    if (sortedB[i] < sortedC[mid]) rightC = mid
                    else leftC = mid
                }

                result += (leftA + 1) * (sortedC.size - rightC)
            }

            return result
        }

        fun maxOfMinimumDistanceBetweenCottage(coordinates: List<Int>, m: Int): Int {
            var left = 0
            var right = Int.MAX_VALUE
            while (right > left + 1) {
                val mid = (left + right) / 2

                var count = 1
                var prev = 0
                for (i in coordinates.indices) {
                    if (coordinates[i] - coordinates[prev] >= mid) {
                        count++
                        prev = i
                    }
                }

                if (count >= m) left = mid
                else right = mid
            }

            return left
        }
    }
}