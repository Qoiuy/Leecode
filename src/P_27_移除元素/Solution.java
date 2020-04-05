package P_27_移除元素;

public class Solution {

    public int removeElement(int[] nums, int val) {

        int ret = 0 ;

        for (int curr : nums){
            if (curr != val){
                nums[ret++] = curr;
            }
        }
        return ret ;

    }


    public static void main(String[] args) {
        test1();

        test2();

    }

    private static void test2() {
        int[] nums = new int []{3,2,2,3};
        System.out.print(new Solution().removeElement(nums, 3) + " => ");
        for (int tmp : nums){
            System.out.print(tmp + "  ");
        }
        System.out.println();
    }

    private static void test1() {
        int[] nums = new int []{0,1,2,2,3,0,4,2};
        System.out.print(new Solution().removeElement(nums, 2) + " => ");
        for (int tmp : nums){
            System.out.print(tmp + "  ");
        }
        System.out.println();
    }
}
