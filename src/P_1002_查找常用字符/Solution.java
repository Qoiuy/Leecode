package P_1002_查找常用字符;

import java.util.*;

public class Solution {
    public List<String> commonChars(String[] A) {

        Map<String, Integer> map = new HashMap<>();
        for (String s : A){
            splitStr(s).forEach(p -> map.put(p, map.containsKey(p) ? map.get(p) + 1 : 1) );
        }

        List<String> res = new ArrayList<>();
        map.forEach((key, value) -> {
            if (value == A.length) {
                if (key.length() > 0) {
                    res.add(Character.toString(key.charAt(0)));
                } else {
                    res.add(key);
                }
            }
        });


        return res;
    }

    public Set<String> splitStr(String str){


        Set<String> set = new HashSet<>();

        for (Character c : str.toCharArray()){
            if (set.contains(c.toString())){
                // 特殊处理 L存在 则存储 LL
                String s = c.toString();
                do {
                    s = s + c.toString();
                }while (set.contains(s));
                set.add(s);
            }else {
                set.add(c.toString());
            }
        }
        return set;

    }

    public static void main(String[] args) {
        System.out.println(new Solution().commonChars(new String[]{}));
    }
}
