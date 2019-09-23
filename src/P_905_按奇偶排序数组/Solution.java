package P_905_按奇偶排序数组;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int[] sortArrayByParity(int[] A) {

        int count = 0;

        for (int i = 0; i < A.length; i++){
            if (A[i] % 2 != 1){
                int tmp = A[i - count];
                A[i - A.length] = A[i];
                A[i] = tmp;
            }else {
                count ++;
            }
        }
        return A;
    }

}
