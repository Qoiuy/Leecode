package P_500_键盘行;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {



    public String[] findWords(String[] words) {

        List<String> res = new ArrayList<>();

        for (int i = 0; i < words.length; i++){

            if (vaild(words[i])){
                res.add(words[i]);
            }
        }

        if (res.size() == 0){
            return new String[0];
        }

        return res.toArray(new String[res.size()]);

    }

    public static boolean vaild(String s) {
        Map<Character, Integer> map = init();
        int res = 0;
        for ( int i = 0; i < s.length(); i++){
            int tmp = map.get(s.charAt(i));
            if (res == 0){
                res = tmp;
            }
            if (res != tmp){
                return false;
            }
        }
        return true;
    }

    public static Map<Character, Integer> init() {
        Map<Character, Integer> map = new HashMap<>();
        initMap("qwertyuiopQWERTYUIOP", map, 1);
        initMap("asdfghjklASDFGHJKL", map, 2);
        initMap("zxcvbnmZXCVBNM", map, 3);
        return map;
    }

    public static void initMap(String line1, Map<Character, Integer> map, int value) {
        for (int i = 0; i < line1.length(); i ++){
            map.put(line1.charAt(i), value);
        }
    }


    public static void main(String[] args) {
        new Solution().findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"});
    }
}
