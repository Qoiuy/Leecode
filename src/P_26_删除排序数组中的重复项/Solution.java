package P_26_删除排序数组中的重复项;

import javax.crypto.spec.PSource;

public class Solution {

    public int removeDuplicates(int[] nums) {

        int ret = 0;

        for (int i = 1; i < nums.length; i++){
            if (nums[ret] != nums[i]){
                nums[++ret] =  nums[i];
            }
        }

        return ret + 1;

    }

    public static void main(String[] args) {
        int[] nums = new int []{1,1,2};
        System.out.println(new Solution().removeDuplicates(nums));
        for (int tmp : nums){
            System.out.println(tmp);
        }
    }

}
