package P_1207_独一无二的出现次数;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution {

    public boolean uniqueOccurrences(int[] arr) {


        Map<Integer, Integer> map = new HashMap<>();

        for (int tmp : arr){
            Integer sum = map.get(tmp);
            if (sum == null ){
                map.put(tmp, 1);
            }else {
                map.put(tmp, sum+1);
            }
        }

        HashSet set = new HashSet();
        for (Map.Entry entry : map.entrySet()){
            if (!set.add(entry.getValue())){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().uniqueOccurrences(new int[]{1,2,2,1,1,3}));;
    }
}
