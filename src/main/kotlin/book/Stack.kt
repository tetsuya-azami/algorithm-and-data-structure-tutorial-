package book

class Stack<T> {
    companion object {
        private val MAX = 100
    }

    private var head: Int = 0
    private val elements: MutableList<T> = mutableListOf()

    fun isEmpty(): Boolean {
        return head == 0
    }

    fun isFull(): Boolean {
        return head == MAX
    }

    fun push(element: T) {
        if (isFull()) {
            throw RuntimeException("is Full")
        }
        elements.add(head, element)
        head++
    }

    fun pop(): T {
        if (isEmpty()) {
            throw RuntimeException("is Empty")
        }
        val result = elements[head - 1]
        head--

        return result
    }
}