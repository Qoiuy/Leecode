package P_485_最大连续1的个数;

public class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {


        int max = 0,count = 0;
        for ( int i : nums){
            if (i == 1){
                count++;
                if (count >= max){
                    max = count;
                }
            }else {
                count = 0;
            }
        }
        return max;

    }


}
