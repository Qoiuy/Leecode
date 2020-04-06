package P_66_加一;

import javax.crypto.spec.PSource;

public class Solution {

    public int[] plusOne(int[] digits) {

        // 判断是否添加一位
        boolean addOneBit = false;

        for (int i = digits.length - 1; i >= 0; i --){

            if (i == digits.length - 1){
                digits[i] = digits[i] + 1;
            }

            if (addOneBit){
                digits[i] = digits[i] + 1;
            }

            if (digits[i] == 10){
                digits[i] = 0;
                addOneBit = true;
            } else {
                addOneBit = false;
            }
        }

        if (addOneBit){
            int[] ret = new int[digits.length + 1];
            ret[0] = 1;
            System.arraycopy(digits, 0, ret, 1, digits.length);
            return ret;
        }
        return digits;

    }

    public static void main(String[] args) {

//        test1();
//        test2();
        test3();

    }

    private static void test1() {
        int[] res = new Solution().plusOne(new int[]{
                1, 2, 3
        });
        for (int s : res){
            System.out.println(s);
        }
    }

    private static void test2() {
        int[] res = new Solution().plusOne(new int[]{
                9
        });
        for (int s : res){
            System.out.println(s);
        }
    }
    private static void test3() {
        int[] res = new Solution().plusOne(new int[]{
                8,9,9,9
        });
        for (int s : res){
            System.out.println(s);
        }
    }
}
