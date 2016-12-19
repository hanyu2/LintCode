package Tree;

import LinkedList.TreeNode;

public class BalancedBianryTree {
	public boolean isBalanced(TreeNode root) {
		// write your code here
		if (root == null) {
			return true;
		}
		if (findBalance(root) != -1) {
			return true;
		} else {
			return false;
		}
	}

	public int findBalance(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int leftDepth = findBalance(root.left);
		int rightDepth = findBalance(root.right);
		if (leftDepth == -1 || rightDepth == -1) {
			return -1;
		}
		if (Math.abs(leftDepth - rightDepth) > 1) {
			return -1;
		}
		return Math.max(leftDepth, rightDepth) + 1;
	}
}
