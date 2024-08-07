package book

import book.Chapter6
import kotlin.test.Test

class Chapter6Test {
    @Test
    fun binarySearch() {
        val result = Chapter6.binarySearch(sortedList = listOf(1, 2, 3, 5, 7, 14, 21, 50, 100), target = 8)
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun findMinimumSumMoreThanOrEqualToK() {
        val result = Chapter6.findMinimumSumMoreThanOrEqualToK(
            firstList = listOf(2, 3, 4, 4),
            secondList = listOf(4, 5, 7, 7),
            k = 7
        )
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun balloonPenalty() {
        val result =
            Chapter6.balloonPenalty(heights = listOf(2, 3, 4, 4), speeds = listOf(5, 2, 2, 2)) // 22, 11, 12, 12
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun balloonPenaltyRetry() {
        val result =
            Chapter6.balloonPenaltyRetry(heights = listOf(2, 3, 4, 4), speeds = listOf(5, 2, 2, 2))
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun coordinateCompression() {
        val result = Chapter6.coordinateCompression(list = listOf(12, 43, 7, 15, 9), target = 2)
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun coordinateCompressionRetry() {
        val result =
            Chapter6.coordinateCompressionRetry(list = listOf(12, 43, 7, 15, 9))
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun CombinationOfThree() {
        val result =
            Chapter6.CombinationOfThree(a = listOf(1, 2, 3), b = listOf(1, 2, 3), c = listOf(1, 2, 2))
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun CombinationOfThreeRetry() {
        val result =
            Chapter6.CombinationOfThreeRetry(a = listOf(1, 2, 3), b = listOf(4, 5, 6), c = listOf(7, 8, 9))
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun maxOfMinimumDistanceBetweenCottage() {
        val result = Chapter6.maxOfMinimumDistanceBetweenCottage(coordinates = listOf(1, 3, 5, 7, 9, 13), m = 2)
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun maxOfMinimumDistanceBetweenCottageRetry() {
        val result = Chapter6.maxOfMinimumDistanceBetweenCottageRetry(coordinates = listOf(1, 3, 5, 7, 9, 13), m = 3)
        println()
        println()
        println()
        println(result)
    }
}