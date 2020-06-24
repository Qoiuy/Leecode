package P_283_移动零;

public class Solution {
    public void moveZeroes(int[] nums) {

        int is0 = -1, un0;
        while (is0++ < nums.length - 1){
            if (nums[is0] == 0){
                un0 = is0 - 1;
                while (++un0 < nums.length){
                    if (nums[un0] != 0){
                        int tmp = nums[un0];
                        nums[un0] = nums[is0];
                        nums[is0] = tmp;
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        new Solution().moveZeroes(nums);
        for (int i : nums ){
            System.out.println(i);
        }

    }
}
