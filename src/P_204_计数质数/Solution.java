package P_204_计数质数;

import java.util.Arrays;

public class Solution {

    public int countPrimes(int n) {

        boolean[] arr = new boolean[n];

        Arrays.fill(arr, true);


        for (int i = 2; i < n ; i++){
            if (arr[i]){
                for (int j = i; j < n; j = j + i){
                    arr[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n ;i++){
            if (!arr[i]){
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().countPrimes(10));
    }
}
