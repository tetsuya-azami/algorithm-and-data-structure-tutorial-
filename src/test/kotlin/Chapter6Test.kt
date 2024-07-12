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
}