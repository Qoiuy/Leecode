package P_784_字母大小写全排列;

import com.sun.tools.classfile.ConstantPool;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    static List<String> result = new ArrayList<>();

    public static List<String> letterCasePermutation(String S) {

//        Character[] characters = new Character[S.length()];
//
//        char[] chars = S.toCharArray();
//        for (int i = 0; i < characters.length; i++) {
//            res1.add(change(chars, i));
//        }

        handleData(S.toCharArray(), S.length());
        result.add(S);
        return result;
    }

    public static void handleData(char[] chars, int i){
//        System.out.println("i:" + i);
        if (i == 0){
            return;
        }
        if ( i == 1){
            change(chars, 0);
            return;
        }

        handleData(chars, i - 1);
        change(chars, i - 1);
        handleData(chars, i - 1);

    }

    private static void change(char[] chars, int i) {

        if (chars[i] >= 'a' && chars[i] <= 'z') {
            chars[i] = (char) (chars[i] - 32);
        } else if (chars[i] >= 'A' && chars[i] <= 'Z') {
            chars[i] = (char) (chars[i] + 32);
        }
        result.add(String.valueOf(chars));
    }


    public static void main(String[] args) {

        String s = "abcd";

        System.out.println(letterCasePermutation(s).toString());

    }

}
