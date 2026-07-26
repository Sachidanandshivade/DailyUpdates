package Dsa;

import java.util.*;
import java.util.Queue;

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

        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{i, j});
        visited[i][j] = true;

        while (!queue.isEmpty()) {

            int[] cell = queue.poll();

            int row = cell[0];
            int col = cell[1];

            for (int k = 0; k < 4; k++) {

                int newRow = row + dr[k];
                int newCol = col + dc[k];

                if (newRow >= 0 &&
                        newRow < rows &&
                        newCol >= 0 &&
                        newCol < cols &&
                        grid[newRow][newCol] == '1' &&
                        !visited[newRow][newCol]) {

                    visited[newRow][newCol] = true;

                    queue.offer(new int[]{newRow, newCol});
                }
            }
        }
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
