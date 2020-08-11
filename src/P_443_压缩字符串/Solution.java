package P_443_压缩字符串;

public class Solution {
    public int compress(char[] chars) {
        int flag = 1; // 用于记录当前重复的字符串
        int count = 0;

        for (int i = 1 ; i < chars.length; i++){
            if (chars[i] == chars[i-1]){
                flag++;
            }else {
                count += appendFlagAndReturnFlag(chars, flag, i - flag - count, chars[i-1]);
                flag = 1 ;
            }
        }
        count += appendFlagAndReturnFlag(chars, flag, chars.length - flag - count, chars[chars.length-1]);

        return chars.length - count;
    }

    /**
     *  将业务转移到 这部分 让核心代码干净一些
     * @param chars 要被修改的char
     * @param flag 要被添加的内容
     * @param start 被修改开始位置
     * @param c 当前的char
     * @return
     */
    private int appendFlagAndReturnFlag(char[] chars, int flag, int start, char c){
        chars[start] = c;
        if (flag == 1){
            return 0;
        }
        char[] flagC = intToChar(flag);

        for (int i = 0; i < flagC.length; i++){
            chars[start + i + 1] = flagC[i];
        }

        return flag - flagC.length - 1;

    }

    private char[] intToChar(int flag) {
//        主要是为了处理 大于 9的数字变成char数组
        if (flag < 10){
            return new char[]{(char)(flag + '0')};
        }else if (flag < 100){
            return new char[]{(char)(flag/10 + '0'),(char)(flag%10 + '0') };
        }else if (flag < 1000){
            return new char[]{(char)(flag/100 + '0'),(char)(flag/10%10 + '0') ,(char)(flag%10 + '0') };
        }else {
            return new char[]{'1', '0', '0', '0'};
        }
    }

    public static void main(String[] args) {
//        System.out.println(new Solution().compress(new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'}));
//        System.out.println(new Solution().compress(new char[]{'a','a','b','b','c','c','c'}));
        System.out.println(new Solution().compress(new char[]{'a','a','a','b','b','a','a'}));

    }
}
