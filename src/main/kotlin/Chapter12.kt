class Chapter12 {
    companion object {
        fun insertionSort(array: IntArray): IntArray {
            for (i in 1..<array.size) {
                val insertTarget = array[i]

                var j = i
                while (j in 1..i) {
                    if (array[j - 1] > insertTarget) {
                        array[j] = array[j - 1]
                    } else {
                        break
                    }
                    j--
                }
                array[j] = insertTarget
            }

            return array
        }

        fun insertionSortRetry(array: IntArray): IntArray {
            for (i in 1..<array.size) {
                val insertionTarget = array[i]
                var j = i
                while (j > 0) {
                    if (array[j - 1] > insertionTarget) {
                        array[j] = array[j - 1]
                    } else {
                        break
                    }
                    j--
                }
                array[j] = insertionTarget
            }

            return array
        }

        fun mergeSort(array: IntArray, left: Int, right: Int) {
            if (right - left <= 1) return
            val middle = (left + right) / 2

            mergeSort(array, left, middle)
            mergeSort(array, middle, right)

            val buf = mutableListOf<Int>()
            for (i in left until middle) buf.add(array[i])
            for (i in right - 1 downTo middle) buf.add(array[i])

            var leftIndex = 0
            var rightIndex = buf.size - 1
            for (i in left until right) {
                if (buf[leftIndex] <= buf[rightIndex]) {
                    array[i] = buf[leftIndex++]
                } else {
                    array[i] = buf[rightIndex--]
                }
            }
        }

        fun mergeSortRetry(array: IntArray, left: Int, right: Int) {
            if (right - left <= 1) return

            val middle = (left + right) / 2
            mergeSort(array, left, middle)
            mergeSort(array, middle, right)

            val buf = mutableListOf<Int>()
            for (i in left..<middle) buf.add(array[i])
            for (i in right - 1 downTo middle) buf.add(array[i])

            var bufLeft = 0
            var bufRight = buf.size - 1
            for (i in left..<right) {
                if (buf[bufLeft] <= buf[bufRight]) {
                    array[i] = buf[bufLeft++]
                } else {
                    array[i] = buf[bufRight--]
                }
            }
        }
    }
}