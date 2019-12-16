package P_LCP_1_猜数字;

public class Solution {

    public int game(int[] guess, int[] answer) {

        int length = answer.length > guess.length ? guess.length : answer.length,result = 0 ;
        for (int i = 0; i< length; i++){

            if (guess[i] == answer[i]){
                result ++;
            }
        }
        return result;

    }
}
