package P_367_有效的完全平方数;

public class Solution {
    public boolean isPerfectSquare(int num) {


        for ( int i = 1;i <=46340; i++){
            int t = i * i;
            if (t == num){
                return true;
            } else if (t >num){
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
