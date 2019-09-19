package P_1108_IP_地址无效化;

public class Solution {

    public String defangIPaddr(String address) {

        return address.replaceAll("\\.", "[.]");
    }

    public static void main(String[] args) {
        new Solution().defangIPaddr("1.1.1.1");
    }
}

