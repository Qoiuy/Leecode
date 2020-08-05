package P_88_合并两个有序数组;

import java.util.Arrays;

public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] nums1tmp = Arrays.copyOf(nums1, m);

        int i =0 , j = 0;
        while (i <m || j <n){
            if (i == m){
                nums1[i+j] = nums2[j++];
                continue;
            }
            if (j == n){
                nums1[i+j] = nums1tmp[i++];
                continue;
            }
            nums1[i+j] = nums1tmp[i] < nums2[j] ? nums1tmp[i++]:nums2[j++];
        }
    }

    public static void main(String[] args) {
        new Solution().merge(new int[]{1,2,3,0,0,0},3, new int[]{2,5,6}, 3 );
    }

}
