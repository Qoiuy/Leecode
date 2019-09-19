package _000_Copy_This_Package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Solution.TreeNode;

public class Ac_code {
	//非递归
	public int maxDepth(TreeNode root) {
		//定义一个层数
		int sum = 0;
		
		if(root == null ){
			return 0;
		}
		//push root
		List<TreeNode> tmp = new ArrayList<TreeNode>(Arrays.asList(root));
		List<TreeNode> nodelist = new ArrayList<>();
		
		while(tmp.size() > 0){
			//处理一层的节点
			
			//对内容进行处理 扩张
			
			//定义一个节点数标志位
			for (TreeNode treeNode : tmp) {
				if(treeNode.left != null){
					nodelist.add(treeNode.left);
				}
				if(treeNode.right != null){
					nodelist.add(treeNode.right);
				}
			}
			//处理结果
			tmp.clear();
			tmp.addAll(nodelist);
			nodelist.clear();
			sum ++;
		}
		
		return sum;
    }
	
	//递归
	public int maxDepth(TreeNode root) {
        
        if (root == null) {
        return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return left > right ? (left + 1) : (right + 1);
        }
}
