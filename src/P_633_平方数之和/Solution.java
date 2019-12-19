package P_633_平方数之和;

import sun.rmi.runtime.Log;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean judgeSquareSum(int c) {

        Set<Integer> set = new HashSet<>();
        int log = 0;
        for (int i = 0; (1<<16 >= i) &&( i * i )<= c ; i++){
            set.add(i*i);
            log = i;
        }
        System.out.println("log:" + log);
        for (Integer p : set){
            if (set.contains( c - p)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Long s = System.currentTimeMillis();
        System.out.println(new Solution().judgeSquareSum(2147482647));
        System.out.println(System.currentTimeMillis() - s);
    }

}
