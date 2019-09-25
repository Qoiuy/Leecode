package P_929_独特的电子邮件地址;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int numUniqueEmails(String[] emails) {

        Set<String > set = new HashSet<>();
        for (String str : emails){

            String[] ss = str.split("@");
            StringBuffer localName = new StringBuffer();
            for (int i = 0; i < ss[0].length(); i ++){
                if (ss[0].charAt(i) == '+'){
                    break;
                }else if (ss[0].charAt(i) == '.'){
                    continue;
                }else {
                    localName.append(ss[0].charAt(i));
                }
            }
            set.add(localName.toString() + "@" + ss[1]);
        }
        return set.size();
    }
}
