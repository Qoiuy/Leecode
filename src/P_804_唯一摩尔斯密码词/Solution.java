package P_804_唯一摩尔斯密码词;

import java.util.*;

public class Solution {

    public int uniqueMorseRepresentations(String[] words) {

        Map<Character, String> morse = initMorse();

        Set<String> res = new HashSet<>();

        for (int i = 0; i < words.length; i ++){
            res.add(coverWord(words[i], morse));
        }

        return res.size();

    }

    private String coverWord(String word, Map<Character, String> morse) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int j = 0; j < word.length(); j++){
            stringBuffer.append(morse.get(word.charAt(j)));
        }
        return stringBuffer.toString();
    }


    private Map<Character, String> initMorse() {
        String[] morseS = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        Map<Character, String> morseMap = new HashMap<Character, String>() {{
            List<String> morseList = Arrays.asList(morseS);
            for (int i = 0; i < morseList.size(); i++){
                put((char) ('a' + i), morseList.get(i));
            }
        }};
        return morseMap;
    }

    public static void main(String[] args) {
        String[] strings = new String[]{"gin", "zen", "gig", "msg"};

        Map<Character, String> morse = new Solution().initMorse();
//        morse.entrySet().forEach(p -> System.out.println("map " + p.getKey() + " "+ p.getValue()));

        System.out.println(new Solution().uniqueMorseRepresentations(strings));
    }

}
