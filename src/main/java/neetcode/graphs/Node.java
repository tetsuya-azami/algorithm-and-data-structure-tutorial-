package neetcode.graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }

    @Override
    public String toString() {
        Set<Node> visited = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();
        dfs(this, stringBuilder, visited);
        
        return stringBuilder.toString();
    }

    private void dfs(Node node, StringBuilder stringBuilder, Set<Node> visited) {
        if (visited.contains(node)) return;
        visited.add(node);
        stringBuilder.append(node.val).append(",");
        List<Node> neighbors = node.neighbors;
        for (Node neighbor : neighbors) {
            dfs(neighbor, stringBuilder, visited);
        }
    }
}
