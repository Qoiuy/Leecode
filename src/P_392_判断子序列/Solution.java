package P_392_判断子序列;

import java.util.Stack;
import java.util.regex.Pattern;

public class Solution {

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


    public boolean FailisSubsequenceByStringReplace(String s, String t) {
        //超时
        StringBuffer stringBuffer = new StringBuffer();
        for (Character c : s.toCharArray()) {
            stringBuffer.append(stringBuffer.length() == 0 ? "" : ".*").append(c);
        }
        final int tmp = t.length();
        return tmp != t.replaceAll(stringBuffer.toString(), "").length();
    }

    public boolean FailisSubsequenceByRegular(String s, String t) {

        //leetcode 结果和我自己的不一样
        StringBuffer stringBuffer = new StringBuffer();
        for (Character c : s.toCharArray()) {
            stringBuffer.append(stringBuffer.length() == 0 ? "" : ".*").append(c);
        }
        return Pattern.compile(stringBuffer.toString()).matcher(t).find();

    }

    public static void main(String[] args) {
        System.out.println(new Solution().isSubsequence("abc", "ahbgdc"));
        System.out.println(new Solution().isSubsequence("axc", "ahbgdc"));
    }
}
