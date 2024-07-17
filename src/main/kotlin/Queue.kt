class Queue<T> {
    companion object {
        private val MAX = 100
    }

    private var head = 0
    private var tail = 0
    private val elements = mutableListOf<T>()

    fun isEmpty(): Boolean {
        return head == tail
    }

    fun isFull(): Boolean {
        return head == (tail + 1) % MAX
    }

    fun enqueue(x: T) {
        if (isFull()) {
            throw RuntimeException("is Full")
        }
        elements.add(tail, x)
        tail++
        if (tail == MAX) tail = 0
    }

    fun dequeue(): T {
        if (isEmpty()) {
            throw RuntimeException("is Empty")
        }
        val result = elements[head]
        head++
        if (head == MAX) head = 0

        return result
    }
}