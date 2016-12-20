package Tree;

public class RemoveNodeInABST {
	public TreeNode removeNode(TreeNode root, int value) {
        // write your code here
        if(root == null){
            return root;
        }
        if(root.val == value){
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }else{
                TreeNode node = root.right;
                TreeNode l = leftMost(node);
                l.left = root.left;
                return node;
            }
        }else{
            TreeNode parent = findParent(root, value);
            if(parent == null){
                return root;
            }else{
                if(value < parent.val){
                    TreeNode l = parent.left;
                    if(l.right == null){
                        parent.left = l.left;
                    }else if(l.left == null){
                        parent.left = l.right;
                    }else{
                        TreeNode n = l.right;
                        TreeNode lm = leftMost(n);
                        lm.left = l.left;
                        parent.left = l.right;
                    }
                }else{
                    TreeNode r = parent.right;
                    if(r.left == null){
                        parent.right = r.right;
                    }else if(r.right == null){
                        parent.right = r.left;
                    }else{
                        TreeNode n = r.right;
                        TreeNode lm = leftMost(n);
                        lm.left = r.left;
                        parent.right = r.right;
                    }
                }
            }
        }
        return root;
    }
    public TreeNode leftMost(TreeNode root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    
    public TreeNode findParent(TreeNode root, int value){
        if(value < root.val){
            if(root.left == null){
                return null;
            }else{
                if(root.left.val == value){
                    return root;
                }else{
                    return findParent(root.left, value);
                }
            }
        }else{
            if(root.right == null){
                return null;
            }else{
                if(root.right.val == value){
                    return root;
                }else{
                    return findParent(root.right, value);
                }
            }
        }
    }
}
