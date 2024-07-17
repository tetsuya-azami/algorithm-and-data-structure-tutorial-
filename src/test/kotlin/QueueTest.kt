import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class QueueTest {
    @Test
    fun test() {
        val queue = Queue<Int>()
        assertTrue { queue.isEmpty() }

        queue.enqueue(1)
        queue.enqueue(2)
        queue.enqueue(3)
        assertEquals(1, queue.dequeue())
        assertEquals(2, queue.dequeue())
        assertEquals(3, queue.dequeue())
        assertTrue { queue.isEmpty() }
    }

    @Test
    fun isFullTest() {
        val queue = Queue<Int>()
        // MAX - 1個でFull
        (1..99).forEach { queue.enqueue(it) }
        assertTrue { queue.isFull() }
    }
}