package P_1103_分糖果_II;

public class Solution {
    public int[] distributeCandies(int candies, int num_people) {

        int everyChildCount = 0, calculateCandies = 0;
        while (calculateCandies <= candies) {
            everyChildCount++;
            calculateCandies = (num_people * everyChildCount) * (num_people * everyChildCount + 1) / 2;
        }

        return distributeCandies(candies, num_people, everyChildCount - 1);

    }

    /**
     * 直接简单的分发逻辑
     * @param everyChildCount 。。everyChildCount -1
     * @return
     */
    private int[] distributeCandies(int candies, int num_people, int everyChildCount) {
        int[] res = new int[num_people];
        int remain = candies - ((everyChildCount) * num_people) * ((everyChildCount) * num_people + 1) / 2;

        for (int i = 0; i < num_people; i++) {
            res[i] = 0;
            for (int j = 0; j < everyChildCount; j++) {
                res[i] += (j * num_people + i + 1);
            }

            //处理剩余糖果
            if (remain > 0) {
                int needDistribute = (everyChildCount) * num_people + (i + 1);
                needDistribute = needDistribute > remain ? remain : needDistribute;
                remain -= needDistribute;
                res[i] += needDistribute;
            }

        }
        return res;
    }

    public static void main(String[] args) {
//        new Solution().distributeCandies(7, 4);
//        new Solution().distributeCandies(10, 3);
        new Solution().distributeCandies(10, 3, 1);
        new Solution().distributeCandies(10, 3, 2);
    }
}
