package P_961_重复_N_次的元素;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int repeatedNTimes(int[] A) {

        Set<Integer> set =new HashSet<>();
        for (int i : A){

            if(!set.add(i)){
                return i;
            }

        }
        return 0;
    }
}
