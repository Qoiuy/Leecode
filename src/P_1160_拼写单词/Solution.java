package P_1160_拼写单词;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    public int countCharacters(String[] words, String chars) {

        Map<Character, Integer> map = new HashMap<>();

        for (Character c : chars.toCharArray()) {
            map.put(c, map.containsKey(c) ? (map.get(c) + 1) : 1);
        }


        int count = 0;
        for (String s : words) {

            Map<Character, Integer> tmp = new HashMap<>();
            boolean flag = true;
            for (Character c : s.toCharArray()) {
                if (!map.containsKey(c)) {
                    flag = false;
                    break;
                } else {
                    tmp.put(c, tmp.containsKey(c) ? (tmp.get(c) + 1) : 1);
                    if (tmp.get(c) > map.get(c)) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                count += s.length();
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().countCharacters(new String[]{"dyiclysmffuhibgfvapygkorkqllqlvokosagyelotobicwcmebnpznjbirzrzsrtzjxhsfpiwyfhzyonmuabtlwin",
                "ndqeyhhcquplmznwslewjzuyfgklssvkqxmqjpwhrshycmvrb",
                "ulrrbpspyudncdlbkxkrqpivfftrggemkpyjl",
                "boygirdlggnh",
                "xmqohbyqwagkjzpyawsydmdaattthmuvjbzwpyopyafphx",
                "nulvimegcsiwvhwuiyednoxpugfeimnnyeoczuzxgxbqjvegcxeqnjbwnbvowastqhojepisusvsidhqmszbrnynkyop",
                "hiefuovybkpgzygprmndrkyspoiyapdwkxebgsmodhzpx",
                "juldqdzeskpffaoqcyyxiqqowsalqumddcufhouhrskozhlmobiwzxnhdkidr",
                "lnnvsdcrvzfmrvurucrzlfyigcycffpiuoo",
                "oxgaskztzroxuntiwlfyufddl",
                "tfspedteabxatkaypitjfkhkkigdwdkctqbczcugripkgcyfezpuklfqfcsccboarbfbjfrkxp",
                "qnagrpfzlyrouolqquytwnwnsqnmuzphne",
                "eeilfdaookieawrrbvtnqfzcricvhpiv",
                "sisvsjzyrbdsjcwwygdnxcjhzhsxhpceqz",
                "yhouqhjevqxtecomahbwoptzlkyvjexhzcbccusbjjdgcfzlkoqwiwue",
                "hwxxighzvceaplsycajkhynkhzkwkouszwaiuzqcleyflqrxgjsvlegvupzqijbornbfwpefhxekgpuvgiyeudhncv",
                "cpwcjwgbcquirnsazumgjjcltitmeyfaudbnbqhflvecjsupjmgwfbjo",
                "teyygdmmyadppuopvqdodaczob",
                "qaeowuwqsqffvibrtxnjnzvzuuonrkwpysyxvkijemmpdmtnqxwekbpfzs",
                "qqxpxpmemkldghbmbyxpkwgkaykaerhmwwjonrhcsubchs"}, "usdruypficfbpfbivlrhutcgvyjenlxzeovdyjtgvvfdjzcmikjraspdfp"));
    }
}
