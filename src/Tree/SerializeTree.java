package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class SerializeTree {
	public String serialize(TreeNode root) {
        // write your code here
        if(root == null){
            return " ";
        }
        StringBuilder sb = new StringBuilder();
        ser(root, sb);
        return sb.toString();
    }
    
    public void ser(TreeNode root, StringBuilder data){
        if(root == null){
            data.append("# ");
        }else{
            data.append(root.val + " ");
            ser(root.left, data);
            ser(root.right, data);
        }
    }
    
    /**
     * This method will be invoked second, the argument data is what exactly
     * you serialized at method "serialize", that means the data is not given by
     * system, it's given by your own serialize method. So the format of data is
     * designed by yourself, and deserialize it here as you serialize it in 
     * "serialize" method.
     */
    public static TreeNode deserialize(String data) {
        // write your code here
        if(data.equals(" ")){
            return null;
        }
        String[] path = data.split("\\s+");
        Queue<String> q = new LinkedList<String>();
        for(String str : path){
            q.offer(str);
        }
        return des(q);
    }
    
    public static TreeNode des(Queue<String> q){
        if(q.isEmpty()){
            return null;
        }else{
            String s = q.poll(); 
            if(s.equals("#")){
                return null;
            }else{
                TreeNode node = new TreeNode(Integer.parseInt(s));
                node.left = des(q);
                node.right = des(q);
                return node;
            }
        }
    }
    public static void main(String[] args) {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		n1.right = n2;
	}
}
