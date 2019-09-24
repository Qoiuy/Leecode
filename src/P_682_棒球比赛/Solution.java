package P_682_棒球比赛;

import java.util.Stack;

public class Solution {


    public int calPoints(String[] ops) {

        Stack<Integer> stack = new Stack<>();
        for (String op : ops){
            if ("+".equals(op)){
                int first = stack.pop();
                int second = stack.pop();
                stack.push(second);
                stack.push(first);
                stack.push(second+first);
            }else if ("C".equals(op)){
                stack.pop();
            }else if ("D".equals(op)){
                int first = stack.pop();
                stack.push(first);
                stack.push(first * 2);
            }else {
                stack.push(Integer.parseInt(op));
            }
        }

        return stack.stream().mapToInt(p -> p).sum();
    }
}
