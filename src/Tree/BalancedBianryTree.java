package Tree;

import LinkedList.TreeNode;

public class BalancedBianryTree {
	public static boolean isBalanced(TreeNode root) {
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

	public static int findBalance(TreeNode root) {
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
	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		isBalanced(n1);
	}
}
