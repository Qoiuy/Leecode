package P_665_非递减数列;

public class Solution {

    public boolean checkPossibility(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                // modify i&i+1 = i+1
                int tmp = nums[i];
                nums[i] = nums[i+1];
                //check
                boolean res =  check(nums);

                // modify i&i+1 = i
                nums[i+1] = tmp;
                nums[i] = tmp;
                // check
                res = res | check(nums);
                return res;

            }
        }
        return true;
    }

    private boolean check(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().checkPossibility(new int[]{2,3,3,2,4}));
        System.out.println(new Solution().checkPossibility(new int[]{4,2,3}));
    }
}
