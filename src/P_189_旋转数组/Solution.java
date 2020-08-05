package P_189_旋转数组;

public class Solution {

    public void rotate(int[] nums, int k) {

        if (nums.length <= 1){
            return ;
        }

        if (nums.length == k){
            return;
        }

        if (nums.length < k){
            k = k - nums.length;
        }

        int length = nums.length;
        int[] cache = new int[k];

        // 转移到cache中的数据
        for ( int i = 0; i < k; i++){
            int target = length-k + i;
            if (target < 0){
                continue;
            }
            cache[i] = nums[target];
        }

        int i = 0, jump = 1;

        while (i < k){
            if ( i >= length){
                break;
            }
            int target = i + jump * k;

            // 进行跳转
            if (target < length){
                // 当前数组内部的跳转
                int tmp = nums[i];
                nums[i] = nums[target];
                nums[target] = tmp;
                jump++;
            } else {
                // 出现要被缓存在你cache中的数据
//                System.out.println("target:" + target);
//                System.out.println("length:" + length);
                target = target - length;
//                System.out.println("target:" + target);
                cache[target] = nums[i];
                jump = 1;
                i++;
            }

        }
        // 将cache中的数据写会到nums

        for ( int j = 0; j < k; j++){
            if (j >= length){
                continue;
            }
            nums[j] = cache[j];
        }
    }

    public static void main(String[] args) {
//        new Solution().rotate(new int[]{1,2,3,4,5,6,7}, 3);
        new Solution().rotate(new int[]{1,2}, 3);
    }

    private void print(int[] nums, int[] cache) {
        System.out.printf("nums : ");
        for ( int i = 0 ; i < nums.length; i++){
            System.out.printf(nums[i] + ", ");
        }

        System.out.printf("\t\tcache : ");
        for (int i = 0 ;i < cache.length; i++){
            System.out.printf(cache[i] + ", ");
        }
        System.out.println();

    }


}
