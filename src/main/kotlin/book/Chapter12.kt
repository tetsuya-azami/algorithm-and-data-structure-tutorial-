package book

import kotlin.math.min

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

        fun bucketSortRetry(array: IntArray): List<Int> {
            val bucket = IntArray(10000)
            for (i in array.indices) {
                bucket[array[i]]++
            }

            val result = mutableListOf<Int>()
            for (i in bucket.indices) {
                while (bucket[i] > 0) {
                    result += i
                    bucket[i]--
                }
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

        fun whatIsTheSmallestRetryBucketVersion(array: IntArray, targetOriginalIndex: Int): Int {
            val min = 0
            val max = 100
            val bucket = IntArray(max - min + 1)
            for (i in array.indices) {
                bucket[array[i]]++
            }

            // 累積和
            val cumulativeSums = IntArray(array.size)
            cumulativeSums[0] = bucket[0]
            for (i in 1 until cumulativeSums.size) {
                cumulativeSums[i] = cumulativeSums[i - 1] + bucket[i]
            }

            return cumulativeSums[array[targetOriginalIndex]] // arrayに同じ数字の要素があった場合、最後の要素のIndexが返る
        }

        fun whatIsTheSmallestRetryLowerBoundsVersion(array: IntArray, targetOriginalIndex: Int): Int {
            val target = array[targetOriginalIndex]
            val sortedArray = array.sorted()
            var left = 0
            var right = sortedArray.size - 1
            while (left <= right) {
                val mid = (left + right) / 2
                if (target <= sortedArray[mid]) right = mid - 1 else left = mid + 1
            }

            return right + 1
        }

        fun calculateMinimumEnergyDrinkAmount(energyDrinkPrices: List<Int>, quantities: List<Int>, m: Int): Int {
            val list = mutableListOf<Pair<Int, Int>>()

            for (i in energyDrinkPrices.indices) {
                list.add((energyDrinkPrices[i] to quantities[i]))
            }

            val sortedList = list.sortedBy { it.first }

            var totalPrice = 0
            var totalBuyCount = 0
            var nowIndex = 0

            while (totalBuyCount < m) {
                val price = sortedList[nowIndex].first
                val availableBuyCount = sortedList[nowIndex].second
                val buyCount = min(availableBuyCount, m - totalBuyCount)
                totalBuyCount += buyCount
                totalPrice += price * buyCount
                nowIndex++
            }

            return totalPrice
        }
    }
}