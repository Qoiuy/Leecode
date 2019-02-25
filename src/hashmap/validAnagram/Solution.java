package hashmap.validAnagram;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        String a="a", b="b";
        Solution solution = new Solution();
        System.out.println(solution.isAnagram(a,b));
    }
    public boolean isAnagram(String s, String t) {

        if(s == null || t == null || s.length() != t.length()){
            return false;
        }

        //将字符串转换成map
        HashMap<Character, Integer> sMap = new HashMap(),tMap = new HashMap();
        for(int i = 0; i < s.length(); i++){
            turn(sMap, s.charAt(i));
            turn(tMap, t.charAt(i));
        }


        for (Map.Entry<Character, Integer> entry:sMap.entrySet()) {
            if(tMap.get(entry.getKey()) == null ){
                return false;
            }
            if(tMap.get(entry.getKey()).intValue() !=  entry.getValue().intValue()){
                return false;
            }
        }
        return true;
    }

    public void turn(HashMap<Character, Integer> map, Character c){
        if(map.get(c) != null){
            map.put(c, map.get(c) + 1);
        }else {
            map.put(c, 0);
        }
    }

}
