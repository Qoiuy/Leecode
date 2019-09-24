package P_258_各位相加;

public class Solution {

    public int addDigits(int num) {


        int count = 0;
        for (int i = num; ; ){
            if (i < 10){
                count += i;
                if (count >= 10){
                    count = count - 10 + 1;
                }
                break;
            }
            count += i % 10;
            if (count >= 10){
                count = count - 10 + 1;
            }
            i = i / 10;

        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(3/10);
    }
}
