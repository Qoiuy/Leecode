import java.util.LinkedList;
import java.util.List;

public class Ac_code {


	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(5);
		t1.left = t2;
		t1.right = t3;
		t3.left = t4;
		t4.right = t5;
		Solution s = new Solution();
		List<List<Integer>> res = s.levelOrderBottom(t1);
		System.out.println(res.toString());
	}
	
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		LinkedList<List<Integer>> list = new LinkedList<List<Integer>>();
		if (root == null){
			return list;
		}
		List<TreeNode> tmp = new LinkedList<TreeNode>();
		tmp.add(root);
		while (tmp != null && tmp.size() > 0){
			List<Integer> tmplist = new LinkedList<Integer>();
			List<TreeNode> childtmp = new LinkedList<TreeNode>();
			//取val
			for (TreeNode treeNode : tmp) {
				if(treeNode != null ){
					tmplist.add(treeNode.val);
					childtmp.add(treeNode.left);
					childtmp.add(treeNode.right);
				}
			}
			tmp.clear();
			if(tmplist.size() != 0){
				tmp.addAll(childtmp);
				list.addFirst(tmplist);
			}
		}
		return list;
	}
	
	
	
	
	public List<List<Integer>> levelOrderBottom1(TreeNode root) {
		List<Integer> rootval = new LinkedList<Integer>();
		if(root == null){
			return new LinkedList<List<Integer>>();
		}
		rootval.add(root.val);
		List<List<Integer>> levellist = noRootLevelOrderBottom(root);
		if(levellist == null){
			levellist = new LinkedList<List<Integer>>();
		}
		levellist.add(rootval);
		return levellist;
	}
	
	public List<List<Integer>> noRootLevelOrderBottom(TreeNode root) {
		if (root == null){
			return null;
		}
		List<List<Integer>> levellist = new LinkedList<List<Integer>>();
		//处理每层level
		List<Integer> levelvalue = new LinkedList<Integer>();
		if(root.left != null){
			//处理叶子的值
			levelvalue.add(root.left.val);
			//处理叶子下面的值
			List<List<Integer>> tmp = noRootLevelOrderBottom(root.left);
			if(tmp != null)
			levellist.addAll(tmp);
		}
		if(root.right != null){
			//处理叶子的值
			levelvalue.add(root.right.val);
			//处理叶子下面的值
			List<List<Integer>> tmp = noRootLevelOrderBottom(root.right);
			if(tmp != null)
			levellist.addAll(tmp);
		}
		if(levelvalue.size() == 0){
			return null;
		}
		levellist.add(levelvalue);
        return levellist;
    }


}
