import kotlin.test.Test

class Chapter5Test {
    @Test
    fun frog1() {
        val result = Chapter5.frog1(list = listOf(2, 9, 4, 5, 16, 10))
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun knapsack() {
        val weightValueList =
            listOf(listOf(2, 3), listOf(1, 2), listOf(3, 6), listOf(2, 1), listOf(1, 3), listOf(5, 85))
        val result = Chapter5.knapsack(weightValueList, 15)
        println()
        println()
        println()
        println(result)
    }
}