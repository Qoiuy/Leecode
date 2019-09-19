package _462_Hamming_Distance;

public class Demo2 {
	
	public static void main(String[] args) {
		
		int x = 3, y = 23892378 ;
		//测试思路1
		int s = fun(x,y);
		System.out.println(s);
	}

	private static int fun(int x, int y) {
		//x y进行异或操作结果。
		int res = x ^ y;
		//对结果进行处理
		 int count = 0;
		for (; res > 0; count++) {
			res &= (res - 1);
		}
//		System.out.println(count);
		return count;
	}
}
