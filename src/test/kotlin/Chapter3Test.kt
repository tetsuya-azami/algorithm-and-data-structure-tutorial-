import org.junit.jupiter.api.Test

class Chapter3Test{
    @Test
    fun partialSum(){
        val result = Chapter3.isPartialSumCanBeTargetSum(list = listOf(1, 2, 3), targetSum = 6)
        println()
        println()
        println()
        println(result)
    }
}