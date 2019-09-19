package _657_Judge_Route_Circle;

public class Demo {
	public static void main(String[] args) {
		String str1 = "UDLR";
		boolean result = fun(str1);
		System.out.println(result);
	}

	private static boolean fun(String moves) {
        int[] map = new int[26];
        for (char c : moves.toCharArray()){
            map[c - 'A'] ++;
        }
        if (map['L' - 'A'] == map['R' - 'A'] && map['U' - 'A'] == map['D' - 'A']) return true;
        return false;
        }
}
