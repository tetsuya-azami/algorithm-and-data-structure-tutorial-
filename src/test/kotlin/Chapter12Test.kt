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

    @Test
    fun insertionSortRetry() {
        val result = Chapter12.insertionSortRetry(intArrayOf(7, 4, 5, 7, 3, 2, 33))
        println()
        println()
        println()
        result.forEach {
            print(it)
            println()
        }
    }

    @Test
    fun mergeSort() {
        val array = intArrayOf(33, 7, 4, 5, 7, 3, 2)
        Chapter12.mergeSort(array, 0, array.size)
        println()
        println()
        println()
        array.forEach {
            print(it)
            println()
        }
    }

    @Test
    fun mergeSortRetry() {
        val array = intArrayOf(33, 7, 4, 5, 7, 3, 2)
        Chapter12.mergeSortRetry(array, 0, array.size)
        println()
        println()
        println()
        array.forEach {
            print(it)
            println()
        }
    }

    @Test
    fun quickSort() {
        val array = intArrayOf(33, 7, 4, 5, 7, 3, 2)
        Chapter12.quickSort(array, 0, array.size)
        println()
        println()
        println()
        array.forEach {
            print(it)
            println()
        }
    }
}