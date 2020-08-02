package P_414_第三大的数;

public class Solution {


    public int thirdMax(int[] nums) {

        boolean flag = false;

        if (nums.length == 0){
            return 0;
        }
        int first= Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
        for (int i : nums){

            flag = (i == Integer.MIN_VALUE) | flag;

            if (i < third){
                // 张三看到地上的票比手里的小 理都不理，继续找下一张
                continue;
            }

            // 张三看到手里面有张比自己大的票时， 去问王二："嘿 ，你手里的票是多大的？"

            // "还没王二的票大呢， 我先放手里吧" 然后继续捡
            if ( i < second){
                third = i;
                continue;
            }

            // "和你手里面的票是一样的呀" 那就继续捡
            if (i == second){
                continue;
            }

            // "呦，票比你手里的大，来 把你手里的票给我，咱俩换换  你拿贵的"
            int backup = third;
            third = second;
            second = i;

            // 王二拿着手里的票 去问赵大 :"嘿 ，你手里的票是多大的呀?"

            // "怎么没你的大呀 ，得， 继续捡吧"
            if (i < first){
                continue;
            }

            // "和你手里的票是一样的呀 那我和张三说一声去， 完 白捡了。 我去找张三换一下去"
            if (i == first){
                second = third;
                third = backup;
                continue;
            }

            // 赵大发现 票比自己手里面的大时 ："拿来吧你"
            backup = first;
            first = second;
            second = backup;


        }

        // 捡完了  开始查票了 ===> 另一套逻辑
        // 老三手里有票 ,给看老三的票
        if (flag){
            if (second != Integer.MIN_VALUE){
                return third;
            }
        }
        if (third != Integer.MIN_VALUE){
            return third;
        }

        // 题目要求 ：第三大的数不存在, 所以返回最大的数
        return first;
    }

    public static void main(String[] args) {

        System.out.println(new Solution().thirdMax(new int[]{2, 2, 3, 1}));
        System.out.println(new Solution().thirdMax(new int[]{2, 3, 1}));
        System.out.println(new Solution().thirdMax(new int[]{2, 3}));
        System.out.println(new Solution().thirdMax(new int[]{2, 1}));
        System.out.println(new Solution().thirdMax(new int[]{2, -2147483648}));
        System.out.println(new Solution().thirdMax(new int[]{ -2147483648}));
        System.out.println(new Solution().thirdMax(new int[]{-2147483648,1,2}));
        System.out.println(new Solution().thirdMax(new int[]{-2147483648,-2147483648,2}));
        System.out.println(new Solution().thirdMax(new int[]{-2147483648,-2147483648,-2147483648}));
//        System.out.println(new Solution().thirdMax(new int[]{1,-2147483648,2}));
    }
}
