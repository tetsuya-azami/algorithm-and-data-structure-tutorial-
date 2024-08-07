package book

import book.Chapter3
import org.junit.jupiter.api.Test

class Chapter3Test {
    @Test
    fun isPartialSumCanBeTargetSum() {
        val result = Chapter3.isPartialSumCanBeTargetSum(list = listOf(1, 2, 3), targetSum = 6)
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun findTargetNumberFromList() {
        val result =
            Chapter3.findTargetNumberFromList(list = listOf(1, 2, 3, 3, 4, 5, 3), targetNumber = 1)
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun findSecondSmallestNumber() {
        val result = Chapter3.findSecondSmallestNumber(list = listOf(1, 4, 2, 2, 4, 5, 9))
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun calculateMaxGapBetweenElementPair() {
        val result =
            Chapter3.calculateMaxGapBetweenElementPair(list = listOf(1, 4, 2, 2, 4, 5, 9))
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun divideByTwoIfAllElementsAreMultipleOfTwo() {
        val result =
            Chapter3.divideByTwoIfAllElementsAreMultipleOfTwo(list = listOf(16, 4, 4, 8))
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun countSumOfThreeIntegersEqualsToN() {
        val result = Chapter3.countSumOfThreeIntegersEqualsToN(k = 2, n = 4)
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun sumOfPartialNumber() {
        val result = Chapter3.sumOfPartialNumber(s = "125")
        println()
        println()
        println()
        println(result)
    }
}
