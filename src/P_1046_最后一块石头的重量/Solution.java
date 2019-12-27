package P_1046_最后一块石头的重量;

public class Solution {

    public int lastStoneWeight(int[] stones) {

        for (int i = 0; i < stones.length - 1; i++) {

            findMax(stones, i);
            findMax(stones, i + 1);

            if (stones[i] == stones[i + 1]) {
                stones[i] = 0;
                stones[i + 1] = 0;
            } else {
                stones[i + 1] = stones[i] - stones[i + 1];
                stones[i] = 0;
            }

        }

        return stones[stones.length - 1 ];
    }


    /**
     * 找到最大的值
     *
     * @param stones   数组
     * @param startSub 开始查询位置
     * @return
     */
    private Integer findMax(int[] stones, int startSub) {

        int max = 0, maxSub = -1;

        //找到最大元素
        for (int i = startSub; i < stones.length; i++) {
            if (stones[i] >= max) {
                max = stones[i];
                maxSub = i;
            }
        }
        //替换最大值到开始位置
        int tmp = stones[startSub];
        stones[startSub] = stones[maxSub];
        stones[maxSub] = tmp;

        //返回最大值
        return stones[startSub];
    }


    public static void main(String[] args) {
        System.out.println(        new Solution().lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}));;
    }
}
