package P_824_山羊拉丁文;

import java.util.HashSet;

public class Solution {

    public String toGoatLatin(String S) {

        HashSet<String> aeiou = new HashSet<String>(){{
            add("a");
            add("i");
            add("e");
            add("o");
            add("u");
            add("A");
            add("I");
            add("E");
            add("O");
            add("U");
        }};

        String[] sp = S.split(" ");

        int eCount = 1;

        StringBuffer result = new StringBuffer();
        for (String s: sp){
            result.append(result.length() == 0 ? "": " ");
            if (!aeiou.contains(s.substring(0, 1))){
                result.append(s.substring(1)).append((s.substring(0, 1)));
            }else {
                result.append(s);
            }
           result.append("ma").append(eCountA(eCount++, 'a'));

        }
        return result.toString();

    }

    private char[] eCountA(int eCount, char a) {
        char[] c = new char[eCount];
        for (int i =0 ; i< eCount; i++){
            c[i] = a;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().toGoatLatin("I speak Goat Latin"));
//        Imaa peaksmaa oatGmaa atinLmaa
//        "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
//         Imaa peaksmaaa oatGmaaaa atinLmaaaaa
    }
}
