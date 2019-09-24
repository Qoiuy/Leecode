package P_171_Excel表列序号;

public class Solution {

    public int titleToNumber(String s) {


        int count = 0;
        for (int i = 0; i < s.length(); i++){
            count += (Math.pow(26, s.length() - i - 1) * (s.charAt(i) - 'A' + 1)) ;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().titleToNumber("A"));
        System.out.println(new Solution().titleToNumber("AA"));
        System.out.println(new Solution().titleToNumber("BA"));
    }
}
