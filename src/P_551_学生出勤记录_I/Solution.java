package P_551_学生出勤记录_I;

public class Solution {

    public boolean checkRecord(String s) {

        int Acount = 0 ;
        int LCount = 0 ;
        for (char c: s.toCharArray()){
            if (c == 'L'){
                LCount++;
                if (LCount >= 3){
                    return false;
                }
            } else if (LCount > 0){
                LCount=0;
            }

            if (c == 'A'){
                Acount ++ ;
                if (Acount >= 2){
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

//        System.out.println(new Solution().checkRecord("PPALLL"));
        System.out.println(new Solution().checkRecord("LLPLLPLPPLLPLPLPPPLPLPLPPPLPPP"));
    }
}

