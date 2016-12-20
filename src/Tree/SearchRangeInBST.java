package Tree;

import java.util.ArrayList;

public class SearchRangeInBST {
	public ArrayList<Integer> searchRange(TreeNode root, int k1, int k2) {
        // write your code here
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(root == null){
            return res;
        }
        traverse(root, k1, k2, res);
        return res;
    }
    public void traverse(TreeNode root, int k1, int k2, ArrayList<Integer> res){
        if(root == null){
            return;
        }
        if(root.val > k1){
            traverse(root.left, k1, k2, res);
        }
        if(root.val >= k1 && root.val <= k2){
            res.add(root.val);
        }
        if(root.val < k2){
            traverse(root.right, k1, k2, res);
        }
    }
}
