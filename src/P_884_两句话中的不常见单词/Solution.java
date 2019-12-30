package P_884_两句话中的不常见单词;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public String[] uncommonFromSentences(String A, String B) {
        List<String> res = new ArrayList<>();
        Map<String, Integer> aMap = new HashMap<>(),bMap = new HashMap<>();

        //处理全部的值
        stringToMap(A, aMap);
        stringToMap(B, bMap);

        //遍历A B map
        handleMap(res, aMap, bMap);
        handleMap(res, bMap, aMap);
        return res.toArray(new String[res.size()]);

    }

    private void stringToMap(String A, Map<String, Integer> map) {
        for (String s : A.split(" ")) {
//            Integer a = map.computeIfAbsent(s, k -> 0);
//            a++;
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
    }

    private void handleMap(List<String> res, Map<String, Integer> aMap, Map<String, Integer> bMap) {
        aMap.forEach((key, value) -> {
            if (value == 1 && !bMap.containsKey(key)) {
                res.add(key);
            }
        });
    }

    public static void main(String[] args) {
        String[] strings = new Solution().uncommonFromSentences("this apple is sweet", "this apple is sour");
        for (String s : strings){
            System.out.println(s);
        }
    }
}
