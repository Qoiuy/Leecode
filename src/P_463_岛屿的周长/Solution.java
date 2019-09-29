package P_463_岛屿的周长;

public class Solution {

    public int islandPerimeter(int[][] grid) {

        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    count += 4;
                    if (i - 1 >= 0 && grid[i - 1][j] == 1) {
                        count--;
                    }
                    if (i + 1 < grid.length && grid[i + 1][j] == 1) {
                        count--;
                    }
                    if (j - 1 >= 0 && grid[i][j - 1] == 1) {
                        count--;
                    }
                    if (j + 1 < grid[i].length && grid[i][j + 1] == 1) {
                        count--;
                    }
                }
            }
        }

        return count;
    }


    public static void main(String[] args) {
        System.out.println(        new Solution().islandPerimeter(new int[][]{{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}}));
    }

}
