package P_821_字符的最短距离;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Solution {

    public int[] shortestToChar(String S, char C) {

        Deque<Integer> addrs = new LinkedList<>();
        for (int i = 0; i < S.length(); i++) {
            if (C == S.charAt(i)) {
                addrs.addLast(i);
//                addrs.push(i);
            }
        }

        System.out.println(addrs.toString());
        int[] res = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {

            int addr = addrs.pop();
            if (addrs.size() == 0){
                res[i] = i - addr > 0 ? i - addr : addr -i;
                addrs.addFirst(addr);
                continue;
            }
            int next = addrs.pop();
            if (i < addr) {
                res[i] = addr - i;
                addrs.addFirst(next);
                addrs.addFirst(addr);
            } else if (i == addr) {
                res[i] = 0;
                addrs.addFirst(next);
                addrs.addFirst(addr);
            } else if (i == next) {
                res[i] = 0;
                addrs.addFirst(next);
            } else if (i - addr < next - i) {
                res[i] = i - addr;
                addrs.addFirst(next);
                addrs.addFirst(addr);
            } else {
                res[i] = next - i;
                addrs.addFirst(next);
            }
        }


        return res;
    }

    public static void main(String[] args) {
        for (int i:
//        new Solution().shortestToChar("loveleetcode", 'e')){
        new Solution().shortestToChar("aaba",'b')){
            System.out.print(i + " ");
        }
    }
}
