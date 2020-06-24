package P_342_4的幂;

public class Solution {

    public boolean isPowerOfFour(int num) {
        if (num == 1){
            return true;
        }
        int i = 1;
        while ((i *= 4) <= num && i > 0){
            if (i == num){
                return true;
            }
        }
        return false;

    }
}
