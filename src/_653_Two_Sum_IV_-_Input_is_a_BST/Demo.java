
public class Demo {
	//错误代码
    public boolean findTarget(TreeNode root, int k) {
		//将数据转成hashset
    	HashSet < Integer > set = new HashSet<Integer>();
		toHashSet(root, set);
		for (Integer value : set) {
        if(value * 2 == k){
            continue;
        }
        if(set.contains(k - value)){
       //排除vlaue相等情况
         return true;
        }
		}
		return false;
    
    }
   //转成hashset
	public void toHashSet(TreeNode root, set) {
	    if (root == null)
	        return ;
	    toHashSet(root.left, set);
	    set.add(root.val);
	    toHashSet(root.right, set);
	    return;
	}
}
