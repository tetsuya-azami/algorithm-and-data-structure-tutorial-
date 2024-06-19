import org.junit.jupiter.api.Test

class Chapter3Test{
    @Test
    fun isPartialSumCanBeTargetSum(){
        val result = Chapter3.isPartialSumCanBeTargetSum(list = listOf(1, 2, 3), targetSum = 6)
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun findTargetNumberFromList(){
        val result =
            Chapter3.findTargetNumberFromList(list = listOf(1, 2, 3, 3, 4, 5, 3), targetNumber = 1)
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun findSecondSmallestNumber(){
        val result = Chapter3.findSecondSmallestNumber(list = listOf(1, 4, 2, 2, 4, 5, 9))
        println()
        println()
        println()
        println(result)
    }
}
