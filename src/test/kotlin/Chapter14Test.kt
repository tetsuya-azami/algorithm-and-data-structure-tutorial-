import kotlin.test.Test

class Chapter14Test {
    @Test
    fun bellmanFord() {
        val graph = arrayOf(
            arrayOf(Edge(1, 3), Edge(3, 100)),
            arrayOf(Edge(2, 50), Edge(3, 57), Edge(4, -4)),
            arrayOf(Edge(3, -10), Edge(4, -5), Edge(5, 100)),
            arrayOf(Edge(1, -5)),
            arrayOf(Edge(2, 57), Edge(3, 25), Edge(5, 8)),
            arrayOf()
        )
        val result = Chapter14.bellmanFord(graph = graph, n = 6, s = 0)
        println()
        println()
        println()
        result.forEachIndexed { index, i ->
            println("distance[$index]: $i")
        }
    }

    @Test
    fun bellmanFordRetry() {
        val graph = arrayOf(
            arrayOf(Edge(1, 3), Edge(3, 100)),
            arrayOf(Edge(2, 50), Edge(3, 57), Edge(4, -4)),
            arrayOf(Edge(3, -10), Edge(4, -5), Edge(5, 100)),
            arrayOf(Edge(1, -5)),
            arrayOf(Edge(2, 57), Edge(3, 25), Edge(5, 8)),
            arrayOf()
        )
        val result = Chapter14.bellmanFordRetry(graph = graph, n = 6, s = 0)
        println()
        println()
        println()
        result.forEachIndexed { index, i ->
            println("distance[$index]: $i")
        }
    }

    @Test
    fun dijkstraMethod() {
        val graph = arrayOf(
            arrayOf(Edge(1, 3), Edge(3, 100)),
            arrayOf(Edge(2, 50), Edge(3, 57), Edge(4, 4)),
            arrayOf(Edge(3, 10), Edge(4, 5), Edge(5, 100)),
            arrayOf(Edge(1, 5)),
            arrayOf(Edge(2, 57), Edge(3, 25), Edge(5, 8)),
            arrayOf()
        )
        val result = Chapter14.dijkstraMethod(graph)
        println()
        println()
        println()
        result.forEachIndexed { index, i ->
            println("distance[$index]: $i")
        }
    }

    @Test
    fun dijkstraMethodRetry() {
        val graph = arrayOf(
            arrayOf(Edge(1, 3), Edge(3, 100)),
            arrayOf(Edge(2, 50), Edge(3, 57), Edge(4, 4)),
            arrayOf(Edge(3, 10), Edge(4, 5), Edge(5, 100)),
            arrayOf(Edge(1, 5)),
            arrayOf(Edge(2, 57), Edge(3, 25), Edge(5, 8)),
            arrayOf()
        )
        val result = Chapter14.dijkstraMethod(graph)
        println()
        println()
        println()
        result.forEachIndexed { index, i ->
            println("distance[$index]: $i")
        }
    }

    @Test
    fun longestPath() {
        val graph =
            arrayOf(
                arrayOf(2, 4),
                arrayOf(5),
                arrayOf(3, 1),
                arrayOf(5),
                arrayOf(1, 6),
                arrayOf(),
                arrayOf(1)
            )
        val result = Chapter14.longestPath(graph)
        println()
        println()
        println()
        println(result) // 4
    }
}