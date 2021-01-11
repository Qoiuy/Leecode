package _202_快乐数;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public boolean isHappy(int n) {
        if (n == 1) {
            return true;
        }
        if (n == 0 || n == 2 || n == 3 || n == 4 || n == 5|| n == 6) {
            return false;
        }

        //拆数字
        List<Integer> numberList = new ArrayList<>();
        do {
            int suffix = n % 10;
            numberList.add(suffix);
            n = n / 10;
//            System.out.println("while (n < 10) = > suffix " + suffix + " n :" + n);
        } while (n > 0);

//        System.out.println("len list : " + numberList.size());

        int res = 0;
        for (Integer number : numberList) {
            res = res + number * number;
//            System.out.println("for (int number : list) = >number : " + number + " res :" + res);
        }

        return isHappy(res);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isHappy(1));
        System.out.println(new Solution().isHappy(2));
        System.out.println(new Solution().isHappy(3));
        System.out.println(new Solution().isHappy(5));
        System.out.println(new Solution().isHappy(6));
        System.out.println(new Solution().isHappy(7));
        System.out.println(new Solution().isHappy(8));
        System.out.println(new Solution().isHappy(9));
        System.out.println(new Solution().isHappy(10));
        System.out.println(new Solution().isHappy(11));
        System.out.println(new Solution().isHappy(12));
        System.out.println(new Solution().isHappy(13));
        System.out.println(new Solution().isHappy(14));
        System.out.println(new Solution().isHappy(15));
        System.out.println(new Solution().isHappy(16));
        System.out.println(new Solution().isHappy(17));
        System.out.println(new Solution().isHappy(18));
        System.out.println(new Solution().isHappy(19));
        System.out.println(new Solution().isHappy(20));
    }
}
