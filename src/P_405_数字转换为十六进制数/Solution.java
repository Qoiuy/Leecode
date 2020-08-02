package P_405_数字转换为十六进制数;


import java.util.HashMap;
import java.util.Map;

public class Solution {
    Map<String, Character> hex = new HashMap<String, Character>(){{
        put("0", '0');
        put("1", '1');
        put("00", '0');
        put("01", '1');
        put("10", '2');
        put("11", '3');
        put("000", '0');
        put("001", '1');
        put("010", '2');
        put("011", '3');
        put("100", '4');
        put("101", '5');
        put("110", '6');
        put("111", '7');
        put("0000", '0');
        put("0001", '1');
        put("0010", '2');
        put("0011", '3');
        put("0100", '4');
        put("0101", '5');
        put("0110", '6');
        put("0111", '7');
        put("1000", '8');
        put("1001", '9');
        put("1010", 'a');
        put("1011", 'b');
        put("1100", 'c');
        put("1101", 'd');
        put("1110", 'e');
        put("1111", 'f');
    }};

    public String toHex(int num) {

        if (num == 0){
            return "0";
        }

        // 10 => 2
        String bitStr = intToBitChar(num);

        // 2 => 16
        int len = bitStr.length();
        StringBuffer sb = new StringBuffer();

        for (int i = len; i > 0; i = i - 4 ) {
            sb.append(this.hex.get(bitStr.substring(Math.max((i - 4), 0), Math.max(i, 0) )));
        }

        return sb.reverse().toString();

    }

    /**
     * 一个数字转成二进制
     * @param num
     * @return
     */
    private String intToBitChar(int num) {
        StringBuffer sb = new StringBuffer();
        StringBuffer sbTmp = new StringBuffer();

        //  负数可以 用flag的方式判断处理

        //absNum 作为绝对值 后的num进行二进制操作。
        int absNum = Math.abs(num);

        // 取反加一   >>>> 加一
        if (num < 0){
            absNum = absNum - 1;
        }

        if (absNum == 0){
            sbTmp.append('0');
        }

        // 计算二进制
        while (absNum >= 1){
            sbTmp.append(absNum % 2 == 0 ? '0' : '1');
            absNum = absNum >> 1;
        }
        //取反操作
        for (char c : sbTmp.toString().toCharArray()){
            sb.append(num < 0 ? (char)('1' + '0' - c) : c);
        }

        if (num < 0){
            while (sb.length() < 32){
                sb.append('1');
            }
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
//        System.out.println(new Solution().toHex(26));
//        for (int i = 1; i<= 20; i++){
//            System.out.println(new Solution().toHex(i));
//        }
//        System.out.print(" " + new Solution().toHex(2));
//        System.out.println(new Solution().toHex(-3));
//        System.out.println(new Solution().toHex(8));
        for (int i = -1; i >=-20; i--){
            System.out.println(new Solution().toHex(i));
        }

//        System.out.println(new Solution().toHex(4294967295));
    }
}
