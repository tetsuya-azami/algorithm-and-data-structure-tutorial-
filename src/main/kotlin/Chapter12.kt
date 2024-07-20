class Chapter12 {
    companion object {
        fun insertionSort(array: IntArray): IntArray {
            for (i in 1..<array.size) {
                val insertTarget = array[i]

                var j = i
                while (j in 1..i) {
                    if (array[j - 1] > insertTarget) {
                        array[j] = array[j - 1]
                    } else {
                        break
                    }
                    j--
                }
                array[j] = insertTarget
            }
            
            return array
        }
    }
}