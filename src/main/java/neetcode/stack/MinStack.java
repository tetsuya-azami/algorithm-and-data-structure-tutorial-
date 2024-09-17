package neetcode.stack;

import java.util.Stack;

class MinStack {
    private final Stack<Integer> elements;
    private final Stack<Integer> minStack;

    public MinStack() {
        this.elements = new Stack<>();
        this.minStack = new Stack<>();
    }

    public void push(int val) {
        this.elements.add(val);
        this.minStack.add(Math.min(!minStack.isEmpty() ? minStack.lastElement() : val, val));
    }

    public void pop() {
        this.elements.pop();
        this.minStack.pop();
    }

    public int top() {
        return this.elements.peek();
    }

    public int getMin() {
        return this.minStack.peek();
    }
}