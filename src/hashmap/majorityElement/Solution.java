package hashmap.majorityElement;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for( int i = 0; i < nums.length; i++){

            Integer num = nums[i];
            if(map.get(num) == null){
                map.put(num, 1);
            }else {
                map.put(num, map.get(num) + 1);
            }

        }

        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if( entry.getValue() > (nums.length / 2)){
                return entry.getKey();
            }
        }
        return 0;
    }

}
