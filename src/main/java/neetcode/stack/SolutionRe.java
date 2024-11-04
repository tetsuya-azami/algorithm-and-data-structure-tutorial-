package neetcode.stack;

import java.util.ArrayList;
import java.util.Comparator;
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

    public int carFleet(int target, int[] position, int[] speed) {
        List<Pair<Double, Double>> pairs = new ArrayList<>();
        for (int i = 0; i < position.length; i++) {
            pairs.add(new Pair<>((double) position[i], (double) speed[i]));
        }

        List<Pair<Double, Double>> carLane = pairs.stream().sorted(Comparator.comparingDouble(e -> e.position)).toList();
        double[] timeToTargets = new double[position.length];
        int result = position.length;
        for (int i = carLane.size() - 1; i >= 0; i--) {
            timeToTargets[i] = (target - carLane.get(i).position) / carLane.get(i).speed;
            if (i < carLane.size() - 1 && timeToTargets[i] <= timeToTargets[i + 1]) {
                result--;
                carLane.get(i).speed = carLane.get(i + 1).speed;
                timeToTargets[i] = timeToTargets[i + 1];
            }
        }

        return result;
    }

    private class Pair<K, V> {
        private K position;
        private V speed;

        public Pair(K position, V speed) {
            this.position = position;
            this.speed = speed;
        }

        public K position() {
            return position;
        }

        public void position(K position) {
            this.position = position;
        }

        public V speed() {
            return speed;
        }

        public void speed(V speed) {
            this.speed = speed;
        }
    }
}
