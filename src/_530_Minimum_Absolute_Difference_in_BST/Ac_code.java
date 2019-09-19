import java.util.TreeSet;

public class Ac_code {
	
	int tmp ;
	public int getMinimumDifference(TreeNode root) {
		TreeSet<Integer> sa = new TreeSet<Integer>();
		toHashSet(root, sa);
		System.out.println("set:" + sa.toString() + " tmp:" + tmp);
		if(sa.size() > 0){
			int res = 2147483647;
			for (Integer setvalue : sa) {
				System.out.println("set value:" + setvalue.intValue());
				if((Math.abs(setvalue.intValue() - tmp) < res) && (setvalue.intValue() != tmp)){
					res = Math.abs(setvalue.intValue() - tmp);
				}
				tmp =  setvalue.intValue();
			}
			System.out.println(res);
			return res;
		}else{
			return 0;
		}
		
    }
	
   //转成hashset
	public void toHashSet(TreeNode root, TreeSet <Integer> set) {
	    if (root == null)
	        return ;
	    toHashSet(root.left, set);
	    set.add(root.val);
	    tmp = root.val;
	    toHashSet(root.right, set);
	    return;
	}
}
