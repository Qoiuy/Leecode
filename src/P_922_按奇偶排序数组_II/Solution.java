package P_922_按奇偶排序数组_II;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int[] sortArrayByParityII(int[] A) {

        List<Integer> odd = new ArrayList<>(), even = new ArrayList<>();

        for (int i:A){
            if (i % 2 == 0 ){
                even.add(i);
            }else {
                odd.add(i);
            }
        }
        for (int i = 0; i < A.length; i++){
            if (i % 2 == 0){
                A[i] = even.get(i / 2);
            }else {
                A[i] = odd.get(i / 2 );
            }
        }

        return A;
    }

    public static void main(String[] args) {
//        new Solution().sortArrayByParityII(new int[]{4,2,5,7});
        new Solution().sortArrayByParityII(new int[]{3,1,4,2});
    }
}
