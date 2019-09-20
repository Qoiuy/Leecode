package P_977_有序数组的平方;

public class Solution {

    public int[] sortedSquares(int[] A) {

        if (A.length == 1){
            A[0] = A[0] * A[0];
            return A;
        }

        int middle = getMiddle(A), count = 0;

        int[] res = new int[A.length];

        for (int i = middle - 1, j = middle; i >= 0 || j < A.length; count++ ) {
            if (i < 0 ){
                res[count] = A[j] * A[j++];
            }else if (j >= A.length){
                res[count] = A[i] * A[i--];
            }else if ((A[i] * (-1)) > A[j] ){
                res[count] = A[j] * A[j++];
            }else {
                res[count] = A[i] * A[i--];
            }
        }

        return res;
    }

    private int getMiddle(int[] A) {
        int middle = -1; // 第一个0或正数
        for (int i = 0; i < A.length; i++){
            if (i== 0 ){
                if (A[0] >= 0){
                    middle = 0;
                    break;
                }else {
                    continue;
                }
            }
            if (A[i-1] < 0 && A[i] >=0){
                middle = i;
                break;
            }
        }
        return middle;
    }

    public static void main(String[] args) {
//        int[] s = new Solution().sortedSquares(new int[]{-4,-1,0,3,10});
        int[] s = new Solution().sortedSquares(new int[]{-1});
        for (int i = 0; i < s.length; i++){
            System.out.println(s[i]);
        }

    }
}
