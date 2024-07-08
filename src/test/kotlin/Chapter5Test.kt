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

    @Test
    fun partialSum() {
        val result = Chapter5.partialSum(listOf(1, 2, 3, 4, 5), 10)
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun partialSumRetry() {
        val result = Chapter5.partialSum(listOf(1, 2, 3), 10)
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun partialSumFullSearch() {
        val result = Chapter5.partialSumFullSearch(listOf(1, 2, 3), 10)
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun partialSumCombination() {
        val result = Chapter5.partialSumCombination(listOf(1, 2, 3), 10)
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun partialSumCombinationRetry() {
        val result = Chapter5.partialSumCombinationRetry(listOf(1, 2, 3, 4, 5), 10)
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun partialSumExtractK() {
        val result = Chapter5.partialSumExtractK(list = listOf(1, 2, 3, 4, 5), w = 10, k = 3)
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun partialSumExtractKRetry() {
        val result = Chapter5.partialSumExtractKRetry(list = listOf(1, 2, 3, 4, 5), w = 10, k = 3)
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun partialSumAllowMultiSelect() {
        val result = Chapter5.partialSumAllowMultiSelect(list = listOf(2, 3), w = 10)
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun partialSumAllowMultiSelectRetry() {
        val result = Chapter5.partialSumAllowMultiSelectRetry(list = listOf(2, 3), w = 10)
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun partialSumAllowLimitedMultiSelect() {
        val result = Chapter5.partialSumAllowLimitedMultiSelect(list = listOf(2, 3), w = 10, limits = listOf(2, 2))
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun partialSumAllowLimitedMultiSelectRetry() {
        val result = Chapter5.partialSumAllowLimitedMultiSelectRetry(list = listOf(2), w = 10, limits = listOf(2, 2))
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun longestCommonPartialWord() {
        val result = Chapter5.longestCommonPartialWord(s = "abcd", t = "acde") // acd
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun longestCommonPartialWordRetry() {
        val result = Chapter5.longestCommonPartialWord(s = "abcc", t = "acde") // acd
        println()
        println()
        println()
        println(result)
    }
}