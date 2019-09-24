package P_908_小差值_I;

public class Solution {

    public int smallestRangeI(int[] A, int K) {
        int min = A[0], max = A[0];
        for (int x : A) {
            min = min > x ? x : min;
            max = max < x ? x : max;
        }

        return max - min > 2 * K ? max - min - 2 * K : 0;

    }

    public static void main(String[] args) {
//        System.out.println(new Solution().smallestRangeI(new int[]{1,3,6},3)); // 0
//        System.out.println(new Solution().smallestRangeI(new int[]{3,1,10},4)); // 1
//        System.out.println(new Solution().smallestRangeI(new int[]{2,7,2},1));//3
        System.out.println(new Solution().smallestRangeI(new int[]{9,10,0,7},1));//8
    }
}
