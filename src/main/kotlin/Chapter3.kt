import kotlin.math.pow

class Chapter3 {
    companion object{
        /**
         * listの部分集合の内、合計がtargetSumになるものがあるかどうか判定する。
         * listの要素の組み合わせに対しての全探索
         * 計算量: O(list-size(2^list-size))
         * → 動的計画法の方が良いらしい
         */
        fun isPartialSumCanBeTargetSum(list: List<Int>, targetSum: Int): Boolean {
            val size = list.size
            val combinationPatternCount = 2.0.pow(size).toInt()
            // iが部分集合を表す
            for (partialSet in 0 ..< combinationPatternCount){
                // AND演算を使って部分集合の合計を計算
                var sum = 0
                for (j in 0..< size){
                    if (partialSet and (1 shl j) != 0){
                        sum += list[j]
                    }
                }
                if (sum == targetSum){
                    return true
                }
            }

            return false
        }
    }
}