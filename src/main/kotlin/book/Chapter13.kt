package book

class Chapter13 {
    companion object {
        fun countConnectedComponents(graph: Array<Array<Int>>): Int {

            val seen = MutableList(graph.size) { false }
            var result = 0
            for (i in graph.indices) {
                if (seen[i]) continue
                dfs(graph, i, seen)
                result++
            }

            return result
        }

        private fun dfs(graph: Array<Array<Int>>, v: Int, seen: MutableList<Boolean>) {
            seen[v] = true
            for (connected in graph[v]) {
                if (seen[connected]) continue
                dfs(graph, connected, seen)
            }
        }

        fun countConnectedComponentsRetry(graph: Array<Array<Int>>): Int {
            val seen = BooleanArray(graph.size) { false }
            var result = 0
            for (i in graph.indices) {
                if (seen[i]) continue
                dfsRetry(graph, i, seen)
                result++
            }

            return result
        }

        private fun dfsRetry(graph: Array<Array<Int>>, v: Int, seen: BooleanArray) {
            seen[v] = true
            val connected = graph[v]
            for (e in connected) {
                if (seen[e]) continue
                dfsRetry(graph, e, seen)
            }
        }

        fun countConnectedComponentsBfs(graph: Array<Array<Int>>): Int {
            val seen = BooleanArray(graph.size) { false }
            var result = 0
            for (i in graph.indices) {
                if (seen[i]) continue
                bfs(graph, i, seen)
                result++
            }

            return result
        }

        fun bfs(graph: Array<Array<Int>>, v: Int, seen: BooleanArray) {
            seen[v] = true
            val queue = ArrayDeque<Int>()
            queue.addLast(v)
            while (!queue.isEmpty()) {
                val first = queue.first()
                queue.removeFirst()
                for (e in graph[first]) {
                    if (seen[e]) continue
                    seen[e] = true
                    queue.addLast(e)
                }
            }
        }

        fun countConnectedComponentsBfsRetry(graph: Array<Array<Int>>): Int {
            val seen = BooleanArray(graph.size) { false }

            var result = 0

            for (i in graph.indices) {
                if (seen[i]) continue
                bfsRetry(graph, i, seen)
                result++
            }

            return result
        }

        fun bfsRetry(graph: Array<Array<Int>>, v: Int, seen: BooleanArray) {
            val queue = ArrayDeque<Int>()
            queue.addLast(v)
            while (!queue.isEmpty()) {
                val first = queue.first()
                queue.removeFirst()
                seen[first] = true

                for (e in graph[first]) {
                    if (seen[e]) continue
                    queue.addLast(e)
                }
            }
        }

        fun isSTPathExist(graph: Array<Array<Int>>, s: Int, t: Int): Boolean {
            val seen = BooleanArray(graph.size) { false }

            dfs_isSTPathExist(graph, s, seen)

            return seen[t]
        }

        private fun dfs_isSTPathExist(graph: Array<Array<Int>>, v: Int, seen: BooleanArray) {
            seen[v] = true
            for (e in graph[v]) {
                if (seen[e]) continue
                dfs_isSTPathExist(graph, e, seen)
            }
        }

        fun isSTPathExistBfs(graph: Array<Array<Int>>, s: Int, t: Int): Boolean {
            val seen = BooleanArray(graph.size) { false }
            val queue = ArrayDeque<Int>()
            queue.addLast(s)
            while (!queue.isEmpty()) {
                val first = queue.first()
                queue.removeFirst()
                seen[first] = true

                for (e in graph[first]) {
                    if (seen[e]) continue
                    queue.addLast(e)
                }
            }

            return seen[t]
        }

        fun isBipartiteGraph(graph: Array<Array<Int>>): Boolean {
            val colors = IntArray(graph.size) { -1 } // 0:白, 1:黒
            var bipartite = true

            for (i in graph.indices) {
                if (colors[i] != -1) continue
                if (!dfs_isBipartiteGraph(graph, 0, colors, 0)) bipartite = false
            }

            return bipartite
        }

        fun dfs_isBipartiteGraph(
            graph: Array<Array<Int>>,
            v: Int,
            colors: IntArray,
            color: Int
        ): Boolean {
            colors[v] = color
            for (nextV in graph[v]) {
                if (colors[nextV] != -1) {
                    if (colors[nextV] == color) return false // 隣り合うノードの色が同じだったらfalse
                    continue
                }

                if (!dfs_isBipartiteGraph(graph, nextV, colors, 1 - color)) return false//まだ色を塗られていない場合
            }

            return true
        }

        fun solveMaze(maze: Array<Array<String>>, h: Int, w: Int): Int {
            var sx = -1
            var sy = -1
            var gx = -1
            var gy = -1
            for (i in 0 until h) {
                for (j in 0 until w) {
                    if (maze[i][j] == "S") {
                        sx = j
                        sy = i
                    }
                    if (maze[i][j] == "G") {
                        gx = j
                        gy = i
                    }
                }
            }

            val directionX = arrayOf(1, 0, -1, 0)
            val directionY = arrayOf(0, 1, 0, -1)

            val queue = ArrayDeque<Pair<Int, Int>>()
            queue.addLast((sx to sy))
            maze[sy][sx] = "0"
            // queueの中身が無くなるまでループ
            while (!queue.isEmpty()) {
                val (x, y) = queue.first()
                queue.removeFirst()

                for (i in directionX.indices) {
                    val dx = directionX[i]
                    val dy = directionY[i]
                    val nx = x + dx
                    val ny = y + dy

                    if (nx < 0 || w <= nx || ny < 0 || h <= ny) continue
                    if (maze[ny][nx] == "#") continue
                    if (maze[ny][nx] == "-1" || maze[ny][nx] == "G") {
                        queue.addLast((nx to ny))
                        maze[ny][nx] = (maze[y][x].toInt() + 1).toString()
                    }
                }
            }

            maze.forEach { row ->
                row.forEach { print("$it, ") }
                println()
            }

            return maze[gy][gx].toInt()
        }

        fun solveMazeRetry(maze: Array<Array<String>>, h: Int, w: Int): Int {
            var sx = -1
            var sy = -1
            var gx = -1
            var gy = -1

            for (i in 0 until h) {
                for (j in 0 until w) {
                    if (maze[i][j] == "S") {
                        sx = j
                        sy = i
                    }
                    if (maze[i][j] == "G") {
                        gx = j
                        gy = i
                    }
                }
            }

            maze[sy][sx] = "0"

            val queue = ArrayDeque<Pair<Int, Int>>()
            queue.addLast((sx to sy))

            val directionX = arrayOf(0, 0, -1, 1) //上下左右
            val directionY = arrayOf(-1, 1, 0, 0)
            // queueが空でない限り回す
            while (!queue.isEmpty()) {
                val currentPair = queue.first()
                queue.removeFirst()

                for (i in directionX.indices) {
                    //   firstの上下左右が迷路内かつ-1でなければqueueに入れる
                    val targetX = currentPair.first + directionX[i]
                    val targetY = currentPair.second + directionY[i]
                    if (targetX < 0 || h <= targetX || targetY < 0 || w <= targetY) continue
                    if (maze[targetY][targetX] == "#") continue
                    if (maze[targetY][targetX] == "-1" || maze[targetY][targetX] == "G") {
                        queue.addLast((targetX to targetY))
                        maze[targetY][targetX] = (maze[currentPair.second][currentPair.first].toInt() + 1).toString()
                    }
                }
            }

            return maze[gy][gx].toInt()
        }
    }
}