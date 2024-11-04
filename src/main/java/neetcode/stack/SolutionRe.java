package neetcode.stack;

import java.util.ArrayList;
import java.util.List;

public class SolutionRe {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        dfs(new StringBuilder(), result, n, 0, 0);

        return result;
    }

    private void dfs(StringBuilder stb, List<String> result, int n, int openCount, int closeCount) {
        if (openCount == n && closeCount == n) {
            if (isValidParenthesis(stb.toString(), n)) result.add(stb.toString());
            return;
        }
        if (openCount < n) {
            dfs(stb.append('('), result, n, openCount + 1, closeCount);
            stb.deleteCharAt(stb.length() - 1);
        }

        if (closeCount < n) {
            dfs(stb.append(')'), result, n, openCount, closeCount + 1);
            stb.deleteCharAt(stb.length() - 1);
        }
    }

    private boolean isValidParenthesis(String target, int n) {
        char[] charArray = target.toCharArray();
        char open = '(';
        char close = ')';
        int openCount = 0;
        int closeCount = 0;
        for (char c : charArray) {
            if (c == open) {
                openCount++;
            } else if (c == close) {
                closeCount++;
            } else return false;
            if (openCount < closeCount) return false;
            if (openCount > n || closeCount > n) return false;
        }

        return true;
    }
}
