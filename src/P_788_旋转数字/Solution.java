package P_788_旋转数字;

public class Solution {

    public int rotatedDigits(int N) {
        int flag = 0;
        for (int i = 0; i<=N; i++){
            if (isX(i)){
                System.out.println(i);
                flag++;
            }
        }
        return flag;

    }

    private boolean isX(int i) {
        boolean is2569 = false;
        while ( i > 9){
            if (!is0182569(i % 10)) {
                break;
            }
            if (is2569(i % 10)){
                is2569=true;
            }
            i = i / 10;
        }

        if (i > 9){
            return false;
        }

        if (is0182569(i)){
            return is2569(i)|| is2569;
        }
        return false;

    }

    private boolean is2569(int i) {
        return i == 2 || i == 5 || i == 6 || i == 9;
    }
    private boolean is0182569(int i) {
        return i != 3 && i != 4 && i != 7;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().rotatedDigits(857));;
        System.out.println(new Solution().rotatedDigits(10));;
    }


}
