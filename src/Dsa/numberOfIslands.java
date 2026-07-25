package Dsa;

import java.util.*;

public class numberOfIslands {

    static int rows;
    static int cols;

    static void dfs(char[][] grid, boolean[][] visited, int i, int j) {

        if (i < 0 || i >= rows || j < 0 || j >= cols)
            return;

        if (grid[i][j] == '0' || visited[i][j])
            return;

        visited[i][j] = true;

        dfs(grid, visited, i - 1, j); // Up
        dfs(grid, visited, i + 1, j); // Down
        dfs(grid, visited, i, j - 1); // Left
        dfs(grid, visited, i, j + 1); // Right
    }

    static int numIslands(char[][] grid) {

        rows = grid.length;
        cols = grid[0].length;

        boolean[][] visited = new boolean[rows][cols];

        int count = 0;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                if (grid[i][j] == '1' && !visited[i][j]) {

                    dfs(grid, visited, i, j);

                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        System.out.println(numIslands(grid));
    }
}
