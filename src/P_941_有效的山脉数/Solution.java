package P_941_有效的山脉数;

public class Solution {
    public boolean validMountainArray(int[] A) {

        if (A.length <= 2){
            return false;
        }
        int upper= 0 , lower = 0;

        for (int i = 1; i< A.length; i++){
            if (A[i-1] < A[i]){
                if (lower > 0){
                    return false;
                }
                upper++;
            }else if (A[i - 1] > A[i]){
                if (upper < 0){
                    return false;
                }
                lower++;
            }else {
                return false;
            }

        }
        if (upper == 0 || lower == 0){
            return false;
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(new Solution().validMountainArray(new int[]{14,82,89,84,79,70,70,68,67,66,63,60,58,54,44,43,32,28,26,25,22,15,13,12,10,8,7,5,4,3}));
    }
}
