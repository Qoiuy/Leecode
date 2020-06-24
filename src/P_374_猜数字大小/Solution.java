package P_374_猜数字大小;

public class Solution {

    final static int mid = 6;

    public int guessNumber(int n) {
        int start = 0;
        int guess = guess(mid(start, n));
        while ( guess != 0 ){
            if (n - start <= 1){
                return guess(n) == 0 ? n : start;
            }
            if (guess > 0 ){
                start = mid(start, n);
                guess = guess(mid(start, n));
                continue;
            }
            n = mid(start, n);
            guess = guess(mid(start, n));
        }

        return mid(start, n);
    }

    private int mid(int start, int end) {
        return start + (end - start) / 2 ;
    }

    public int guess(int num) {
        System.out.println("num : " + num + "; mid : " + mid);
        if (num > mid){
            return 1;
        }
        if (num < mid){
            return  -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().guessNumber(10));
    }
}
