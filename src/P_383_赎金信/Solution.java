package P_383_赎金信;

import java.util.Arrays;

public class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {

        int[] rCount = new int[26];
        int[] mCount = new int[26];
        Arrays.fill(rCount, 0);
        Arrays.fill(mCount, 0);

        for (char c : ransomNote.toCharArray()){
            rCount[c - 'a'] ++;
        }
        for (char c : magazine.toCharArray()){
            mCount[c - 'a'] ++;
        }
        for (int i = 0 ; i < 26; i++){

            if (rCount[i] > mCount[i]){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(new Solution().canConstruct("aa", "aab"));
    }
}
