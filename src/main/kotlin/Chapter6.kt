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
    }
}