package P_693_交替位二进制数;

public class Solution {

    public static boolean hasAlternatingBits(int n) {
        if ( n == 0){
            return true;
        }

        int tmp = n >> 1;
        //tmp最右侧 为 1
        if ((tmp | 1) == tmp) {
            return ((tmp << 1)) == n  && hasAlternatingBits( n >> 1);
        }
        return ((tmp << 1) + 1) == n && hasAlternatingBits( n >> 1);


    }

    public static void main(String[] args) {
        System.out.println(hasAlternatingBits(6));
        System.out.println(hasAlternatingBits(5));
    }
}
