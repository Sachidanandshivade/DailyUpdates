package Dsa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    public static void bfs(int start,
                           ArrayList<ArrayList<Integer>> graph,
                           boolean[] visited){
        Queue<Integer> queue = new LinkedList<>();
    queue.offer(start);
    visited[start] = true;

    while(!queue.isEmpty()) {
        int node = queue.poll();
        System.out.print(node + " ");
        for(int neighbour: graph.get(node)) {
            if(!visited[neighbour]) {
                visited[neighbour] = true;
                queue.offer(neighbour);
            }
        }
    }
    }


    static void dfs(int node, ArrayList<ArrayList<Integer>> graph, boolean[] visited) {

        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : graph.get(node)) {

            if (!visited[neighbor]) {
                dfs(neighbor, graph, visited);
            }
        }
    }

    public static void main(String[] args) {

        int n = 6;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        // Create adjacency list
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges (Undirected Graph)

        graph.get(1).add(2);
        graph.get(2).add(1);

        graph.get(1).add(3);
        graph.get(3).add(1);

        graph.get(2).add(4);
        graph.get(4).add(2);

        graph.get(2).add(5);
        graph.get(5).add(2);

        graph.get(3).add(6);
        graph.get(6).add(3);

        System.out.print("DFS : ");
        boolean[] visitedDFS = new boolean[n + 1];
        dfs(1, graph, visitedDFS);

        System.out.println();

        System.out.print("BFS : ");
        boolean[] visitedBFS = new boolean[n + 1];
        bfs(1, graph, visitedBFS);
    }

}
