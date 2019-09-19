
public class Ac_code {

	int sum = 0;

	
	public TreeNode convertBST(TreeNode root) {
		if(root == null)
        return null;
		convertBST(root.right);
		sum = sum + root.val;
		root.val = sum;
		System.out.println(root.val);
		convertBST(root.left);
		return root;
    }
	
}
