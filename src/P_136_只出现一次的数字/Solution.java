package P_136_只出现一次的数字;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {
    public int singleNumber(int[] nums) {

        int count = 0;
        for (int i : nums){

            count ^= i;
        }
        return count;
    }

    public int singleNumber1(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, 2);
            } else {
                map.put(i, 1);
            }
        }

        AtomicInteger res = new AtomicInteger();
        map.forEach((a, b) -> {
            if (b == 1) {
                res.set(a);
            }
        });
        return res.get();
    }

    public static void main(String[] args) {
        System.out.println(3^3);
        System.out.println(0^3);
    }
}
