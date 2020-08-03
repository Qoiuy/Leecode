package P_520_检测大写字母;

public class Solution {

    public boolean detectCapitalUse(String word) {
        if (word.length() <= 1){
            return true;
        }
        int upper=0, lower=0;

        char[] chars = word.toCharArray();

        for (int i = 1; i < chars.length; i++){
            if(isUpper(chars[i])){
                upper++;
            }else {
                lower++;
            }
        }

        if (upper != 0  && lower != 0){
            return false;
        }

        if (lower != 0){
            return true;
        }

        return isUpper(chars[0]);

    }

    private boolean isUpper(char aChar) {
        return aChar >= 'A' && aChar <='Z';
    }

}
