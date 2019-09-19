package _462_Hamming_Distance;

public class Demo1 {
	
	public static void main(String[] args) {
		
		int x = 3, y = 23892378 ;
		//测试思路1
		int s = fun(x,y);
		System.out.println(s);
	}

	private static int fun(int x, int y) {
		// 将x,y 转成str eg. 3 ->11
		String str1 = String.valueOf(Integer.toBinaryString(x));
		String str2 = String.valueOf(Integer.toBinaryString(y));
//		System.out.println("str1: " + str1 + " , str2: " + str2);	

		// 对短的str进行填充。计算汉明距离
		if(str1.length() > str2.length()){
			int addStrLength = str1.length() - str2.length();
			for (int i = 0; i <addStrLength; i++) {
				str2 = "0" + str2;
			}
		}else {
			int addStrLength = str2.length() - str1.length();
			for (int i = 0; i <addStrLength; i++) {
				str1 = "0" + str1;
			}
		}
//		System.out.println("str1: " + str1 + " , str2: " + str2);
		
		int length = 0;
		for (int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i) != str2.charAt(i) ){
				length ++;
			}
		}
//		System.out.println(length);
		return length;
	}
}
