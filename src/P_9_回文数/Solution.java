package P_9_回文数;

public class Solution {


    public boolean isPalindrome(int x) {

        if (x == 0){
            return true;
        }

        if (x % 10 == 0){
            return false;
        }
        if (x < 0 ){
            return false;
        }
        return reverse(x) == x;

    }

    public int reverse(int x) {
        //处理符号
        int symbol = 1;
        if (x < 0) {
            symbol = -1;
        }

        // 处理倒序
        int result = 0;
        for (x = Math.abs(x); x > 0; x /= 10) {
            //溢出处理
            if (result > Integer.MAX_VALUE / 10) {
                return 0;
            }
            result = result * 10 + x % 10;

        }

        return result * symbol;
    }

    public boolean isPalindromeV1(int x) {

        String str = x + "";
        StringBuffer stringBuffer = new StringBuffer();

        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            stringBuffer.append(chars[chars.length - i - 1]);
        }
        return stringBuffer.toString().equals(str);
    }
}
