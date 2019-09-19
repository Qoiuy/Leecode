package numPairsDivisibleBy60;

public class Solution {

    public static void main(String[] args) {
        int[] tmp = {30,20,150,100,40};
        Solution s = new Solution();
        System.out.println(s.numPairsDivisibleBy60(tmp));
    }
    public int numPairsDivisibleBy60(int[] time) {

        int[] newTime = new int[60];

        for (int i = 0; i < time.length ; i ++){
            int tmp = time[i] % 60;
            newTime[tmp] ++;
        }

        int sum = 0;
        for (int i = 1; i < 30; i ++){
            sum += (newTime[i] * newTime[60 - i]);
        }

        return sum + dealCount0Or30(newTime[30]) + dealCount0Or30(newTime[0]);

    }

    public int dealCount0Or30(int num){
        int result = 0;
        for (int i = 0; i < num; i ++){
            result += i;
        }

        return result;
    }

}
