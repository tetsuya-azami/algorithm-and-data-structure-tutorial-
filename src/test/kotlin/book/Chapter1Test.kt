package book

import java.io.ByteArrayInputStream
import kotlin.test.Test
import kotlin.test.assertEquals

class Chapter1Test {
    @Test
    fun `chapter1-1`() {
        System.setIn(ByteArrayInputStream("28".toByteArray()))
        val result = Chapter1.numberOfTimesToFindAnswer()
        assertEquals(4, result)
    }
}