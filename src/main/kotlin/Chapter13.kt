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
    }
}