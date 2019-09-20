package P_942_增减字符串匹配;

import java.lang.reflect.Array;
import java.util.LinkedList;

public class Solution {

    public int[] diStringMatch(String S) {

        int[] res = new int[S.length() + 1];
        int first = 0, last = S.length();

        for (int i = 0; i < S.length(); i++) {
            if ('D' == S.charAt(i)) {
                res[i] = last--;
            } else {
                res[i] = first ++;
            }
        }
        res[S.length()] = first ++;

        return res;
    }

    public int[] diStringMatch1(String S) {

        LinkedList<Integer> list = initArr(S);
        int[] res = new int[S.length() + 1];

        for (int i = 0; i < S.length(); i++) {
            if ('D' == S.charAt(i)) {
                res[i] = list.pollLast();
            } else {
                res[i] = list.pollFirst();
            }
        }

        res[S.length()] = list.poll();

        return res;
    }

    private LinkedList<Integer> initArr(String S) {
        LinkedList list = new LinkedList();
        for (int i = 0; i <= S.length(); i++) {
            list.add(i);
        }
        return list;
    }

    private int[] initArr1(String S) {
        int[] s = new int[S.length()+1];

        for (int i = 0; i <= S.length(); i++) {
            s[i] = i;
        }
        return s;
    }

    public static void main(String[] args) {

        int[] arr = new Solution().diStringMatch("IDID");

        for (int i = 0; i < arr.length; i ++){
            System.out.println(arr[i]);
        }
        System.out.println(arr.toString());
    }

}
