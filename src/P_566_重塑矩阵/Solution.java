package P_566_重塑矩阵;

public class Solution {

    public int[][] matrixReshape(int[][] nums, int r, int c) {



        int width = nums.length, height = nums[0].length, rCount = 0, cCount = 0;

        if (r * c != width * height) {
            return nums;
        }
        int[][] res = new int[r][c];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (cCount > c - 1) {
                    rCount++;
                    cCount = 0;
                }
                res[rCount][cCount++] = nums[i][j];
            }
        }

        return res;
    }


}
