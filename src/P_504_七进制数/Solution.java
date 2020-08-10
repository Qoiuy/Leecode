package P_504_七进制数;

public class Solution {
    public String convertToBase7(int num) {

        StringBuffer sb = new StringBuffer();
        boolean flag = num < 0;
        num = Math.abs(num);

        while ( num >=7 ){
            sb.append(num % 7 );
            num = num / 7;
        }
        sb.append(num);

        if (flag){
            sb.append("-");
        }
        return sb.reverse().toString();

    }

    public static void main(String[] args) {
        System.out.println(new Solution().convertToBase7(100));
    }
}
