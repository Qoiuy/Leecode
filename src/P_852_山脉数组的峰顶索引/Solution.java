package P_852_山脉数组的峰顶索引;

public class Solution {

    public int peakIndexInMountainArray(int[] A) {

        int count = 0;
        for (int i = 0; i < A.length - 2; i ++){

            if (A[i] < A[i+1]  && A[i+1] > A[i+2]){
                count = i + 1;
                break;

            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().peakIndexInMountainArray(new int[]{0,1,0}));
    }
}
