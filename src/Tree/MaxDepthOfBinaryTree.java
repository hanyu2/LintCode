package Tree;

import LinkedList.TreeNode;

public class MaxDepthOfBinaryTree {
	public int maxDepth(TreeNode root) {
        // write your code here
        if(root == null){
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
