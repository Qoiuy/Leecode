import Solution.TreeNode;

public class Ac_code {

	if(root == null){
		return null;
	}
	TreeNode tmp = null;
	tmp = root.left;
	root.left = invertTree(root.right);
	root.right = invertTree(tmp);
	
	return root;
}
