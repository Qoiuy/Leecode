package P_811_子域名访问计数;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {

    public List<String> subdomainVisits(String[] cpdomains) {

        List<String> res = new ArrayList<>();

        HashMap<String, Integer> map = new HashMap<>();

        for (String s : cpdomains){


            String[] ss = s.split(" ");
            String[] domain =  ss[1].split("\\.");
            for (int i = domain.length - 1; i >= 0; i--){

                StringBuffer tmpDomain = new StringBuffer();
                for (int j = i; j < domain.length; j++){
                    tmpDomain.append(tmpDomain.length() == 0 ? "" : ".").append(domain[j]);
                }

                if (map.containsKey(tmpDomain.toString())){
                    map.put(tmpDomain.toString(), map.get(tmpDomain.toString()) + Integer.parseInt(ss[0]));
                }else {
                    map.put(tmpDomain.toString(), Integer.parseInt(ss[0]));
                }
            }

        }

        map.forEach((key, value) -> res.add(value + " " + key));
        return res;
    }

    public static void main(String[] args) {
        new Solution().subdomainVisits(new String[]{"9001 discuss.leetcode.com"});
    }
}
