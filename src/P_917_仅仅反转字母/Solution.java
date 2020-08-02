package P_917_仅仅反转字母;

public class Solution {

    public String reverseOnlyLetters(String S) {

        char[] chars = S.toCharArray();
        int start = 0, end = chars.length - 1;
        while (start < end){
            if (!isLetter(chars[start])){
                start++;
                continue;
            }
            if (!isLetter(chars[end])){
                end--;
                continue;
            }
            char tmp = chars[start];
            chars[start] = chars[end];
            chars[end] = tmp;
            start++;
            end--;
        }
        return new String(chars);
    }

    private boolean isLetter(char aChar) {
        return (aChar >= 'a' && aChar <= 'z') || (aChar >= 'A' && aChar <= 'Z');
    }

    public static void main(String[] args) {
//        System.out.println(new Solution().reverseOnlyLetters("ab-cd"));
        System.out.println(new Solution().reverseOnlyLetters("7_28]"));
    }
}
