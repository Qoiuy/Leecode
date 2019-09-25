package P_762_二进制表示中质数个计算置位;

public class Solution {

    public int countPrimeSetBits(int L, int R) {

        int count = 0;
        for (int i = L; i <= R; i++){
            if (isPrimeNumber( bitNumber(i))){
                count++;
            }
        }
        return count;
    }

    public int bitNumber(int i){
        if ( i == 0){
            return 0;
        }
        if (i == 1){
            return 1;
        }
        return ((i & 1) == 1 ? 1 : 0) + bitNumber( i >> 1);
    }

    public boolean isPrimeNumber(int number){
        if (number == 1){
            return false;
        }
        for ( int i = 2; i < number - 1; i++){
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(new Solution().countPrimeSetBits(244, 269));
    }
}
