package P_893_特殊等价字符串组;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    public int numSpecialEquivGroups(String[] A) {

        Set<String> res = new HashSet<>();
        for (String str : A) {
            res.add(revertStr(str));

        }

        System.out.println(res.toString());
        return res.size();
    }

    /**
     * 和这个规则其实关系已经不大了。 我只要将奇偶位置上的字母，按照一定的顺序排列一下。 结果相同就代表
     */
    public String revertStr(String str) {

        if (str.equals("yx")){
            System.out.println();
        }

        Map<Character, Integer> char1 = new HashMap<>(), char2 = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                char2.put(str.charAt(i), char2.containsKey(str.charAt(i)) ? char2.get(str.charAt(i)) + 1 : 1);
            } else {
                char1.put(str.charAt(i), char1.containsKey(str.charAt(i)) ? char1.get(str.charAt(i)) + 1 : 1);
            }
        }

        StringBuffer stringBuffer1 = new StringBuffer(), stringBuffer2 = new StringBuffer();
        for (char i = 'a'; i <= 'z'; i++) {
            if (char1.containsKey(i)) {
                for (int j = 0; j < char1.get(i); j++) {
                    stringBuffer1.append(i);
                }
            }
            if (char2.containsKey(i)) {
                for (int j = 0; j < char2.get(i); j++) {
                    stringBuffer2.append(i);
                }
            }

        }
        return stringBuffer2.toString() + stringBuffer1.toString();

    }

    public static void main(String[] args) {
        System.out.println(new Solution().numSpecialEquivGroups(new String[]{"rr","vf","vr","vy","rq","po","ou","bt","mu","si","nd","jr","el","ei","yf","mo","jb","al","ai","al","pf","de","od","jj","qo","ko","ub","gx","ga","zj","ow","xz","vg","cc","zy","vu","cg","to","rg","yt","ab","tz","gl","gm","xt","rr","as","jb","oi","qz","wh","ob","xm","vf","fb","ce","ot","ju","tj","ow","nt","uk","sz","cp","ws","ui","cm","xm","kb","sb","ef","gz","at","uv","gd","kf","fn","wn","th","ix","jl","fl","gs","wa","ya","tk","po","wb","ka","iy","sa","ds","sy","uc","vs","wm","xo","yx","rh","ly","ub","sf","db","km","an","bl","xn","zq","dd","wm","zg","bj","zw","qu","xh","at","rh","zy","uv","ef","wb","rr","iy","ly","vf","sf","uc","sy","qz","cc","cc","ub","uc","ly","zg","uv","bt","km","ab","ix","ai","th","wm","ws","gd","xh","pf","zg","rh","xo","ai","km","rh","ub","xo","cp","oi","ub","yx","rh","vy","ix","cc","ai","fn","sy","qz","oi","po","kf","vf","ai","xo","an","po","cc","zy","bt","ab","tj","xm","si","zj","gl","oi","ix","ui","ab","ce","yt","nd","ai","uc","ai","uc","wa","si","po","uk","uv","as","oi","yf","at","ws","po","km","yt","tj","ai","al","po","oi","ai","ds","po","bt","po","fb","po","jb","ko","pf","ai","zg","ub","ds","uk","oi","al","nt","gs","zy","ai","tj","gx","po","vu","vf","al","ui","kf","rh","xm","bt","ui","mo","at","po","vu","qz","od","po","bl","oi","ab","sz","pf","gx","rr","zg","vr","wb","cc","mo","ai","uk","cc","ko","tj","zg","xn","bl","vy","ix","ai","zg","fn","po","xz","bl","rg","bt","uc","ix","sy","pf","cc","qu","tj","fb","bt","ko","ly","tj","ju","oi","al","at","xo","ai","vu","zg","ab","rh","ix","po","km","uv","iy","nd","tj","od","ce","km","fb","at","ot","ot","wh","sy","kf","nd","nd","ub","th","oi","sy","jl","fb","zy","ef","xo","po","as","xo","uk","ds","zg","xo","xm","nd","gs","rh","at","zy","nt","ab","po","to","ds","ai","fb","fb","si","po","al","nd","ub","th","yx","si","ka","nd","sa","po","cc","xn","si","si","vf","xo","qz","po","ce","po","rh","xo","sy","xh","nd","po","si","jb","rg","tk","zj","at","po","ly","rh","zg","po","fb","el","sz","qz","jj","oi","cc","ow","fb","to","xm","ab","ya","ly","po","po","ix","xh","ai","vf","ow","ub","ai","uc","po","ka","tj","ai","ab","bl","yf","po","rh","ka","zj","jb","zj","od","cm","ef","al","fb","ws","al","xh","kb","ya","vf","fb","wm","bl","tj","fb","po","yf","fl","al","to","at","xz","xh","yf","oi","tk","oi","ow","ab","ub","ju","nd","fb","ly","kb","zy","fb","el","ab","yx","ya","si","yx","xm","at","po","cc","ly","zj","nd","ws","gl","cc","pf","jl","al","ds","ds","tz","cg","zj","zj","ub","yf","od","xo","pf","kf","el","yf","rg","fl","ow","to","tk","ju","ow","ya","to","rg","po","cc","xo","at","ab","sz","ai","ce","xm","ce","xn","zg","vf","wm","al","fb","po","zg","tj","al","tj","mo","bt","kb","od","vs","oi","cc","ka","ws","rh","zg","ka","rg","sz","wh","sf","rh","si","gs","nd","cc","ow","yf","sy","ds","nd","at","zg","ub","qz","iy","wa","rh","sy","sz","zj","rr","ai","ai","ub","cc","al","ds","vu","si","vf","cm","xz","nd","tj","od","po","rh","ly","tj","ly","dd","ot","sb","ef","xo","oi","po","po","wa","xz","ai","to","yf","po","ka","vs","qz","to","ws","ka","ai","sf","yf","ou","tj","pf","sz","rh","zj","ju","ws","gs","ka","ka","vy","ix","xo","vf","cc","yf","uk","tj","at","zw","tk","ds","uk","ju","fb","uk","od","si","ju","rr","pf","to","to","zq","db","od","ef","yf","an","zy","si","at","yf","as","uc","ce","tj","cc","xo","jb","kf","wa","bl","yx","ds","sy","sz","ds","si","oi","od","zg","vf","zq","qz","yx","od","ya","uk","al","jb","ab","at","tj","at","po","xo","vg","kf","bl","qu","sy","ix","zq","uv","qu","po","fb","sz","ce","oi","sa","ce","si","tj","sy","zq","uk","ix","xo","cc","xo","yf","at","iy","ya","po","ce","at","nd","tj","nd","bl","ow","wa","zg","oi","qz","cc","to","sy","oi","to","vf","vf","ub","xo","vf","sa","cc","dd","ow","cm","ju","el","vu","ya","pf","tk","nd","vy","ai","vy","xo","wb","fb","si","dd","wb","xo","wa","xz","cc","oi","sa","tk","cc","xo","tj","oi","uk","od","ai","as","xm","ix","sz","oi","el","po","wm","tj","at","al","ly","zq","km","ce","cc","od","kb","nd","zj","ju","jb","od","uk","ot","zj","po","po","ds","at","oi","sy","ya","pf","rq","si","rr","si","tz","cm","rh","yx","si","si","yt","wa","vy","bt","wb","xo","ai","ix","bt","at","vg","ub","ub","ai","fb","nt","el","ai","cc","gd","rg","ui","km","zg","yx","cm","si","vu","xm","vy","vf","bl","sy","to","xm","oi","at","ce","rr","db","nd","ub","ju","iy","ly","fb","ub","rh","rg","xm","si","ow","dd","uk","po","el","ai","ui","cc","vs","uc","yx","yx","ka","ka","od","yf","gl","ub","wa","wa","mo","ly","ow","tj","po","vs","xo","si","vf","ju","xm","rg","tj","fb","gl","ow","cp","ot","to","od","kf","ya","ce","yx","cm","xo","bl","vr","rh","rg","sz","ds","fb","gs","ui","rh","ds","as","cc","ly","po","sy","po","uv","rg","ot","nd","ly","tz","cm","si","ui","rh","mo","ce","ix","th","xo","oi","rg","ju","sy","ju","ab","al","kf","ix","sf","ow","uv","nd","ix","zg","de","tj","iy","zq","km","kf","to","ai","po","vf","rr","sb","ix","gd","ub","sy","vy","fb","km","od","si","ai","po","vf","si","bl","ub","xz","sf","od","po","vy","xo","zy","vf","zw","ub"}));
//        System.out.println(new Solution().numSpecialEquivGroups(new String[]{"abc","acb","bac","bca","cab","cba"}));
//        System.out.println(new Solution().numSpecialEquivGroups(new String[]{"abcd","cdab","adcb","cbad"}));
//        System.out.println(new Solution().numSpecialEquivGroups(new String[]{"a","b","c","a","c","c"}));
//        System.out.println(new Solution().numSpecialEquivGroups(new String[]{"n","e","c","h","y","y","y","v","p","c","w","p","j","z","z","o","o","v","x","o","c","e","a","l","s","k","s","e","u","f","m","z","v","j","s","s","u","s","w","v","f","v","y","z","j","c","s","p","e","v","y","z","j","c","j","v","p","s","o","s","j","c","n","u","o","c","e","j","c","c","l","z","j","v","s","s","w","v","o","e","w","z","k","c","v","l","p","c","j","j","c","c","o","j","c","e","j","c","o","e","e","c","o","c","l","j","m","f","e","e","m","l","y","v","l","c","u","s","c","w","s","w","l","c","s","w","w","e","y","l","p","l","j","e","z","s","z","m","s","m","z","e","v","j","o","c","c","n","c","j","m","s","c","v","c","c","l","w","e","j","z","s","j","c","j","e","m","w","v","c","v","j","j","s","c","z","j","s","c","n","e","c","j","o","s","v","u","u","o","l","c","e","s","c","l","m","c","c","u","e","e","w","n","c","s","p","v","z","u","u","v","o","c","y","u","w","w","c","c","n","s","c","e","c","e","e","n","c","j","w","v","s","m","o","e","s","o","m","c","j","w","e","u","c","j","s","s","c","o","c","c","l","c","v","j","w","m","k","c","c","c","s","s","s","n","s","o","c","o","c","n","c","o","j","j","k","e","m","v","y","n","k","v","f","j","e","e","c","c","y","c","c","c","l","y","j","s","s","c","v","e","u","o","s","o","j","y","c","v","u","s","y","c","s","l","v","j","c","z","j","u","s","p","c","o","e","c","s","e","u","v","u","a","c","c","z","y","c","j","p","n","y","m","v","m","u","u","c","j","e","w","e","p","c","c","j","c","j","c","e","o","y","y","e","v","j","c","u","s","c","e","y","z","y","n","m","e","e","v","x","c","c","v","w","o","n","n","u","j","e","s","v","l","c","o","u","j","v","w","e","y","v","z","l","c","m","c","v","u","s","x","l","m","e","o","c","s","e","m","j","j","v","x","o","z","s","o","c","c","j","c","o","z","w","l","e","e","s","c","p","c","c","c","j","m","o","n","l","y","c","c","o","o","e","e","s","v","u","e","s","c","j","v","e","c","c","j","m","c","v","e","u","m","j","e","s","y","c","m","c","c","e","c","c","c","v","z","u","u","c","c","c","l","v","c","n","s","c","v","u","j","c","l","v","j","j","j","j","e","m","c","v","o","j","s","m","j","u","c","n","e","y","w","m","c","c","c","e","y","s","y","e","o","o","o","c","l","e","y","z","y","m","m","c","u","c","u","c","l","s","y","j","y","o","v","w","y","s","o","s","z","c","o","c","s","l","p","c","y","u","o","e","v","z","n","u","s","x","c","u","l","c","l","c","m","j","c","s","y","w","v","c","c","c","c","m","e","c","c","y","c","c","e","u","n","v","j","o","n","z","u","c","s","o","c","e","v","c","j","c","e","e","j","s","p","y","c","p","w","n","j","e","s","p","s","n","v","y","c","c","m","j","s","c","s","y","c","c","j","s","e","v","s","c","w","f","e","y","p","m","e","z","c","c","c","v","j","e","v","c","p","c","v","n","y","c","u","m","n","s","s","v","o","p","j","e","c","e","u","j","x","j","v","v","m","m","v","v","y","j","c","e","l","s","j","y","c","u","o","e","j","y","l","c","s","j","v","n","x","m","s","y","s","s","u","w","e","s","j","l","c","w","m","c","c","o","u","s","o","p","c","u","p","j","z","c","s","j","s","c","e","p","m","j","s","c","p","e","p","c","c","v","e","c","c","s","c","o","c","j","o","v","c","u","y","z","w","s","j","e","c","c","o","n","z","p","v","s","c","j","v","e","v","u","s","c","y","y","v","y","c","j","m","v","c","e","c","c","s","c","j","c","n","u","n","e","e","n","c","y","s","c","j","o","c","s","v","n","n","s","v","y","z","c","o","u","c","v","n","c","o","e","p","y","v","n","o","m","y","o","s","o","j","j","p","c","j","e","v","y","j","c","e","o","s","z","n","n","e","l","z","c","c","c","c","p","v","y","c","s","u","j","l","c","z","o","o","n","c","x","o","x","s","z","c","s","z","c","m","s","c","y","j","c","c","e","c","c","w","y","c","v","c","w","c","y","w","w","c","c","u","s","c","n","u","c","j","p","u","c","s","c","p","c","s","s","c","z","c","y","e","c","o","p","j","e","v","c","c","j","v","e","m","c","u","s","m","s","y","y","y","c","s","u","c","u","y","e","s","j","e","c","o","e","j","p","y","j","c","o","v","c","c","c","j","v","w","e","c","n","u","l","n","z","s","f","s","c","s","j"}));
    }
}
