package P_268_缺失数字;

import java.util.Arrays;

public class Solution {

    public int missingNumber(int[] nums) {

        boolean[] b = new boolean[nums.length + 1];

        Arrays.fill(b, false);

        for (int i : nums){
            b[i] = true;
        }

        for (int i = 0; i < nums.length + 1; i++){
            if (!b[i]){
                return i;
            }
        }
        return 0;
    }




}
