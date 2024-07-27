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
    fun whatIsTheSmallestRetry() {
        val array = intArrayOf(33, 7, 4, 5, 7, 3, 2)
        val result = Chapter12.whatIsTheSmallest(array, 3)
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun whatIsTheSmallestRetryBucketVersion() {
        val array = intArrayOf(33, 7, 4, 5, 5, 7, 3, 2)
        val result = Chapter12.whatIsTheSmallestRetryBucketVersion(array, 3)
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun whatIsTheSmallestRetryLowerBoundsVersion() {
        val array = intArrayOf(33, 7, 4, 5, 5, 7, 3, 2)
        val result = Chapter12.whatIsTheSmallestRetryLowerBoundsVersion(array, 3)
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun calculateMinimumEnergyDrinkAmount() {
        val a = listOf(200, 600, 700, 100, 500)
        val b = listOf(5, 3, 10, 2, 7)
        val result = Chapter12.calculateMinimumEnergyDrinkAmount(a, b, 10) // 100:2,200:5,500,3
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun countConnectedComponents() {
        val graph =
            arrayOf(
                arrayOf(2, 7),
                arrayOf(),
                arrayOf(0, 4),
                arrayOf(5),
                arrayOf(2),
                arrayOf(3, 6),
                arrayOf(5),
                arrayOf(0)
            )
        val result = Chapter12.countConnectedComponents(graph)
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun countConnectedComponentsRetry() {
        val graph =
            arrayOf(
                arrayOf(2, 7),
                arrayOf(),
                arrayOf(0, 4),
                arrayOf(5),
                arrayOf(2),
                arrayOf(3, 6),
                arrayOf(5),
                arrayOf(0)
            )
        val result = Chapter12.countConnectedComponentsRetry(graph)
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun countConnectedComponentsBfs() {
        val graph =
            arrayOf(
                arrayOf(2, 7),
                arrayOf(),
                arrayOf(0, 4),
                arrayOf(5),
                arrayOf(2),
                arrayOf(3, 6),
                arrayOf(5),
                arrayOf(0)
            )
        val result = Chapter12.countConnectedComponentsBfs(graph)
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun isSTPathExist() {
        val graph =
            arrayOf(
                arrayOf(2, 7),
                arrayOf(),
                arrayOf(0, 4),
                arrayOf(5),
                arrayOf(2),
                arrayOf(3, 6),
                arrayOf(5),
                arrayOf(0)
            )
        val result = Chapter12.isSTPathExist(graph, 3, 5)
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun isSTPathExistBfs() {
        val graph =
            arrayOf(
                arrayOf(2, 7),
                arrayOf(),
                arrayOf(0, 4),
                arrayOf(5),
                arrayOf(2),
                arrayOf(3, 6),
                arrayOf(5),
                arrayOf(0)
            )
        val result = Chapter12.isSTPathExistBfs(graph, 0, 1)
        println()
        println()
        println()
        println(result)
    }
}