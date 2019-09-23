package P_1021_删除最外层的括号;

import java.util.*;

public class Solution {

    public String removeOuterParentheses(String S) {

        Stack<Character> stack = new Stack<Character>();


        StringBuffer stringBuffer = new StringBuffer();

        //原语化分解 分解之后的结果放在addr中存储 。
        for (int i = 0; i < S.length(); i++) {
            if ('(' == S.charAt(i)) {
                if (stack.size() >= 1) {
                    stringBuffer.append('(');
                }
                stack.push('(');
            } else {
                if (stack.size() >= 2) {
                    stringBuffer.append(')');
                }
                stack.pop();
            }
        }
        return stringBuffer.toString();

    }

    public static void main(String[] args) {
        System.out.println(new Solution().removeOuterParentheses("(()())(())"));
    }
}
