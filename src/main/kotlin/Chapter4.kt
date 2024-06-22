class Chapter4 {
    companion object {
        fun partialSumProblemWithRecursion(list: List<Int>, w: Int): Boolean {
            // ベースケース
            if (w == 0) return true
            if (w < 0) return false
            if (list.isEmpty()) {
                return false
            }

            val listLastRemoved = list.subList(fromIndex = 0, toIndex = list.size - 1)
            // 最後の要素を使う場合
            val subtractedListResult = partialSumProblemWithRecursion(listLastRemoved, w - list.last())

            // 最後の要素を使わない場合
            val notSubtractedListResult = partialSumProblemWithRecursion(listLastRemoved, w)

            return subtractedListResult || notSubtractedListResult
        }
    }
}