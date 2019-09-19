package P_1108_IP_地址无效化;

public class Solution {

    public String defangIPaddr(String address) {

//        return question1(address);
        String[] sp = address.split("\\.");
        StringBuffer res = new StringBuffer() ;
        for (String s: sp) {
            res.append(res.length() == 0 ? "" : "[.]").append(s);
        }

        return res.toString();
    }

    private String question1(String address) {
        return address.replaceAll("\\.", "[.]");
    }

    public static void main(String[] args) {
        System.out.println(new Solution().defangIPaddr("1.1.1.1"));;
    }
}

