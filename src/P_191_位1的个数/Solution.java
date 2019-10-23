package P_191_位1的个数;

public class Solution {


    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {

        if (n == 0) {
            return 0;
        }

        return hammingWeight(n & (n - 1)) + 1;

    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(-3));
    }
}
