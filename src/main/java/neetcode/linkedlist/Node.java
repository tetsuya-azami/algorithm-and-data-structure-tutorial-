package neetcode.linkedlist;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

    public void print() {
        System.out.println();
        System.out.println();
        System.out.println();
        Node cur = this;
        while (cur != null) {
            System.out.println(cur);
            cur = cur.next;
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return String.format("val: %d, next: %d, random: %d", val, next != null ? next.val : null, random != null ? random.val : null);
    }
}
