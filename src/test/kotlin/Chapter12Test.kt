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

    @Test
    fun heapSort() {
        val array = intArrayOf(33, 7, 4, 5, 7, 3, 2)
        Chapter12.heapSort(array)
        println()
        println()
        println()
        array.forEach {
            print(it)
            println()
        }
    }

    @Test
    fun heapSortRetry() {
        val array = intArrayOf(33, 7, 4, 5, 7, 3, 2)
        Chapter12.heapSortRetry(array)
        println()
        println()
        println()
        array.forEach {
            print(it)
            println()
        }
    }

    @Test
    fun bucketSort() {
        val array = intArrayOf(33, 7, 4, 5, 7, 3, 2)
        val result = Chapter12.bucketSort(array)
        println()
        println()
        println()
        result.forEach {
            print(it)
            println()
        }
    }

    @Test
    fun whatIsTheSmallest() {
        val array = intArrayOf(33, 7, 4, 5, 7, 3, 2)
        val result = Chapter12.whatIsTheSmallest(array, 3)
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun bucketSortRetry() {
        val array = intArrayOf(33, 7, 4, 5, 7, 3, 2)
        val result = Chapter12.bucketSortRetry(array)
        println()
        println()
        println()
        result.forEach {
            print(it)
            println()
        }
    }
}