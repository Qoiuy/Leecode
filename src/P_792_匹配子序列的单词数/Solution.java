package P_792_匹配子序列的单词数;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    public int numMatchingSubseq(String S, String[] words) {

        int count = 0;

        Map<String,Boolean > map = new HashMap<>();

        for (String s : words){
            if (map.containsKey(s)){
                if (map.get(s)){
                    count++;
                }
                continue;
            }
            map.put(s,false);
            if (isSubsequence(s, S)){
                count++;
                map.put(s,true);
            }
        }
        return count;

    }

    public boolean isSubsequence(String s, String t) {
        if (s.equals("")){
            return true;
        }
        int count = 0 ;
        for (Character c : t.toCharArray()){
            if (s.charAt(count) == c){
                count++;
                if (count == s.length()){
                    return true;
                }
            }
        }
        return false;
    }
}
