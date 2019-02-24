package stack.validParentheses;

import java.util.HashMap;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {

        Solution solution = new Solution();
        String str = "[][][()]";
        System.out.println(solution.isValid(str));
    }

    public boolean isValid(String s) {

        Stack<String> stringStack = new Stack<>();
        HashMap<String, String> data = new HashMap<>();
        data.put("]", "[");
        data.put("}", "{");
        data.put(")", "(");
        for( int i = 0; i < s.length(); i++){

            String dealString = String.valueOf(s.charAt(i));

            // [ { (
            if(data.get(dealString) == null){
                stringStack.push(dealString);
            } else if(stringStack.empty()){
                return false;
            } else if(!stringStack.empty() && !data.get(dealString).equals(stringStack.pop())){
                return false;
            }
        }

        if(stringStack.empty()){
            return true;
        }
        return false;

    }
}
