package P_1047_删除字符串中的所有相邻重复项;

import java.util.Stack;

public class Solution {

    public String removeDuplicates(String S) {

        Stack<Character> stack = new Stack<>();

        for (Character c: S.toCharArray()){
            if (stack.size() == 0){
                stack.push(c);
            }else {
                Character tmp = stack.pop();
                if ( c != tmp){
                    stack.push(tmp);
                    stack.push(c);
                }
            }
        }

        if (stack.size() == 0){
            return "";
        }
        int length = stack.size();
        char[] chars = new char[length];

        for (int i = 0; i < length; i++){
            chars[length - i - 1] = stack.pop();
        }

        return new String(chars);

    }

    public static void main(String[] args) {
        System.out.println(new Solution().removeDuplicates("abbaca"));
    }
}
