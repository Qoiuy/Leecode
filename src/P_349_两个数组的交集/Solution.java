package P_349_两个数组的交集;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map = new HashMap<>();
        handle(nums1, map);
        handle(nums2, map);
        System.out.println(map.toString());
        map.entrySet().removeIf(p -> p.getValue() == 1);
        System.out.println(map.toString());
        int[] res = new int[map.size()];
        AtomicInteger count = new AtomicInteger(0);
        map.entrySet().forEach(p -> res[count.getAndIncrement()] = p.getKey());

        return res;
    }

    private void handle(int[] nums1, Map<Integer, Integer> map) {
        Set<Integer> set = new HashSet<>();
        for (int s : nums1) {
            set.add(s);
        }
        for (Integer s : set){
            System.out.println("s: " +s+" map.containsKey(s)" + map.containsKey(s));
            if (map.containsKey(s)){
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }

    }

    public static void main(String[] args) {
//        nums1 = [1,2,2,1], nums2 = [2,2]s
        new Solution().intersection(new int[]{1,2,2,1}, new int[]{2,2});
    }

}
