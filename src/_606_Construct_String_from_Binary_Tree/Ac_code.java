
public class Ac_code {

	if(t == null){
		return "";
	}
	String s = "";
	s = s + t.val;
	if(t.left != null){
		s = s + "("+ tree2str(t.left) +")";
	}
	if(t.left == null && t.right != null){
		s = s + "()";
	}
	if(t.right != null){
		s = s + "(" + tree2str(t.right) +")";
	}
	
	return s;

}
