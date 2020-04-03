package P_14_最长公共前缀;

public class Solution {

    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 1){
            return strs[0];
        }

        if (strs.length == 0 || strs[0].length() == 0) {
            return "";
        }

        char[] prefix = strs[0].toCharArray();
        int length = prefix.length;

        for (String str : strs) {
            char[] currStr = str.toCharArray();
            for (int i = 0; i < length; i++) {
                if (i >= currStr.length || currStr[i] != prefix[i]) {
                    length = i ;
                    break;
                }
            }
        }

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < length; i++) {
            stringBuffer.append(prefix[i]);
        }

        return stringBuffer.toString();

    }


    public static void main(String[] args) {
//        String[] strings = new String[]{"flower","flow","flight"};
        String[] strings = new String[]{ "c","c","c"} ;
        System.out.println( new Solution().longestCommonPrefix(strings));
    }
}
