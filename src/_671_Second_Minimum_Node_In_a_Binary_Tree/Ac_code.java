
public class Ac_code {


	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(2);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(5);
		TreeNode t4 = new TreeNode(5);
		TreeNode t5 = new TreeNode(7);
		t1.left = t2;
		t1.right = t3;
		t3.left = t4;
		t4.right = t5;
		Solution s = new Solution();
		System.out.println(s.findSecondMinimumValue(t1));
	}
	
	int min = 2147483647;
	int secondMin = 2147483647;
	public int findSecondMinimumValue(TreeNode root) {
		findSecondMinimumValuetmp( root);
		if( secondMin == 2147483647){
			return -1;
		}
        return secondMin;
    }
	public void findSecondMinimumValuetmp(TreeNode root) {
		if(root == null){
			return ;
		}
		//判断 如果当前值大于min且小于decondMin 设置second
		if(root.val < min){
			min = root.val;
		}
		if(root.val > min && root.val < secondMin){
			secondMin =root.val;
		}
		findSecondMinimumValue(root.left);
		findSecondMinimumValue(root.right);
        return ;
    }
	


}
