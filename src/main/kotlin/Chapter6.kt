class Chapter6 {
    companion object {
        fun binarySearch(sortedList: List<Int>, target: Int): Boolean {
            var left = 0
            var right = sortedList.size - 1
            var result = false
            do {
                val mid = (left + right) / 2
                if (sortedList[mid] == target) {
                    result = true
                    break
                }
                if (sortedList[mid] < target) left = mid + 1
                if (sortedList[mid] > target) right = mid - 1
            } while (left <= right)

            return result
        }
    }
}