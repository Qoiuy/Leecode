package P_728_自除数;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> list = new ArrayList<>();

        for (int i = left; i <= right; i++){
            if (isSelfDividingNumber(i)){
                list.add(i);
            }
        }
        return list;
    }
    boolean isSelfDividingNumber(int i){

        boolean re =  true;

        int tmp = i;
        for (;tmp >= 10;tmp = tmp / 10){
            if (tmp % 10 == 0){
                re = false;
            }
            re = re && ((i % (tmp % 10)) == 0);
        }
        return re && (i % tmp == 0);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().selfDividingNumbers(21,22).toString());
    }
}
