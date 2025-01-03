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

    public int carFleet(int target, int[] position, int[] speed) {
        List<Pair<Integer, Integer>> positionSpeedPairs = new ArrayList<>();
        for (int i = 0; i < position.length; i++) {
            positionSpeedPairs.add(new Pair<>(position[i], speed[i]));
        }
        positionSpeedPairs.sort((p1, p2) -> p2.position - p1.position);

        int result = 0;
        double nextFleetTime = 0;
        for (Pair<Integer, Integer> pair : positionSpeedPairs) {
            double time = ((double) target - pair.position) / pair.speed;
            if (time > nextFleetTime) result++;
            nextFleetTime = Math.max(time, nextFleetTime);
        }

        return result;
    }

    private record Pair<K, V>(K position, V speed) {

    }

    public List<String> generateParenthesisRe(int n) {
        List<String> result = new ArrayList<>();
        dfs2(result, new StringBuilder(), 0, 0, n);

        return result;
    }

    private void dfs2(List<String> result, StringBuilder stb, int openCount, int closeCount, int limit) {
        if (openCount == limit && closeCount == limit) {
            result.add(stb.toString());
            return;
        }
        if (openCount < limit) {
            stb.append('(');
            dfs2(result, stb, openCount + 1, closeCount, limit);
            stb.deleteCharAt(stb.length() - 1);
        }
        if (openCount > closeCount && closeCount < limit) {
            stb.append(')');
            dfs2(result, stb, openCount, closeCount + 1, limit);
            stb.deleteCharAt(stb.length() - 1);
        }
    }
}
