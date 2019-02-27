package recursive.PowXN;

public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.myPow(2, -3));
    }

    public double myPow(double x, int n) {
        if (n == 1) {
            return x;
        } else if (n == 0) {
            return 1;
        }else if(n == -1){
            return 1 / x;
        } else if (n > 0) {
            if (n % 2 == 1) {
                double tmp = myPow(x, n / 2 );
                return tmp * tmp * x;
            } else {
                double tmp = myPow(x, n / 2);
                return tmp * tmp ;
            }
        } else {
            if (-n % 2 == 1) {
                double tmp = myPow(x, n / 2 );
                return tmp * tmp * (1/x);
            } else {
                double tmp = myPow(x, n / 2 );
                return tmp * tmp ;
            }
        }

    }
}
