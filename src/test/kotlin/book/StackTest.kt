package book

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class StackTest {
    @Test
    fun test() {
        val stack = Stack<Int>()
        // 最初isEmptyであること
        assertTrue { stack.isEmpty() }

        stack.push(1)
        stack.push(2)
        stack.push(3)
        assertEquals(3, stack.pop())
        assertEquals(2, stack.pop())
        assertEquals(1, stack.pop())
        assertTrue { stack.isEmpty() }
    }

    @Test
    fun isFullTest() {
        val stack = Stack<Int>()
        (1..100).forEach { stack.push(it) }
        assertTrue { stack.isFull() }
    }
}