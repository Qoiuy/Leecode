package P_476_数字的补数;

public class Solution {

//    &1

    public int findComplement(int num) {

        int count = 0, res = 0;
        for (;num != 0; num = (num >> 1)){
            res += ( 1 - ( num & 1) ) << count++ ;
        }
        return res;
    }

    public static void main(String[] args) {
//        System.out.println(new Solution().findComplement(10));;
        System.out.println(new Solution().findComplement(5));;
//        System.out.println(new Solution().findComplement(1));;
    }
}
