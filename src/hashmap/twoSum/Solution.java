package hashmap.twoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] res = solution.twoSum(new int[]{3, 3, 2, 4}, 6);
        for (int i: res
             ) {
            System.out.printf(i + ", ");
        }
    }

    public int[] twoSum(int[] nums, int target) {

        //数字和value
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.get(target - nums[i]) != null){
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);

        }

        return new int[]{};

    }
}
