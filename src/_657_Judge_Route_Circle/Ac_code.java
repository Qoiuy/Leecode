package _657_Judge_Route_Circle;

public class Ac_code {

	public static void main(String[] args) {
		String str1 = "UDLR";
		boolean result = fun(str1);
		System.out.println(result);
	}

	private static boolean fun(String moves) {
		if (moves.length() % 2 == 1)
			return false;
		int l = 0, r = 0, u = 0, d = 0;
		for (int i = 0; i < moves.length(); i++) {
			if(moves.charAt(i) == 'L'){
				l++;
			}else if(moves.charAt(i) == 'R'){
				r++;
			}else if(moves.charAt(i) == 'U'){
				u++;
			}else if(moves.charAt(i) == 'D'){
				d++;
			}
		}
		if(l != r){
			return false;
		}else if(u != d){
			return false;
		}else {
			return true;
		}
		
	}

}
