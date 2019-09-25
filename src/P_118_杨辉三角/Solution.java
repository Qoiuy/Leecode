package P_118_杨辉三角;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i <= numRows; i ++){
            List<Integer> tmp = new ArrayList<>();
            for ( int j = 0; j < i; j++){
                if (i == 0 || j == 0 || j == i - 1){
                    tmp.add(1);
                }else {
                    tmp.add(res.get(i - 1).get(j -1) + res.get(i-1).get(j));
                }

            }

                res.add(tmp);

        }
        res.removeIf(p -> p.size() == 0);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().generate(5).toString());;
    }
}
