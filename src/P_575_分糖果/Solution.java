package P_575_分糖果;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int distributeCandies(int[] candies) {


        Set<Integer> set =new HashSet<>();
        for (int i: candies){
            set.add(i);
        }
        return set.size() >  ( candies.length / 2 ) ?  ( candies.length / 2 ) : set.size();


    }
}
