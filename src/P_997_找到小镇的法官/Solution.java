package P_997_找到小镇的法官;

public class Solution {


    public int findJudge(int N, int[][] trust) {
        int[] res = new int[N];

        for (int i = 0; i < trust.length; i++){

            res[trust[i][0] - 1] = -1;
            if (res[trust[i][1] - 1] == -1 ){
                continue;
            }
            res[trust[i][1] - 1] ++ ;
        }

        for ( int i = 0 ; i < N; i++){
            if (res[i] == N - 1){
                return i + 1;
            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        new Solution().findJudge(2,  new int[][]{{1, 2}});
    }
}
