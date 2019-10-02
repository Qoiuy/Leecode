package P_496_下一个更大元素_I;

public class Solution {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {


        for (int o = 0; o < nums1.length; o++) {

            int count = -1, flag = -1;

            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == nums1[o]) {
                    flag = j + 1;
                }

                if (flag != -1 ) {
                    if (nums2[j] > nums1[o]) {
                        count = nums2[j];
                        break;
                    }
                }
            }
            nums1[o] = count;

        }


        return nums1;
    }

}
