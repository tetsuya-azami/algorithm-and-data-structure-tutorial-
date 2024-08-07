package book

class Chapter8 {
    companion object {
        fun getIndexPairOfEqualValue(a: Set<Int>, b: Set<Int>): Int {
            val map = HashMap<Int, MutableList<Int>>(a.size)
            a.forEachIndexed { index, e ->
                if (map[e] != null) {
                    map[e]!!.add(index)
                } else {
                    val indexes = mutableListOf(index)
                    map[e] = indexes
                }
            }

            val pairList = mutableListOf<Pair<Int, Int>>()

            b.forEachIndexed { index, e ->
                if (map[e] != null) {
                    val pairs = map[e]!!.map { Pair(it, index) }
                    pairList.addAll(pairs)
                }
            }

            return pairList.size
        }

        fun isSumCanBeK(a: List<Int>, b: List<Int>, k: Int): Boolean {
            val aSet = a.toSet()
            // 1つでも k-b=aとなればOK\
            return b.any { aSet.contains(k - it) }
        }

        fun isSumCanBeKRetry(a: List<Int>, b: List<Int>, k: Int): Boolean {
            val set = a.toSet()
            return b.any { set.contains(k - it) }
        }
    }
}