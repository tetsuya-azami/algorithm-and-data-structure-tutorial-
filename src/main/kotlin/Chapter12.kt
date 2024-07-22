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

        fun quickSort(array: IntArray, left: Int, right: Int) {
            if (right - left <= 1) return
            val middle = (left + right) / 2
            val pivot = array[middle]

            swap(array, middle, right - 1) // ここが必要な理由
            var i = left // i - 1の要素まではpivot未満になる
            var j = left
            while (j < right - 1) {
                if (array[j] < pivot) {
                    swap(array, i++, j)
                }
                j++
            }
            swap(array, i, right - 1)

            quickSort(array, left, i)
            quickSort(array, i + 1, right)
        }

        private fun swap(array: IntArray, i1: Int, i2: Int) {
            val tmp = array[i1]
            array[i1] = array[i2]
            array[i2] = tmp
        }

        private fun heapify(array: IntArray, i: Int, n: Int) {
            var child1 = 2 * i + 1
            if (child1 >= n) return

            if (child1 + 1 < n && array[child1] < array[child1 + 1]) child1 += 1
            if (array[i] > array[child1]) return

            swap(array, i, child1)

            heapify(array, child1, n)
        }

        fun heapSort(array: IntArray) {
            val n = array.size
            for (i in (n / 2 - 1) downTo 0) {
                heapify(array, i, n)
            }

            for (i in (n - 1) downTo 0) {
                swap(array, 0, i)
                heapify(array, 0, i)
            }
        }

        private fun heapifyRetry(array: IntArray, root: Int, last: Int) {
            val child1Index = root * 2 + 1
            if (child1Index >= last) return
            val child2Index = root * 2 + 2
            val biggerChildIndex =
                if (child2Index < last && array[child1Index] < array[child2Index]) child2Index else child1Index

            if (array[biggerChildIndex] <= array[root]) return
            swap(array, biggerChildIndex, root)

            heapifyRetry(array, biggerChildIndex, last)
        }

        fun heapSortRetry(array: IntArray) {
            val n = array.size
            // 非葉ノードに対してheap構造化
            for (i in (n / 2 - 1) downTo 0) {
                heapifyRetry(array, i, n - 1)
            }

            for (i in (n - 1) downTo 0) {
                swap(array, 0, i)
                heapifyRetry(array, 0, i)
            }
        }

        fun bucketSort(array: IntArray): IntArray {
            val n = array.size
            val max = 10000
            val bucket = IntArray(max)
            for (i in array.indices) {
                bucket[array[i]]++
            }

            // 累積和
            val sum = IntArray(max)
            sum[0] = bucket[0]
            for (i in 1 until max) {
                sum[i] = sum[i - 1] + bucket[i]
            }

            val result = IntArray(n)
            for (i in result.indices) {
                result[--sum[array[i]]] = array[i]
            }

            return result
        }

        fun whatIsTheSmallest(array: IntArray, targetOriginalIndex: Int): Int {
            val sortedArray = array.sorted()

            var left = 0
            var right = sortedArray.size
            while (left + 1 < right) {
                val mid = (left + right) / 2
                if (sortedArray[mid] <= array[targetOriginalIndex]) left = mid
                if (sortedArray[mid] > array[targetOriginalIndex]) right = mid
            }

            return left + 1 // 何番目に小さいか
        }
    }
}