package Tree;

public class InsertANodeInABST {
	public TreeNode insertNode(TreeNode root, TreeNode node) {
		// write your code here
		if (root == null) {
			return node;
		}
		insert(root, node);
		return root;
	}

	public void insert(TreeNode root, TreeNode node) {
		if (node.val < root.val) {
			if (root.left == null) {
				root.left = node;
				return;
			} else {
				insert(root.left, node);
			}
		} else {
			if (root.right == null) {
				root.right = node;
				return;
			} else {
				insert(root.right, node);
			}
		}
	}
}
