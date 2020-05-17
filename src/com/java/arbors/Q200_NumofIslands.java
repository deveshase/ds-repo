package com.java.arbors;

public class Q200_NumofIslands {

    public static void main(String[] args) {

        char[][] univ = {
                {'1','1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        char[][] univ1 =   {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        Q200_NumofIslands q = new Q200_NumofIslands();
        System.out.println("univ:" + q.numIslands(univ));
        System.out.println("univ1:" + q.numIslands(univ1));
    }

    public int numIslands(char[][] grid) {

        int numOfIslands = 0;

        if (grid == null || grid.length == 0) {
            return 0;
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1')
                    numOfIslands += dfs(grid, i, j);
            }
        }

        return numOfIslands;
    }

    public int dfs(char[][] grid, int i, int j) {

        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') {
            return 0;
        }

        grid[i][j] = '0';
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);

        return 1;
    }

}
