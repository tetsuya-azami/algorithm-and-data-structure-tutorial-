import kotlin.test.Test

class Chapter13Test {
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
        val result = Chapter13.countConnectedComponents(graph)
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
        val result = Chapter13.countConnectedComponentsRetry(graph)
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
        val result = Chapter13.countConnectedComponentsBfs(graph)
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun countConnectedComponentsBfsRetry() {
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
        val result = Chapter13.countConnectedComponentsBfsRetry(graph)
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
        val result = Chapter13.isSTPathExist(graph, 3, 5)
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
        val result = Chapter13.isSTPathExistBfs(graph, 0, 1)
        println()
        println()
        println()
        println(result)
    }

    @Test
    fun isBipartiteGraph() {
        val graph =
            arrayOf(
                arrayOf(4, 6),
                arrayOf(6, 7),
                arrayOf(4, 7),
                arrayOf(5, 6),
                arrayOf(0, 2),
                arrayOf(3, 7),
                arrayOf(0, 1, 3),
                arrayOf(2, 1, 5)
            )
        val result = Chapter13.isBipartiteGraph(graph)
        println()
        println()
        println()
        println(result)
    }
}