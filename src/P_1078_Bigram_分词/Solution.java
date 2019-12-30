package P_1078_Bigram_分词;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        String[] res = new Solution().findOcurrences("alice is a good girl she is a good student", "a", "good");
        for (String s : res){
            System.out.println(s);
        }
    }

    public String[] findOcurrences(String text, String first, String second) {
        List<String> list = new ArrayList<>();

        char[] textChars = text.toCharArray();
        char[] fisrtChars = first.toCharArray();
        char[] secondeChars = second.toCharArray();

        for (int i = 0; i < textChars.length; i++){
            if (i == 0 || textChars[i] == ' '){
                String res = check(textChars, fisrtChars, secondeChars, i == 0 ? 0:i+1);
                if (res != null){
                    list.add(res);
                }
            }
        }
        return list.toArray(new String[list.size()]);

    }

    private String check(char[] textChars, char[] fisrtChars, char[] secondeChars, int local) {

        int textLength = textChars.length;
        for (int i = 0; i < fisrtChars.length; i++){
            if (local + i < textLength ){
                if (fisrtChars[i] != textChars[local + i]){
                    return null;
                }
            }else {
                return null;
            }

        }

        for (int i = 0; i < secondeChars.length; i++){
            if (local + fisrtChars.length + i + 1 < textLength){
                if (secondeChars[i] != textChars[local + fisrtChars.length + i + 1]){
                    return null;
                }
            }else {
                return null;
            }

        }
        if ( local + fisrtChars.length + secondeChars.length + 2 == textLength){
            return null;
        }
        StringBuffer sb = new StringBuffer();
        for (int i = local + fisrtChars.length + secondeChars.length + 2 ; i < textLength; i++){
            if (textChars[i] == ' '){
                return sb.toString();
            }
            sb.append(textChars[i]);
        }
        return sb.toString();
    }
}
