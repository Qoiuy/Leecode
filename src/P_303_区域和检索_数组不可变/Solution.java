package P_303_区域和检索_数组不可变;

import java.util.Arrays;

public class Solution {


    public static void main(String[] args) {
        NumArray numArray = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        System.out.println(numArray.sumRange(0, 2));
        System.out.println(numArray.sumRange(2, 5));
        System.out.println(numArray.sumRange(0, 5));

    }


    static
    class NumArray {

        int[][] res = null;

        public NumArray(int[] nums) {

//            a[0]      a[0]+a[1] a[0]+a[1]+a[2] a[0]+a[1]+a[2]+a[3] a[0]+a[1]+a[2]+a[3]+a[4]
//            a[1]+a[0] a[1]      a[1]+a[2]      a[1]+a[2]+a[3]      a[1]+a[2]+a[3]+a[4]
//            ...
            res = new int[nums.length][nums.length];

            for (int i = 0; i < nums.length; i++) {
                Arrays.fill(res[i], 0);
            }

            //填充操作
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    //填充数组。做记录计算。
                    if (res[i][j] == 0 || res[j][i] == 0) {

                        int result = calculableSum(nums, i, j);
                        res[i][j] = result;
                        res[j][i] = result;
                    }
                }
            }

        }

        private int calculableSum(int[] nums, int a, int b) {

            int start = a >= b ? b : a,
                    end = a >= b ? a : b,
                    sum = 0;

            for (int i = start; i <= end; i++) {
                sum += nums[i];
            }
            return sum;
        }

        public int sumRange(int i, int j) {

            return res[i][j];
        }
    }

}
