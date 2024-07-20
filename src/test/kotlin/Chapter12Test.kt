import kotlin.test.Test

class Chapter12Test {
    @Test
    fun insertionSort() {
        val result = Chapter12.insertionSort(intArrayOf(7, 4, 5, 7, 3, 2, 33))
        println()
        println()
        println()
        result.forEach {
            print(it)
            println()
        }
    }
}