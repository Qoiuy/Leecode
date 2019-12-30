package P_868_二进制间距;

public class Solution {

    public int binaryGap(int N) {
        if (N == 0){
            return 0;
        }
        int max = 0, curr = 0, before = 0;

        for (; N != 0 ;  N >>= 1){
            ++curr;
            int tmp = N >> 1 << 1;
            //最右侧 = 0
            if (tmp != N){

                if (before == 0){
                    before = curr;
                }else {
                    max = curr - before >= max ? curr - before : max;
                    before = curr;
                }
            }
        }
        return max;

    }

    public static void main(String[] args) {
        System.out.println(new Solution().binaryGap(22));
        System.out.println(new Solution().binaryGap(5));
        System.out.println(new Solution().binaryGap(6));
        System.out.println(new Solution().binaryGap(8));
    }
}
