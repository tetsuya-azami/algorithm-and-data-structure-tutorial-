class Chapter9 {
    companion object {
        fun reversePolishNotation(mathematicalFormula: String): Int {
            val elements = mathematicalFormula.split(" ")
            val stack = ArrayDeque<Int>()
            for (element in elements) {
                if (element.length == 1 && element[0] in '0'..'9') {
                    stack.add(element[0] - '0')
                } else {
                    val first = stack.removeLast()
                    val second = stack.removeLast()
                    when (element) {
                        "+" -> stack.add(second + first)
                        "-" -> stack.add(second - first)
                        "*" -> stack.add(second * first)
                        "/" -> stack.add(second / first)
                        else -> throw ArithmeticException("存在しない演算子です。$element")
                    }
                }
            }

            return stack.removeLast()
        }
    }
}