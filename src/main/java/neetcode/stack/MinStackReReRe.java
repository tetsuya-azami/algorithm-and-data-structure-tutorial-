package neetcode.stack;

import java.util.ArrayList;
import java.util.List;

public class MinStackReReRe {
    private final List<Integer> stack;
    private final List<Integer> minHistory;

    public MinStackReReRe() {
        stack = new ArrayList<>();
        minHistory = new ArrayList<>();
    }

    public void push(int val) {
        stack.add(val);
        if (minHistory.isEmpty() || val <= minHistory.get(minHistory.size() - 1)) {
            minHistory.add(val);
        }
    }

    public void pop() {
        if (stack.get(stack.size() - 1).equals(minHistory.get(minHistory.size() - 1))) {
            minHistory.remove(minHistory.size() - 1);
        }
        stack.remove(stack.size() - 1);
    }

    public int top() {
        return stack.get(stack.size() - 1);
    }

    public int getMin() {
        return minHistory.get(minHistory.size() - 1);
    }
}
