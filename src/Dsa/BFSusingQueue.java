package Dsa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSusingQueue {
    static void BFS(int start, ArrayList<ArrayList<Integer>> graph, boolean[] visited){
       Queue<Integer> q = new LinkedList<>();
       visited[start] = true;
       q.offer(start);

       while(!q.isEmpty()){
           int node = q.poll();
           System.out.println(node + " ");
           for(int neighbor : graph.get(node)){
               visited[neighbor] = true;
               q.offer(neighbor);
           }
       }
    }
    public static void main(String[] args) {
        int vertices = 6;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(1).add(4);
        graph.get(2).add(5);
        boolean[] visited = new boolean[vertices];
        BFS(0, graph, visited);
    }
    }

