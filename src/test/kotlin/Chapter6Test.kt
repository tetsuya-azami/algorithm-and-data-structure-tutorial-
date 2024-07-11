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
}