/**
 * 作者原文地址
 * http://blog.csdn.net/alley_zhang/article/details/5723616
 * @author Administrator
 *
 */
public class BTNode {
	private char key;
	private BTNode left, right;

	public BTNode(char key) {
		this(key, null, null);
	}

	public BTNode(char key, BTNode left, BTNode right) {
		this.key = key;
		this.left = left;
		this.right = right;
	}

	public char getKey() {
		return key;
	}

	public void setKey(char key) {
		this.key = key;
	}

	public BTNode getLeft() {
		return left;
	}

	public void setLeft(BTNode left) {
		this.left = left;
	}

	public BTNode getRight() {
		return right;
	}

	public void setRight(BTNode right) {
		this.right = right;
	}
}