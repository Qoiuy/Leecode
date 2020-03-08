package _883_三维形体投影面积;

import sun.plugin2.ipc.windows.WindowsIPCFactory;

import java.util.Arrays;

public class Solution {

    public int projectionArea(int[][] grid) {

        int x = 0, y = 0, z = 0;

        if (grid.length == 0) {
            return 0;
        }

        int[] countX = new int[grid[0].length];
        Arrays.fill(countX, 0);

        for (int[] ints : grid) {
            int countY = 0;
            for (int j = 0; j < ints.length; j++) {
                if (ints[j] != 0) {
                    z++;
                }
                countY = Math.max(countY, ints[j]);
                countX[j] = Math.max(countX[j], ints[j]);
            }
            y = y + countY;
        }

        for (int value : countX) {
            x = x + value;
        }

        return x + y + z;
    }

    public static void main(String[] args) {
//        int[][] arr = {{1, 2}, {3, 4}};
        int[][] arr = {{1,1,1},{1,0,1},{1,1,1}};
        System.out.println(new Solution().projectionArea(arr));
    }
}
