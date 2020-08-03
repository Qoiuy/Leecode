package P_704_二分查找;

public class Solution {

    public int search(int[] nums, int target) {

        int start = 0, end = nums.length-1;

        while (start < end){

            int  mid = (start + end ) / 2 ;
            if (start == mid || end == mid){
                break;
            }
            System.out.println("start: " + start + " end: " + end + " mid:" + mid);
            if ( target < nums[mid]  ){
                end = mid;
            }else if (nums[mid] == target){
                return mid;
            }else {
                start = mid;
            }


        }
        System.out.println("start : " + start);
        System.out.println("end : " + end);
        if (nums[start] == target){
            return start;
        }
        if( nums[end] == target){
            return end;
        }
        if (nums[(start+end) / 2] == target){
            return (start+end) / 2;
        }
        return -1;
    }

    public static void main(String[] args) {
//        System.out.println(new Solution().search(new int[]{-1,0,3,5,9,12}, 9));
        System.out.println(new Solution().search(new int[]{-1,0,3,5,9,12}, 2));
    }
}
