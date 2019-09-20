package P_461_汉明距离;

public class Solution {

    public int hammingDistance(int x, int y) {
        if (x == 0 && y == 0) {
            return 0;
        }
        if (x == 0) {
            return getMaxLeft(y);
        }
        if (y == 0) {
            return getMaxLeft(x);
        }

        return ((x & 1) == (y & 1) ? 0 : 1 )+ hammingDistance(x >> 1, y >> 1);

    }

    /**
     * 获取最高位
     */
    private int getMaxLeft(int x) {

        int count = 0;
        while (x > 0) {
            if ((x & 1) != 0){
                ++count;
            }
            x = x >> 1;
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(new Solution().getMaxLeft(1));
        System.out.println(new Solution().getMaxLeft(2));
        System.out.println(new Solution().getMaxLeft(10));
        System.out.println(new Solution().hammingDistance(1, 4));
        System.out.println(new Solution().hammingDistance(0, 10));
    }
}
