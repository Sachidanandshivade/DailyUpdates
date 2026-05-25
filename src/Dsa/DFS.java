package Dsa;

import java.util.ArrayList;

public class DFS {
    public static void dfs(int node, ArrayList<ArrayList<Integer>> graph,boolean[] visited){
        visited[node] = true;
        System.out.println(node + " ");
        for(int neighbor: graph.get(node)){
            if(!visited[neighbor]){
                dfs(neighbor,graph,visited);
            }
        }
    }

    public static void main(String[] args){
        int vertices = 6;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<vertices;i++){
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(1);
        graph.get(0).add(2);

        graph.get(1).add(3);
        graph.get(1).add(4);

        graph.get(2).add(5);

        boolean[] visited = new boolean[vertices];

        dfs(0,graph,visited);
    }
}
