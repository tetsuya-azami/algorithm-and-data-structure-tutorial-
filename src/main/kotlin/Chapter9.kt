import java.util.Stack

class Chapter9 {
    companion object {
        fun reversePolishNotation(mathematicalFormula: String): Int {
            val elements = mathematicalFormula.split(" ")
            val stack = Stack<Int>()
            for (element in elements) {
                if (element.length == 1 && element[0] in '0'..'9') {
                    stack.push(element[0] - '0')
                } else {
                    val first = stack.pop()
                    val second = stack.pop()
                    when (element) {
                        "+" -> stack.push(second + first)
                        "-" -> stack.push(second - first)
                        "*" -> stack.push(second * first)
                        "/" -> stack.push(second / first)
                        else -> throw ArithmeticException("存在しない演算子です。$element")
                    }
                }
            }

            return stack.pop()
        }
    }
}