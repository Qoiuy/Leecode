package P_58_最后一个单词的长度;

public class Solution {

    public int lengthOfLastWord(String s) {

        if (s == null || "".equals(s)){
            return  0;
        }
        //如果不存在最后一个单词，请返回 0 。表示的竟然值末尾为 ' ' 不对。竟然表示s==null;md
        char[] c = s.toCharArray();
        int count = 0, length = c.length;

        //先去尾
        for (int i = length - 1; i>= 0; i --){
            if (c[i] == ' '){
                length --;
            }else {
                break;
            }
        }

        //再计算
        for (int i = length - 1; i>=0 ;i--){
            if (c[i] == ' '){
                break;
            }else {
                count ++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLastWord("Hello World"));
        System.out.println(new Solution().lengthOfLastWord(" a"));
        System.out.println(new Solution().lengthOfLastWord("a"));
        System.out.println(new Solution().lengthOfLastWord("a "));
    }
}

