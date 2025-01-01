package neetcode.stack;

import java.util.ArrayList;
import java.util.List;

public class SolutionReRe {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        dfs(result, new StringBuilder(), n, 0, 0);

        return result;
    }

    private void dfs(List<String> result, StringBuilder stb, int n, int openCount, int closeCount) {
        if (openCount == n && closeCount == n) {
            result.add(stb.toString());
            return;
        }

        if (openCount == closeCount) {
            stb.append('(');
            dfs(result, stb, n, openCount + 1, closeCount);
            stb.deleteCharAt(stb.length() - 1);
        } else if (openCount > closeCount) {
            if (openCount < n) {
                stb.append('(');
                dfs(result, stb, n, openCount + 1, closeCount);
                stb.deleteCharAt(stb.length() - 1);
            }

            stb.append(')');
            dfs(result, stb, n, openCount, closeCount + 1);
            stb.deleteCharAt(stb.length() - 1);
        }
    }
}
