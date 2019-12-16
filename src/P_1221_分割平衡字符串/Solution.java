package P_1221_分割平衡字符串;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public int balancedStringSplit(String s) {


        int sum = 0;
        Queue<Character> queue = new LinkedList();

        for (Character c : s.toCharArray()){

            if (queue.size() == 0){
                sum ++ ;
                queue.offer(c);
                continue;
            }
            Character head = queue.poll();
            if (c + head != ('R' + 'L')){
                queue.offer(head);
                queue.offer(c);
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().balancedStringSplit("RLRRLLRLRL"));
    }
}
