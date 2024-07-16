import kotlin.test.Test

class Chapter8Test {
    @Test
    fun getIndexPairOfEqualValue() {
        val result = Chapter8.getIndexPairOfEqualValue(setOf(1, 2, 3, 4, 5), setOf(5, 1, 2, 3))
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun IsSumCanbeK() {
        val result = Chapter8.isSumCanBeK(a = listOf(1, 2, 5), b = listOf(7, 3), k = 10)
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun isSumCanBeKRetry() {
        val result = Chapter8.isSumCanBeKRetry(a = listOf(1, 2, 5), b = listOf(7, 3), k = 8)
        println()
        println()
        println()
        println(result)
    }
}