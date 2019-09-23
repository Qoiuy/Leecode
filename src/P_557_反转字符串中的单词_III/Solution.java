package P_557_反转字符串中的单词_III;

public class Solution {

    public String reverseWords(String s) {


        String[] strings = s.split(" ");

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < strings.length; i ++){

            stringBuffer.append(stringBuffer.length() == 0 ? "" : " ");
            String tmp = strings[i];
            for (int j = tmp.length() - 1; j >= 0; j--){
                stringBuffer.append(tmp.charAt(j));
            }
        }

        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().reverseWords("Let's take LeetCode contest"));
    }
}
