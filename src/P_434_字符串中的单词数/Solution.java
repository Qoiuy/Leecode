package P_434_字符串中的单词数;

public class Solution {
    public int countSegments(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int count = 0;
        boolean lastIsSpace = true;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                if (!lastIsSpace) {
                    count++;
                }
                lastIsSpace = true;
            } else {
                lastIsSpace = false;
            }

        }
        return count + (!lastIsSpace ? 1 : 0);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().countSegments("  "));
        System.out.println(new Solution().countSegments("  a"));
        System.out.println(new Solution().countSegments("c  a"));
        System.out.println(new Solution().countSegments("c  "));
    }
}
