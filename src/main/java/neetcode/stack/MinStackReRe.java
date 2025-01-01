package neetcode.stack;

import java.util.ArrayList;
import java.util.List;

public class MinStackReRe {

    private final List<Integer> stack;
    private final List<Integer> minStack; // 最小値=minIndexes(size - 1)

    public MinStackReRe() {
        stack = new ArrayList<>();
        minStack = new ArrayList<>();
    }

    public void push(int val) {
        stack.add(val);
        if (minStack.isEmpty() || val <= minStack.get(minStack.size() - 1)) {
            minStack.add(val);
        }
    }

    public void pop() {
        int last = stack.size() - 1;
        if (minStack.get(minStack.size() - 1).equals(stack.get(last))) {
            minStack.remove(minStack.size() - 1);
        }
        stack.remove(last);
    }

    public int top() {
        return stack.get(stack.size() - 1);
    }

    public int getMin() {
        return minStack.get(minStack.size() - 1);
    }
}
