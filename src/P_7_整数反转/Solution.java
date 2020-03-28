package P_7_整数反转;

public class Solution {

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

    public static void main(String[] args) {
        System.out.println(new Solution().reverse(-2147483412));
        System.out.println(new Solution().reverse(1534236469));
//        System.out.println(new Solution().reverse(-123));
    }

}
