package book

class Chapter14 {
    companion object {

        fun bellmanFord(graph: Array<Array<Edge>>, n: Int, s: Int): Array<Int> {
            var isExistNegativeCycle = false
            val distance = Array(n) { Int.MAX_VALUE }
            distance[s] = 0
            for (i in 0 until n) {
                var isUpdated = false
                for (j in 0 until n) {
                    if (distance[j] == Int.MAX_VALUE) continue
                    for (e in graph[j]) {
                        if (chmin(distance, j, e.to, e.weight)) isUpdated = true
                    }
                }
                if (!isUpdated) break
                if (i == n - 1) isExistNegativeCycle = true
            }

            if (isExistNegativeCycle) {
                throw IllegalArgumentException("graphが負閉路を持っているので最短経路を求められません。")
            } else {
                return distance
            }
        }

        private fun chmin(distance: Array<Int>, from: Int, to: Int, weight: Int): Boolean {
            if (distance[to] > distance[from] + weight) {
                distance[to] = distance[from] + weight
                return true
            }
            return false
        }

        fun bellmanFordRetry(graph: Array<Array<Edge>>, n: Int, s: Int): Array<Int> {
            val distance = Array(n) { Int.MAX_VALUE }
            distance[0] = 0
            for (i in 0 until n) {
                var isUpdated = false
                for (j in 0 until n) {
                    if (distance[j] == Int.MAX_VALUE) continue
                    val targetNode = graph[j]
                    for (edge in targetNode) {
                        if (chminRetry(distance, j, edge)) isUpdated = true
                    }
                }

                if (!isUpdated) break
                if (i == n - 1) throw IllegalArgumentException("graphが負閉路を持っているので最短経路を求められません。")
            }

            return distance
        }

        private fun chminRetry(distance: Array<Int>, from: Int, edge: Edge): Boolean {
            if (distance[edge.to] > distance[from] + edge.weight) {
                distance[edge.to] = distance[from] + edge.weight
                return true
            }
            return false
        }

        fun dijkstraMethod(graph: Array<Array<Edge>>): Array<Int> {
            val n = graph.size
            val used = BooleanArray(n) { false }
            val distance = Array(n) { Int.MAX_VALUE }
            distance[0] = 0
            for (i in 0 until n) {
                var minV = -1
                var minDistance = Int.MAX_VALUE
                for (j in 0 until n) {
                    if (!used[j] && distance[j] < minDistance) {
                        minV = j
                        minDistance = distance[j]
                    }
                }

                if (minV == -1) break

                for (edge in graph[minV]) {
                    chmin(distance, minV, edge.to, edge.weight)
                }

                used[minV] = true
            }

            return distance
        }

        fun dijkstraMethodRetry(graph: Array<Array<Edge>>): Array<Int> {
            val n = graph.size
            val distance = Array(n) { Int.MAX_VALUE }
            val used = BooleanArray(n) { false }
            distance[0] = 0
            while (used.contains(false)) {
                var minV = -1
                var minDistance = Int.MAX_VALUE
                for (i in 0 until n) {
                    if (!used[i] && distance[i] < minDistance) {
                        minV = i
                        minDistance = distance[i]
                    }
                }

                for (edge in graph[minV]) {
                    distance[edge.to] = minDistance + edge.weight
                }

                used[minV] = true
            }

            return distance
        }

        fun longestPath(graph: Array<Array<Int>>): Int {
            val n = graph.size
            val dp = Array(n) { -1 }
            for (i in 0 until n) {
                rec(graph, dp, i)
            }

            return dp[0]
        }

        private fun rec(graph: Array<Array<Int>>, dp: Array<Int>, i: Int): Int {
            if (dp[i] != -1) return dp[i]
            var res = 0
            for (node in graph[i]) {
                res = maxOf(res, rec(graph, dp, node) + 1)
            }

            dp[i] = res
            return res
        }

        fun longestPathRetry(graph: Array<Array<Int>>): Int {
            val n = graph.size
            val dp = Array(n) { -1 }
            for (i in 0 until n) {
                recRetry(graph, dp, i)
            }

            return dp[0]
        }

        private fun recRetry(graph: Array<Array<Int>>, dp: Array<Int>, i: Int): Int {
            if (dp[i] != -1) return dp[i]
            var res = 0
            for (to in graph[i]) {
                res = maxOf(res, rec(graph, dp, to) + 1)
            }

            dp[i] = res
            return res
        }
    }
}