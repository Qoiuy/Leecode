package P_1189_气球_的最大数量;

import java.util.HashMap;
import java.util.Map;

public class Solution  {

    public int maxNumberOfBalloons(String text) {

        Map<Character, Integer> map = new HashMap<>();
        for (Character c : "balloon".toCharArray()){
            map.put(c, 0);
        }

        for (Character c : text.toCharArray()){
            if (map.containsKey(c)){
                map.put(c , map.get(c) + 1 );
            }
        }

        return Math.min(map.get('b'), Math.min(map.get('a'), Math.min(map.get('l') / 2, Math.min(map.get('o') / 2, map.get('n')))));

    }
}
