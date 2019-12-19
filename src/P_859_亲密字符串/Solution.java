package P_859_亲密字符串;

import java.util.HashSet;

public class Solution {

    public boolean buddyStrings(String A, String B) {

        if (A.length() != B.length()) {
            return false;
        }
        char[] a = A.toCharArray();
        char[] b = B.toCharArray();

        int count = 0;
        char a1 = 0, a2 = 0, b1 = 0, b2 = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]){
                count ++;
                if (count == 1){
                    a1 = a[i];
                    b1 = b[i];
                }else if(count == 2){
                    a2 = a[i];
                    b2 = b[i];
                }

            }
        }
        if (count == 0){
            HashSet<Character> set = new HashSet<>();
            for (Character c : a){
                if (!set.add(c)){
                    return true;
                }
            }
            return false;
        }

        return count == 2 && a1 == b2 && a2 == b1  ;

    }

    public static void main(String[] args) {
        System.out.println(new Solution().buddyStrings("ab", "ab"));
    }
}
