package _108_Convert_Sorted_Array_to_Binary_Search_Tree;

public class Ac_code {

//		public static void main(String[] args) {
//			TreeNode a1 = new TreeNode(1);
//			TreeNode a2 = new TreeNode(2);
//			TreeNode a3 = new TreeNode(3);
//			TreeNode a4 = new TreeNode(4);
//			TreeNode a5 = new TreeNode(5);
//			TreeNode a6 = new TreeNode(6);
//			TreeNode a7 = new TreeNode(7);
//			TreeNode a8 = new TreeNode(8);
//			TreeNode a9 = new TreeNode(9);
//			a1.left = a2;
//			a2.left = a3;
//			a2.right = a4;
//			a3.left = a5;
//			a3.right = a6;
//			a4.left = a7;
//			a4.right = a8;
//			a6.left = a9;
//			a6.right = a9;
//
//			Solution s = new Solution();
//
//			int[] nums = {  };
//
//			TreeNode t = s.sortedArrayToBST(nums);
//			s.showTree(t);
//			System.out.println("---------");
//		}
//
//		public void showTree(TreeNode root){
//			if (root == null){
//				return ;
//			}
//			showTree(root.left);
//			System.err.println(root.val);
//			showTree(root.right);
//		}
//
//		public TreeNode sortedArrayToBST(int[] nums) {
//			if ( nums.length == 0){
//				return null;
//			}
//			return sortedArrayToBST(nums, 0, nums.length - 1);
//		}
//
//		public TreeNode sortedArrayToBST(int[] nums, int start, int end) {
//			//System.out.println("start: " + nums[start] + " end: " + nums[end] );
//			//end start相等设置当前值，并返回
//			if( end == start){
//				TreeNode root = new TreeNode(nums[start]);
//				return root;
//			}
//			//end == start+1代表省2个值。
//			if(end == start + 1){
//				TreeNode root = new TreeNode(nums[start]);
//				root.right = sortedArrayToBST(nums, end, end);
//				return root;
//			}
//
//			//正常情况求中间值
//			int rootLocal = (end + start) / 2;
//			TreeNode root = new TreeNode(nums[rootLocal]);
//
//			root.left = sortedArrayToBST(nums, start, rootLocal - 1 < start ? start : (rootLocal - 1));
//			root.right = sortedArrayToBST(nums, rootLocal + 1 > nums.length ? nums.length : (rootLocal + 1), end);
//			return root;
//		}
//

}
