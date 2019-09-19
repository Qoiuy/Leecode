package _462_Hamming_Distance;

public class Demo3 {
	
	public static void main(String[] args) {
		
		int x = 3, y = 23892378 ;
		//测试思路1
		int s = fun(x,y);
		System.out.println(s);
	}

	private static int fun(int x, int y) {
		//x y进行异或操作结果。
		String str = Integer.toBinaryString(x ^ y);
		int length = 0;
		for (int i = 0; i < str.length(); i++) {
			if( str.charAt(i) == '1'){
				length ++;
			}
		}
		return length;
	}
}
