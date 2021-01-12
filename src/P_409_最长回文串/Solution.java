package P_409_最长回文串;

import java.util.Arrays;

public class Solution {
    public int longestPalindrome(String s) {

        int[] upper = new int[26];
        Arrays.fill(upper, 0);
        int[] lower = new int[26];
        Arrays.fill(lower, 0);


        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                lower[c - 'a']++;
            }
            if (c >= 'A' && c <= 'Z') {
                upper[c - 'A']++;
            }
        }

        int count = 0;
        int flag = 0;
        for (int i = 0; i < 26; i++) {
            if (upper[i] % 2 == 1 || lower[i] % 2 == 1) {
                flag++;
            }
            count += upper[i] / 2;
            count += lower[i] / 2;
        }

        return count * 2 + (flag == 0 ? 0 : 1);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().longestPalindrome("abccccdd"));
    }
}
