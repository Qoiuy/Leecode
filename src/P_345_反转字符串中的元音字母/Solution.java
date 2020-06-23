package P_345_反转字符串中的元音字母;

import java.util.HashSet;

public class Solution {

    public String reverseVowels(String s) {
        if (s.length() <= 1) {
            return s;
        }
        HashSet<Character> vowels = new HashSet<Character>() {{
            add('a');
            add('e');
            add('o');
            add('i');
            add('u');
            add('A');
            add('E');
            add('O');
            add('I');
            add('U');
        }};

        char[] chars = s.toCharArray();

        int start = -1, end = chars.length;
        while (start++ < chars.length - 1) {
            if (!vowels.contains(chars[start])) {
                continue;
            }

            while (end-- > 0) {
                if (!vowels.contains(chars[end])) {
                    continue;
                }


                if (start >= end) {
                    return new String(chars);
                }

                char tmp = chars[start];
                chars[start] = chars[end];
                chars[end] = tmp;

                break;
            }
        }
        return new String(chars);
    }


    public static void main(String[] args) {
        System.out.println(new Solution().reverseVowels("ai"));
        System.out.println(new Solution().reverseVowels("a."));
        System.out.println(new Solution().reverseVowels("hello"));
        System.out.println(new Solution().reverseVowels("race car"));
    }
}
