package P_766_托普利茨矩阵;

public class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {

//        for (int i= 0; i< matrix.length;i++){
//            for (int j= 0; j <matrix[i].length; j++){
//                System.out.print(matrix[i][j] + ",");
//            }
//            System.out.println("");
//        }
        for (int j = 0; j < matrix[0].length; j++) {
            if (!check(j, 0, matrix)) {
                return false;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            if (!check(0, i, matrix)) {
                return false;
            }
        }

        return true;
    }

    private boolean check(int x, int y, int[][] matrix) {

        System.out.println("x: " + x + " y:" + y);

        if (y == 0) {
            int value = checkIndexOutOfBounds(x, 0, matrix);
            if (-1 == value) {
                return true;
            }

            for (int i = 0; i < matrix[0].length; i++) {

                int tmp = checkIndexOutOfBounds(i + x, i, matrix);
                if (-1 == tmp) {
                    break;
                }
                if (tmp != value) {
                    return false;
                }
            }
        } else {
            int value = checkIndexOutOfBounds(0, y, matrix);
            if (-1 == value) {
                return true;
            }

            for (int i = 0; i < matrix.length; i++) {
                int tmp = checkIndexOutOfBounds(i, i + y, matrix);
                if (-1 == tmp) {
                    break;
                }
                if (tmp != value) {
                    return false;
                }
            }
        }

        return true;
    }

    /**
     * 如果越界  返回 -1
     */
    private static int checkIndexOutOfBounds(int x, int y, int[][] matrix) {

        if (y < 0 || y > matrix.length - 1) {
            return -1;
        }
        if (x < 0 || (x > matrix[y].length - 1)) {
            return -1;
        }
        return matrix[y][x];
    }

    public static void main(String[] args) {


//        System.out.println(new Solution().isToeplitzMatrix(new int[][]{{40,25,89,95},{22,40,25,89},{74,22,40,25},{44,74,22,40},{11,44,74,22},{24,11,44,74}}));
//        System.out.println(new Solution().isToeplitzMatrix(new int[][]{{11,74,7,93},{40,64,97,56}}));
        System.out.println(new Solution().isToeplitzMatrix(new int[][]{{36,59,71,15,26,82,87},{56,36,59,71,15,26,82},{15,0,36,59,71,15,26}}));
        System.out.println(new Solution().isToeplitzMatrix(new int[][]{{11, 74, 0, 93}, {40, 11, 74, 7}}));
        System.out.println(new Solution().isToeplitzMatrix(new int[][]{{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}}));
//        System.out.println(new Solution().isToeplitzMatrix(new int[][]{{65,98,57}}));
    }


}
