package P_832_翻转图像;

public class Solution {

    public int[][] flipAndInvertImage(int[][] A) {

        for (int i = 0; i < A.length; i++){
            int [] B = new int[A[i].length];
            for (int j = 0; j < A[i].length; j++){
                B[A[i].length - j - 1] = (A[i][j] == 0 ) ? 1 : 0;
            }
            A[i] = B;
        }
        return A;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().flipAndInvertImage(new int[][]{{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}}));
    }
}
