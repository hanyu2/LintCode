package Tree;

import java.util.ArrayList;

public class BinaryTreeLevelOrderTraversal {
	public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        // write your code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(root == null){
            return res;
        }
        traverseTree(root, 0, res);
        return res;
    }
    public void traverseTree(TreeNode root, int depth, ArrayList<ArrayList<Integer>> res){
        if(root == null){
            return;
        }
        ArrayList<Integer> list = null;
        if(depth >= res.size()){
            list = new ArrayList<Integer>();
            res.add(list);
        }
        list = res.get(depth);
        list.add(root.val);
        traverseTree(root.left, depth + 1, res);
        traverseTree(root.right, depth + 1, res);
    }
}
