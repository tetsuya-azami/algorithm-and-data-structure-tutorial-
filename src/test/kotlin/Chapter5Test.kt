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

    @Test
    fun knapsackRetry() {
        val weightList = listOf(2, 1, 3, 2, 1, 5)
        val valueList = listOf(3, 2, 6, 1, 3, 85)
        val result = Chapter5.knapsackRetry(weightList, valueList, 15)
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun editDistance() {
        val result = Chapter5.editDistance(s = "logistic", t = "algorithm")
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun editDistanceRetry() {
        val result = Chapter5.editDistanceRetry(s = "logistic", t = "algorithm")
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun enjoySummerVacation() {
        val enjoyPoints: List<Map<String, Int>> =
            listOf(
                mapOf("umi" to 3, "mushitori" to 2, "homework" to 1),
                mapOf("umi" to 4, "mushitori" to 3, "homework" to 2),
                mapOf("umi" to 3, "mushitori" to 2, "homework" to 5)
            )
        val result = Chapter5.enjoySummerVacation(enjoyPoints)
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun enjoySummerVacationRetry() {
        val enjoyPoints: List<Map<String, Int>> =
            listOf(
                mapOf("umi" to 3, "mushitori" to 2, "homework" to 1),
                mapOf("umi" to 4, "mushitori" to 3, "homework" to 2),
                mapOf("umi" to 3, "mushitori" to 2, "homework" to 5)
            )
        val result = Chapter5.enjoySummerVacationRetry(enjoyPoints)
        println()
        println()
        println()
        println(result)
    }
}