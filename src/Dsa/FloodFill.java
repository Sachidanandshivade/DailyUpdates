package Dsa;

import java.util.Arrays;

public class FloodFill {

    static int rows, cols;
    static int originalColor;
    static int newColor;

    // Direction arrays: Up, Down, Left, Right
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    static void dfs(int[][] image, int row, int col) {

        // Base case
        if (row < 0 || row >= rows || col < 0 || col >= cols)
            return;

        if (image[row][col] != originalColor)
            return;

        // Change color
        image[row][col] = newColor;

        // Visit all 4 directions
        for (int k = 0; k < 4; k++) {
            int newRow = row + dr[k];
            int newCol = col + dc[k];

            dfs(image, newRow, newCol);
        }
    }

    static int[][] floodFill(int[][] image, int sr, int sc, int color) {

        rows = image.length;
        cols = image[0].length;

        originalColor = image[sr][sc];
        newColor = color;

        // Edge case
        if (originalColor == newColor)
            return image;

        dfs(image, sr, sc);

        return image;
    }

    public static void main(String[] args) {

        int[][] image = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };

        int sr = 1;
        int sc = 1;
        int color = 2;

        int[][] ans = floodFill(image, sr, sc, color);

        for (int[] row : ans) {
            System.out.println(Arrays.toString(row));
        }
    }
}