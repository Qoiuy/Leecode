package P_784_字母大小写全排列;

import com.sun.tools.classfile.ConstantPool;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    List<String> result = new ArrayList<>();
    Map<Integer, Integer> position = new HashMap<>();

    public List<String> letterCasePermutation(String S) {

        char[] chars = S.toCharArray();

        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] >= 'a' && chars[i] <= 'z') || chars[i] >= 'A' && chars[i] <= 'Z') {
                position.put(count++, i);
            }
        }

        handleData(chars, position.size());
        result.add(S);
        return result;
    }

    public void handleData(char[] chars, int i) {

        if (i == 0) {
            return;
        }
        if (i == 1) {
            change(chars, 0);
            return;
        }

        handleData(chars, i - 1);
        change(chars, i - 1);
        handleData(chars, i - 1);

    }

    private void change(char[] chars, int i) {
        i = position.get(i);

        if (chars[i] >= 'a' && chars[i] <= 'z') {
            chars[i] = (char) (chars[i] - 32);
        } else if (chars[i] >= 'A' && chars[i] <= 'Z') {
            chars[i] = (char) (chars[i] + 32);
        }
        result.add(String.valueOf(chars));
    }


    public static void main(String[] args) {

        System.out.println(new Solution().letterCasePermutation("a1b2").toString());
        System.out.println(new Solution().letterCasePermutation("12345").toString());

    }

}
