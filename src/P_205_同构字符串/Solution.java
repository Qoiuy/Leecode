package P_205_同构字符串;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> smap = new HashMap<>();
        Map<Character, Character> tmap = new HashMap<>();

        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();

        for (int i = 0 ;i < chars.length; i++){
            if (! smap.containsKey(chars[i])){
                smap.put(chars[i], chart[i]);
            }
            if (! tmap.containsKey(chart[i])){
                tmap.put(chart[i], chars[i]);
            }

            if (smap.containsKey(chars[i]) && chart[i] != smap.get(chars[i])){
                return false;
            }
            if (tmap.containsKey(chart[i]) && chars[i] != tmap.get(chart[i])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isIsomorphic("egg", "add"));
//        System.out.println(new Solution().isIsomorphic("ab", "aa"));
    }
}
