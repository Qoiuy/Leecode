package hashmap.threeSum;

import java.util.*;

public class Solution {

    public static void main(String[] args) {


        int[] tmp = new int[]{-1, 0, 1, 2, -1, -4};
        Solution solution = new Solution();
        List<List<Integer>> res = solution.threeSum(tmp);
        for (List<Integer> tmp1 : res){
            for( Integer tmp2 : tmp1){
                System.out.printf(tmp2 + ", ");
            }
            System.out.println();
        }
    }

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        //用来存储值和对应的位置
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();

        for( int i = 0; i < nums.length; i++){
            Integer value = nums[i];
            if(map.get(value) == null){
                HashSet<Integer> tmp = new HashSet<Integer>();
                tmp.add(i);
                map.put(value, tmp);
            } else {
                HashSet<Integer> tmp = map.get(value);
                tmp.add(i);
                map.put(value, tmp);
            }
        }

        //用来去重第一层遍历
        HashSet<Integer> setI = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            //针对第一次循环去重
            if(!setI.add(nums[i])){
                continue;
            }
            HashSet<Integer> setJ = new HashSet<>();
            for(int j = i + 1; j < nums.length; j++){
                //针对第二层循环去重
                if(!setJ.add(nums[i])){
                    continue;
                }
                HashSet<Integer> tmp = map.get(0 - nums[i] - nums[j]);
                if(tmp != null && !tmp.contains(i) && !tmp.contains(j)) {
                    System.out.print("i: " + i + " j: " + j + " k: " );
                    for( Integer ttmp : tmp){
                        System.out.printf( ttmp + ",");
                    }
                    System.out.println();
                    result.add(Arrays.asList(nums[i], nums[j], 0-nums[i]-nums[j]));
                }
            }

        }
        return result;
    }
}
