package P_13_罗马数字转整数;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {

    static  Map<String , Integer> doubleStr = new HashMap<String, Integer>(){{
        put("IV", 4);
        put("IX", 9);
        put("XL", 40);
        put("XC", 90);
        put("CD", 400);
        put("CM", 900);
    }};

    static Map<String , Integer> singleStr = new HashMap<String, Integer>(){{
        put("I", 1);
        put("V", 5);
        put("X", 10);
        put("L", 50);
        put("C", 100);
        put("D", 500);
        put("M", 1000);
    }};

    public static  int romanToInt(String s) {


        AtomicInteger res = new AtomicInteger();

        for (Map.Entry<String, Integer> entry : doubleStr.entrySet()) {
            while (s.contains(entry.getKey())) {
                s = s.replaceFirst(entry.getKey(), "");
                res.addAndGet(entry.getValue());
            }
        }

        for (Map.Entry<String, Integer> entry : singleStr.entrySet()) {
            while (s.contains(entry.getKey())){
                s = s.replaceFirst(entry.getKey(), "");
                res.addAndGet(entry.getValue());
            }

        }
        return res.get();

    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("IX"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }

}
