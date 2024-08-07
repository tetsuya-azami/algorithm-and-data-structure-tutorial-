package book

import book.Node
import book.erase
import book.insert
import book.printList
import kotlin.test.Test

class NodeTest {
    @Test
    fun test() {
        // 作りたいノードの名前の一覧
        val names = listOf("yamamoto", "watanabe", "ito", "takahashi", "suzuki", "sato")
        var head: Node? = null
        var first: Node? = null
        for (name in names) {
            val node = Node(name)
            if (head == null) {
                head = node
                first = node
            } else {
                insert(head, node)
                head = node
            }
        }

        printList(first)

        val modifiedResult = erase(first!!, first.next!!)
        println("削除動作確認用")
        printList(modifiedResult)
    }
}