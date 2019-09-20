package P_709_转换成小写字母;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public String toLowerCase(String str) {
        if (str == null || str.length() == 0){
            return str;
        }

        Map<Character, Character> map = new HashMap<Character, Character>(){{
            for (int i = 0; i < 26; i++){
                put((char)('A' + i), (char)('a' + i));
            }
        }} ;

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++){
            stringBuffer.append(map.containsKey(str.charAt(i)) ? map.get(str.charAt(i)) + "" : str.charAt(i) + "");
        }

        return stringBuffer.toString();

    }

    public static void main(String[] args) {
        System.out.println(new Solution().toLowerCase("adfaSsdfa"));;
    }
}
