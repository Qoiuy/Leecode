package P_67_二进制求和;

public class Solution {

    public String addBinary(String a, String b) {

        int len = Math.max(a.length(), b.length());

        StringBuilder stringBuffer = new StringBuilder();
        for (int i = 0; i < len; i++){

            //处理进位部分
            char[] curr = add(
                    //进位部分
                    (isOutOfArray(i, stringBuffer.length()) ? 1 : 0 )
                            + getCurr(a, i)
                            + getCurr(b, i));

            //修正
            if (isOutOfArray(i, stringBuffer.length())){
                stringBuffer.delete(i, i + 1);
            }

            //加入结果
            stringBuffer.append(curr);
        }

        //使用stringBuffer.reverse方法反转成正确的结果
        return stringBuffer.reverse().toString();
    }

    //  判断是否越界
    private boolean isOutOfArray(int i, int length) {
        return length > i;
    }

    // 将计算结果转化成append内容
    private char[] add(int init) {
        if (init == 0){
            return new char[]{'0'};
        } else if ( init == 1){
            return new char[]{'1'};
        } else if ( init == 2){
            return new char[]{'0', '1'};
        } else {
            return new char[]{'1', '1'};
        }
    }

    //    取字符串中的值 这里处理了越界部分
    private int getCurr(char[] chars, int i){

        if (i >= chars.length){
            return 0;
        }

        return chars[chars.length - i - 1] == '0' ? 0 : 1;
    }
    //    取字符串中的值 这里处理了越界部分
    private int getCurr(String  str, int i){

        if (i >= str.length()){
            return 0;
        }

        return str.charAt( str.length() - i - 1) == '0' ? 0 : 1;
    }


    public static void main(String[] args) {


        test1();

        test2();

    }

    private static void test2() {
        System.out.println(new Solution().addBinary("11", "1"));
    }

    private static void test1() {
        System.out.println(new Solution().addBinary("1011", "1010"));
//        10101 = > 1010110

    }
}
