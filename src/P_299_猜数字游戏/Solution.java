package P_299_猜数字游戏;

import java.util.Arrays;
import java.util.Map;

public class Solution {
    public String getHint(String secret, String guess) {

        int bulls = 0;
        int[] cowsX = new int[10];
        int[] cowsY = new int[10];
        Arrays.fill(cowsX, 0);
        Arrays.fill(cowsY, 0);

        char[] s = secret.toCharArray();
        char[] g = guess.toCharArray();

        for (int i = 0 ;i < s.length ; i++){
            if(s[i] == g[i]){
                bulls++;
                continue;
            }
            cowsX[s[i] - '0']++;
            cowsY[g[i] - '0']++;
        }
        int cows = 0;
        for (int i = 0; i< 10;i++){
            if (cowsX[i]>0 && cowsY[i] > 0){
                cows += Math.min(cowsX[i], cowsY[i]);
            }
        }
        return bulls + "A" + cows + "B";

    }

    public static void main(String[] args) {
        System.out.println(new Solution().getHint("1123",
                "0111"));
    }

}
