package P_290_单词规律;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean wordPattern(String pattern, String str) {

        char[] pChar = pattern.toCharArray();
        String[] sString = str.split(" ");
        if (pChar.length != sString.length){
            return false;
        }

        Map<Character, String> pMap = new HashMap<>();
        Map<String, Character> sMap = new HashMap<>();

        for (int i =  0; i < pChar.length; i++){
            if (!sMap.containsKey(sString[i])){
                sMap.put(sString[i], pChar[i]);
            }

            if (!pMap.containsKey(pChar[i])){
                pMap.put(pChar[i],  sString[i]);
            }

            if (sMap.containsKey(sString[i]) && sMap.get(sString[i]) != pChar[i]){
                return false;
            }

            if (pMap.containsKey(pChar[i]) && !pMap.get(pChar[i]).equals(sString[i]) ){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(new Solution().wordPattern("abba", "dog cat cat dog"));
    }
}
