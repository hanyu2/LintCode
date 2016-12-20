package Tree;

import java.util.ArrayList;
import java.util.Stack;

public class BinaryTreeZigZagTraversal {
	public static ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        // write your code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(root == null){
            return res;
        }
        Stack<TreeNode> firstStack = new Stack<TreeNode>();
        Stack<TreeNode> secondStack = new Stack<TreeNode>();
        firstStack.push(root);
        int depth = 0;
        while(!firstStack.isEmpty() || !secondStack.isEmpty()){
            if(depth % 2 == 0){
                ArrayList<Integer> list = new ArrayList<Integer>();
                while(!firstStack.isEmpty()){
                    TreeNode node = firstStack.pop();
                    list.add(node.val);
                    if(node.left != null){
                        secondStack.push(node.left);
                    }
                    if(node.right != null){
                        secondStack.push(node.right);
                    }
                }
                res.add(list);
            }else{
                ArrayList<Integer> list = new ArrayList<Integer>();
                while(!firstStack.isEmpty()){
                    TreeNode node = firstStack.pop();
                    list.add(node.val);
                    if(node.right != null){
                        secondStack.push(node.right);
                    }
                    if(node.left != null){
                        secondStack.push(node.left);
                    }
                }
                res.add(list);
            }
            firstStack.addAll(secondStack);
            secondStack.clear();
            depth++;
        }
        return res;
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
		System.out.println(zigzagLevelOrder(n1));
	}
}
