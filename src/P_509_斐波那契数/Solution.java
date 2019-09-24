package P_509_斐波那契数;

public class Solution {
    public int fib(int N) {

        if (N == 0 || N == 1){
            return N == 0 ? 0 : 1;
        }

        return fib(N - 1 ) + fib(N -2);
    }
}
