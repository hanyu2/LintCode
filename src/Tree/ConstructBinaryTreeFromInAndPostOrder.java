package Tree;

public class ConstructBinaryTreeFromInAndPostOrder {
	public TreeNode buildTree(int[] inorder, int[] postorder) {
        // write your code here
        if(inorder == null || inorder.length == 0){
            return null;
        }
        return build(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }
    
    public TreeNode build(int[] in, int is, int ie, int[] post, int ps, int pe){
        if(is > ie || ps > pe){
            return null;
        }
        TreeNode root = new TreeNode(post[pe]);
        int index = 0;
        for(;index <= ie; index++){
            if(in[index] == post[pe]){
                break;
            }
        }
        root.left = build(in, is, index - 1, post, ps, ps + index - is - 1);
        root.right = build(in, index + 1, ie, post, ps + index - is, pe - 1);
        return root;
    }
}
