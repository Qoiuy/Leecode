package P_28_实现_strStr;

public class Solution {

    public int strStr(String haystack, String needle) {

        //长度极短值处理
        if ( needle.length() == 0 ){
            return 0;
        }
        //needle长度大于haystack处理
        if (needle.length() > haystack.length()){
            return -1;
        }
        char[] stack = haystack.toCharArray();
        char[] n = needle.toCharArray();
        int max = stack.length;
        for (int i = 0 ; i < max; i++){
            if (stack[i] == n[0] && check(stack, n, i, max)){
                return i;
            }
        }
        return -1;
    }

    public boolean check(char[] haystack, char[] needle,int curr,  int aMax){
        for (int i = 0; i < needle.length; i++){
            //越界处理
            if (curr + i == aMax - 1){
                return i == needle.length - 1 && haystack[curr + i] == needle[i];
            }
            if (haystack[curr+i] != needle[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.printf(""+ new Solution().strStr("mississippi",
                "issipi"));
    }
}
