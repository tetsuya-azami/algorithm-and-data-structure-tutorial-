package book

import book.Chapter4
import kotlin.test.Test

class Chapter4Test {
    @Test
    fun partialSumProblemWithRecursion() {
        val result =
            Chapter4.partialSumProblemWithRecursion(list = listOf(1, 2, 3, 4, 5), w = 1)
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun tribonacci() {
        val result = Chapter4.tribonacci(5)
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun improvedTribonacci() {
        val result = Chapter4.improvedTribonacci(5)
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun sevenFiveTreeNum() {
        Chapter4.sevenFiveThreeNum(375, 0, 0)
        println()
        println()
        println()
        println(Chapter4.counter)
    }

    @Test
    fun memorizedPartialSum() {
        val list = listOf(1, 2, 3)
        val result = Chapter4.memorizedPartialSum(5, list, list.size - 1)
        println()
        println()
        println()
        println(result)
    }
}