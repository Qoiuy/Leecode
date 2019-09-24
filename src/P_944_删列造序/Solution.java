package P_944_删列造序;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    Map<Character, Integer> map;
    {
     map = init();
    }
    public int minDeletionSize(String[] A) {

        if (A.length == 0 || A.length == 1){
            return 0;
        }
        String tmp = A[0];
        int res = 0;
        for (int i = 0; i < tmp.length(); i++){
            res += (isDelete(A,  i) ? 1 : 0);
        }
        return res;
    }

    private boolean isDelete(String[] A, int i) {
        int count = -1;
        System.out.println("A.length:" + A.length + "" );
        for (int j = 0; j < A.length; j++){
            System.out.println("j: "+j+ " A[j].charAt(i): " + A[j].charAt(i) + "  count:" +count);
            if (map.get(A[j].charAt(i)) <= count){
                return true;
            } else {
                count = map.get(A[j].charAt(i));
            }
        }
        return false;
    }

    public Map<Character, Integer> init(){
        return new HashMap<Character, Integer>(){{
            for(int i = 0; i < 26; i++){
                put((char)('a' + i), i);
            }
        }};
    }

    public static void main(String[] args) {
        System.out.println(new Solution().minDeletionSize(new String[]{"rrjk","furt","guzm"}));
//        System.out.println(new Solution().minDeletionSize(new String[]{"cba","daf","ghi"}));
    }


}
