package P_326_3的幂;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isPowerOfThree(int n) {
        if (n == 1){
            return true;
        }
        int i = 1;
        while ((i *= 3) <= n && i > 0){
            if (i == n){
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(new Solution().isPowerOfThree(81));
        System.out.println(new Solution().isPowerOfThree(27));
        System.out.println(new Solution().isPowerOfThree(243));
        System.out.println(new Solution().isPowerOfThree(2147483647));
    }
}
