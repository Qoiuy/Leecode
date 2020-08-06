package P_278_第一个错误的版本;

public class Solution {

    
    public int firstBadVersion(int n) {
        int start = 0, end = n ;



        while (end - start > 2){

//            int mid = (start + end ) / 2 + 1;
//            System.out.println("start : " + start + " , end : " + end);
            int mid = start + ( end - start) / 2;

            if (!isBadVersion(mid)){
                start = mid;
            }else {
                end = mid;
            }

        }
        for ( int i = start; i <= end; i++){
            if (isBadVersion(i)){
                return i;
            }
        }

        return start;

    }



    private boolean isBadVersion(int mid) {
        System.out.println("mid : " + mid);
        if (mid >= 1702766719){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().firstBadVersion(2126753390
                ));;
    }

}
