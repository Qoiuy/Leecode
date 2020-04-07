package P_125_验证回文串;

public class Solution {

    public boolean isPalindrome(String s) {

        if (s.length() == 0 || s.length() == 1){
            return true;
        }

        for (int i =0 ,j =s.length() - 1; i <= j; i ++, j--){

            //找到前面的字符
            char charI = s.charAt(i),charJ = s.charAt(j);
            while (i <= j) {
                charI = s.charAt(i);
                if (isChar(charI)){
                    break;
                }
                i ++;
            }

            while (i <= j) {
                charJ = s.charAt(j);
                if (isChar(charJ)){
                    break;
                }
                j --;
            }

            if (!isChar(charI) || !isChar(charJ)){
                return true;
            }

            //统一变为小写
            charI = down(charI);
            charJ = down(charJ);
            if (charI != charJ){
                return false;
            }


        }

        return true;
    }

    private char down(char charI) {
        if (isAz(charI)){
            if (charI >= 'a' && charI <= 'z'){
                return (char) (charI - ('a' - 'A'));
            }
        }
        return charI;
    }

    private boolean isChar(char charJ) {
        return (charJ >= 'a' && charJ <= 'z') || (charJ >= 'A' && charJ <= 'Z') || (charJ >= '0' && charJ <= '9');
    }

    private boolean isAz(char charJ) {
        return (charJ >= 'a' && charJ <= 'z') || (charJ >= 'A' && charJ <= 'Z');
    }

    public static void main(String[] args) {

        test1("0P");
        test1(".");
        test1(".,");
        test1("OP");
        test1("A man, a plan, a canal: Panama");
        test1("race a car");
    }

    private static void test1(String s) {
        System.out.println(new Solution().isPalindrome(s));
    }
}
