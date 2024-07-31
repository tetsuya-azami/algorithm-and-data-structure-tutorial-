class Chapter14 {
    companion object {

        fun bellmanFord(graph: Array<Array<Edge>>, n: Int, m: Int, s: Int): Array<Int> {
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
    }
}