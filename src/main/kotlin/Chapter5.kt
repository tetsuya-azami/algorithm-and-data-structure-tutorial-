import kotlin.math.abs

class Chapter5 {
    companion object {
        fun frog1(list: List<Int>): Int {
            val size = list.size
            val costs = mutableMapOf<Int, Int>()
            costs[0] = 0
            costs[1] = abs(list[1] - list[0])
            for (i in 2..<size) {
                costs[i] =
                    minOf(costs[i - 1]!! + abs(list[i] - list[i - 1]), costs[i - 2]!! + abs(list[i] - list[i - 2]))
            }

            return costs[size - 1]!!
        }
    }
}