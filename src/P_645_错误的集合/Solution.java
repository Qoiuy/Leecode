package P_645_错误的集合;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int[] findErrorNums(int[] nums) {

        Set<Integer> s = new HashSet<>();

        int len = nums.length;
        int total = (1 + len) * len / 2;
        int err = 0, sum = 0;
        for (int i = 0; i < len; i++) {
            if (!s.add(nums[i])) {
                err = nums[i];
            } else {
                sum += nums[i];
            }
        }

        return new int[]{err, total - sum};
    }

    public static void main(String[] args) {
        for (int i : new Solution().findErrorNums( new int[]{1,2,2,4})) {
            System.out.println(i);
        }


    }
}
