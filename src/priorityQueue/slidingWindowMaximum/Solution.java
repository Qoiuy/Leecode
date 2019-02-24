package priorityQueue.slidingWindowMaximum;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {

    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        Solution solution = new Solution();
        int[] res = solution.maxSlidingWindow(nums, 3);
        for (int i: res
             ) {
            System.out.printf(i + ", ");
        }
    }

    //利用优先队列的最大值特性查询数字
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0){
            return new int[]{};
        }
        int[] result = new int[nums.length - k + 1] ;

        //模拟窗口滑动
        for(int i = 0; i < nums.length - k + 1 ; i++){
            //取出窗口里面的数字
            int[] tmp = new int[k];
            //推荐的复制数组
            System.arraycopy(nums, i, tmp, 0, k);

            result[i] = maxValue(tmp);
        }
        return result;
    }

    private int maxValue(int[] tmp) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(tmp.length, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        for (int i : tmp ) {
            priorityQueue.offer(i);
        }
        return priorityQueue.peek();
    }
}
