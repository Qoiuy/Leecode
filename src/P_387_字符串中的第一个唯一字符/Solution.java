package P_387_字符串中的第一个唯一字符;

import java.util.Arrays;

public class Solution {

    public int firstUniqChar(String s) {
        if (s.length() == 0 ){
            return -1;
        }

        int[] flag = new int[26];
        Arrays.fill(flag, -1);
        char[] c = s.toCharArray();
        for (int i = 0 ;i < c.length; i++){
            if (flag[c[i] -'a'] == -1){
                flag[c[i] - 'a'] = i;
            } else if (flag[c[i] - 'a'] == -2){
                continue;
            } else {
                flag[c[i] - 'a'] = -2;
            }
        }

        int local = c.length;

        for (int i = 0; i < 26; i++){
            if (flag[i] >= 0){
                local = Math.min(flag[i], local);
            }
        }
        return local == c.length ? -1 : local;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().firstUniqChar("cc"));
    }
}
