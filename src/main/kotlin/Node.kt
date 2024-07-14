data class Node(val name: String, var prev: Node? = null, var next: Node? = null) {}

fun printList(head: Node?) {
    var cur = head
    while (cur != null) {
        println("${cur.name} → ")
        cur = cur.next
    }
}

// pの直後にvを挿入
fun insert(p: Node?, v: Node) {
    if (p != null) {
        val originalPNext = p.next
        originalPNext?.prev = v
        v.next = originalPNext
        p.next = v
        v.prev = p
    }
}

fun erase(head: Node, v: Node): Node? {
    if (head == v) {
        v.next?.prev = null
        return head.next
    } else {
        v.prev?.next = v.next
        v.next?.prev = v.prev
        return head
    }
}