package P_69_x_的平方根;

public class Solution {

    public int mySqrt(int x) {

        int ret = 0;
        for (int i = 0 ;i * i <= x && i * i >= 0; i ++){
            ret = i;
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(new Solution() .mySqrt(2147395600));
    }
}
