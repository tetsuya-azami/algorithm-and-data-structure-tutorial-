package book

import kotlin.math.min
import kotlin.math.pow

class Chapter3 {
    companion object {
        /**
         * listの部分集合の内、合計がtargetSumになるものがあるかどうか判定する。
         * listの要素の組み合わせに対しての全探索
         * 計算量: O(list-size(2^list-size))
         * → 動的計画法の方が良いらしい
         */
        fun isPartialSumCanBeTargetSum(list: List<Int>, targetSum: Int): Boolean {
            val size = list.size
            val combinationPatternCount = 2.0.pow(size).toInt()
            // iが部分集合を表す
            for (partialSet in 0..<combinationPatternCount) {
                // AND演算を使って部分集合の合計を計算
                var sum = 0
                for (j in 0..<size) {
                    if (partialSet and (1 shl j) != 0) {
                        sum += list[j]
                    }
                }
                if (sum == targetSum) {
                    return true
                }
            }

            return false
        }

        /**
         * 計算量: O(list-size)
         */
        fun findTargetNumberFromList(list: List<Int>, targetNumber: Int): Int {
            return list.count { e -> e == targetNumber }
        }

        /**
         * 計算量: O(list-size)
         */
        fun findSecondSmallestNumber(list: List<Int>): Int {
            var smallestNumber = Int.MAX_VALUE
            var secondSmallestNumber = Int.MAX_VALUE
            for (e in list) {
                if (e < smallestNumber) {
                    secondSmallestNumber = smallestNumber
                    smallestNumber = e
                } else if (e < secondSmallestNumber) {
                    secondSmallestNumber = e
                }
            }

            return secondSmallestNumber
        }

        /**
         * 計算量: O(list-size)
         */
        fun calculateMaxGapBetweenElementPair(list: List<Int>): Int {
            var max = Int.MIN_VALUE
            var min = Int.MAX_VALUE

            for (e in list) {
                if (max < e) max = e
                if (e < min) min = e
            }

            return max - min
        }

        fun divideByTwoIfAllElementsAreMultipleOfTwo(list: List<Int>): Int {
            var count = 0
            val targetList = list.toMutableList()
            while (true) {
                for ((index, e) in targetList.withIndex()) {
                    if (e % 2 == 0) {
                        targetList[index] = e / 2
                    } else {
                        return count
                    }
                }
                count++
            }
        }

        fun countSumOfThreeIntegersEqualsToN(k: Int, n: Int): Int {
            var result = 0
            for (x in 0..min(k, n)) {
                for (y in 0..min(k, n)) {
                    val z = n - x - y
                    if (z < 0 || k < z) continue
                    println("result: $x, $y, ${n - x - y}")
                    result++
                }
            }

            // xとyの順番を取り除く
            return result
        }

        fun sumOfPartialNumber(s: String): Int {
            val n = s.length
            var sum = 0
            for (bit in 0..<(1 shl (n - 1))) { // 0,1,01,11,001,010,011,100.... +が入るか入らないかの組み合わせでループ
                var tmp = 0
                for (i in 0..<(n - 1)) { // 文字列でループ  i: 0,1,2,3,4...
                    tmp *= 10
                    tmp += s[i] - '0'
                    if (bit and (1 shl i) != 0) {
                        sum += tmp
                        tmp = 0
                    }
                }
                tmp *= 10
                tmp += (s[n - 1] - '0')
                sum += tmp
            }

            return sum
        }
    }
}