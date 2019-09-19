
public class Ac_code {
	
	int tilt = 0;
	public int findTilt(TreeNode root) {
		nodeSum(root);
		return tilt;
	}
	//返回当前节点 对应的所有节点的和
    public int nodeSum(TreeNode root) {
    	//
    	if(root == null){
    		return 0;
    	}
    	int left = nodeSum(root.left);
    	int right = nodeSum(root.right);
    	int sum = left + right + root.val;
    	//显示当前节点的值和 当前节点下左右节点的值的和
//    	System.out.println("root: " + root.val + " left:" + left + "right:" + right + " sum: "+sum );
    	tilt +=  Math.abs(right - left);
    	return sum;
    }
}
