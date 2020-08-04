package P_896_单调数列;

public class Solution {
    public boolean isMonotonic(int[] A) {
        if (A.length <= 1){
            return true;
        }
        int upper =0, lower = 0;

        for (int i = 1 ; i < A.length; i++ ){
            if (A[i] > A[i-1]){
                upper++;
            }else if (A[i] < A[i-1]) {
                lower++;
            }
        }
        if (upper > 0 && lower > 0){
            return false;
        }
        return true;


    }
}
