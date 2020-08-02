package P_1323_6和9组成的最大数字;

public class Solution {

    public int maximum69Number (int num) {

        String str = num + "";
        StringBuffer result  = new StringBuffer();
        boolean flag = true; //可以替换
        for (char c : str.toCharArray()){
            if (flag){
                if ('9' != c){
                    result.append('9');
                    flag = false;
                }else {
                    result.append(c);
                }
            }else {
                result.append(c);
            }
        }
        return Integer.parseInt(result.toString());
    }
}
