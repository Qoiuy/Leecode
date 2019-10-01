package P_806_写字符串需要的行数;

public class Solution {

    public int[] numberOfLines(int[] widths, String S) {


        int count = 0, line =0;
        for (int i = 0; i < S.length(); i++){
            count += widths[S.charAt(i) - 'a'];
            if (count > 100){
                count = widths[S.charAt(i) - 'a'];
                line ++;
            }else if (count == 100){
                count = 0;
                line ++;
            }
        }
        if(count != 0){
            line ++;
        }

        return new int[]{line, count};
    }

    public static void main(String[] args) {
        System.out.println(new Solution().numberOfLines(new int[]{4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10}, "bbbcccdddaaa"));
    }

}
