package neetcode.stack;

import java.util.LinkedList;

class MinStackRe {
    private LinkedList<Integer> stack;
    private LinkedList<Integer> minStack;
    private int last;

    public MinStackRe() {
        stack = new LinkedList<>();
        minStack = new LinkedList<>();
        last = -1;
    }

    public void push(int val) {
        stack.add(val);
        minStack.add(last >= 0 ? Math.min(minStack.get(last), val) : val);
        last++;
    }

    public void pop() {
        stack.remove(last);
        minStack.remove(last);
        last--;
    }

    public int top() {
        return stack.get(last);
    }

    public int getMin() {
        return minStack.get(last);
    }
}