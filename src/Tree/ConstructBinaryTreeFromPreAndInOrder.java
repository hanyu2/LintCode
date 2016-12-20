package Tree;

public class ConstructBinaryTreeFromPreAndInOrder {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
        // write your code here
        if(preorder == null || preorder.length == 0){
            return null;
        }
        return build(preorder, 0, preorder.length, inorder, 0, inorder.length - 1);
    }

    public TreeNode build(int[] pre, int ps, int pe, int[] in, int is, int ie){
        if(ps > pe || is > ie){
            return null;
        }
        int i = is;
        for(; i <= ie; i++){
            if(in[i] == pre[ps]){
                break;
            }
        }
        TreeNode root = new TreeNode(pre[ps]);
        root.left = build(pre, ps + 1, ps + i - is, in, is, i - 1);
        root.right = build(pre, ps + i - is + 1, pe, in, i + 1, ie);
        return root;
    }
}
