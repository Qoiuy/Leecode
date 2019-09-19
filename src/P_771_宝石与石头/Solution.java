package P_771_宝石与石头;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int numJewelsInStones(String J, String S) {

        int gemTotal = 0;
        Set<Character> gem = getGem(J);

        for (int i = 0; i < S.length(); i++) {
            if (gem.contains(S.charAt(i))) {
                gemTotal++;
            }
        }

        return gemTotal;
    }

    private HashSet<Character> getGem(String J) {
        return new HashSet<Character>() {{
            for (int i = 0; i < J.length(); i++) {
                add(J.charAt(i));
            }
        }};
    }

}
