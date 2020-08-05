package P_70_爬楼梯;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    Map<Integer, Integer> mapppp = new HashMap<>();

    public int climbStairs(int n) {

        if ( n== 1){
            return 1;
        }
        if ( n== 2){
            return 2;
        }
        if (mapppp.containsKey(n)){
            return mapppp.get(n);
        }
        int value = climbStairs(n - 1) + climbStairs(n -2);

        mapppp.put(n, value);


        return value;

    }

    public static void main(String[] args) {
        for ( int i = 0 ; i < 10;i ++){
            System.out.println("{" + i + ", " + new Solution().climbStairs(i) + "}");
        }
        Solution s = new Solution();
        System.out.println(s.climbStairs(30));
        System.out.println(s.mapppp.toString());
    }

}
