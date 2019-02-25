package deque.slidingWindowMaximum;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

        int[] nums = {9,10,9,-7,-4,-8,2,-6 };
        Solution solution = new Solution();
        int[] res = solution.maxSlidingWindow(nums, 5);
        System.out.println();
        for (int i: res
        ) {
            System.out.printf(i + ", ");
        }
    }


    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0){
            return new int[]{};
        }

        int[] result = new int[nums.length - k + 1] ;

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        int j = 0;
        //模拟窗口滑动
        for(int i = 0; i < nums.length; i++){

            offer(queue, k, i, nums);

            //进行结果处理
            if( i >= k - 1){
                result[j++] = nums[queue.peek()];
            }

        }
        return result;
    }

    //该操作保证 number + queueScope里面的元素 最左侧为最大值
    private void offer(ArrayDeque<Integer> queue, Integer windowMax, Integer local, int[] nums) {

        //确定双端队列最左侧位置 在窗口里面
        if(!queue.isEmpty() && queue.peek() < (local - windowMax + 1)){
            queue.poll();
        }

        //添加元素位置进队列
        //遍历队列 查看最大值是否大于传进来的值
        Iterator<Integer> tmp = queue.iterator();
        while (tmp.hasNext()){
            //传进来的值 大于 队列里面的值 删除该值对应的位置
            if(nums[tmp.next()] < nums[local]){
                tmp.remove();
            }
        }
        queue.offer(local);

    }

    private void print(ArrayDeque<Integer> queue){
        for (int i: queue
        ) {
            System.out.printf(i + ", ");
        }
        System.out.println();
    }

}
