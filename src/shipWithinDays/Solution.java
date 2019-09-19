package shipWithinDays;

/**
 * 求运载能力  我的思路是  先求出最小的运载量
 * 然后再 一个个往上增，.
 * 如果超时 使用二分的思路 比如 求出来的值是14 = > (14+14/2) => (14+ 14/2+ 14/2/2)
 */
public class Solution {


    public static void main(String[] args) {
        Solution s = new Solution();
        int[] weight = {310,259,338,140,144,153,97,316,30,154,168,289,39,104,251,239,419,462,77,324,385,455};
        int D = 22;

        System.out.println(s.shipWithinDays(weight, D));
    }
    public int shipWithinDays(int[] weights, int D) {
        int sum = 0, max = 0;
        for(int i = 0; i < weights.length; i ++){
            sum = sum + weights[i];
            if(weights[i] > max){
                max = weights[i];
            }
        }
        int avg = sum / D + (sum % D > 0 ? 1 : 0); //求出平均值 后面是处理是否整除的逻辑

        if (avg < max){
            avg = max;
        }
        /**
         * 使用贪心的思路
         */
        for(int tmp = 1; tmp > 0; avg ++){
            tmp = shipWithinDays(weights, D, avg);
        }
        return avg - 1;
    }

    /**
     * 模拟轮船运货
     * 求不足的运载量
     * @param weights
     * @param D
     * @param ereryDayWeight
     * @return
     */
    public static int shipWithinDays(int[] weights, int D, int ereryDayWeight) {

        int everyDay, yesterDayLocal = 0;
        for( int i = 0; i < D; i ++){
            everyDay = 0;
            for (int j = yesterDayLocal ; j < weights.length; ){
                if(everyDay + weights[j] <= ereryDayWeight){ // 小于等于当天运载量
                    everyDay += weights[j];
                    yesterDayLocal = ++j;
                } else {
                    break;
                }
            }

        }
        if(yesterDayLocal >= weights.length){
            return 0;
        }else {
            int sum = 0;
            for (int i = yesterDayLocal; i < weights.length; i++){
                sum += weights[i];
            }
            return sum;
        }

    }
}
