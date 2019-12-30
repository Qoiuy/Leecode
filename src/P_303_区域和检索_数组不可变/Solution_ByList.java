package P_303_区域和检索_数组不可变;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_ByList {


    public static void main(String[] args) {
        NumArray numArray = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        System.out.println(numArray.sumRange(0, 2));
        System.out.println(numArray.sumRange(2, 5));
        System.out.println(numArray.sumRange(0, 5));

    }


    static
    class NumArray {

        List<List<Integer>> res = new ArrayList<>();
        Integer length = 0;
        int[] nums = null;


        public NumArray(int[] nums) {

            length = nums.length;
            this.nums = nums;

            //填充操作
            for (int i = 0; i < nums.length; i++) {
                List<Integer> tmp = new ArrayList<>();

                for (int j = i; j < nums.length; j++){
                    tmp.add(calculableSum( i, j));
                }

                res.add(tmp);
            }

        }

        private int calculableSum( int a, int b) {

            int start = a >= b ? b : a,
                    end = a >= b ? a : b,
                    sum = 0;


//            a[0]      a[0]+a[1] a[0]+a[1]+a[2] a[0]+a[1]+a[2]+a[3] a[0]+a[1]+a[2]+a[3]+a[4]
//            a[1]+a[0] a[1]      a[1]+a[2]      a[1]+a[2]+a[3]      a[1]+a[2]+a[3]+a[4]
//            ...
//            res = new int[nums.length][nums.length];

            if (res != null && res.size() > start && res.get(start) != null && res.get(start).get(end-start-1) != null){
                return res.get(start).get(end-start-1) + nums[end];
            }

            for (int i = start; i <= end; i++) {
                sum += nums[i];
            }
            return sum;
        }

        public int sumRange(int i, int j) {

            if (i < j){
                return res.get(i).get(j - i);
            }
            return res.get(j).get(i - j);
        }
    }

}
