package LinkedList;

public class ConvertSortedListToBST {
	public TreeNode sortedListToBST(ListNode head) {
		// write your code here
		if (head == null) {
			return null;
		}
		if (head.next == null) {
			TreeNode treeNode = new TreeNode(head.val);
			return treeNode;
		}
		ListNode slow = head;
		ListNode fast = head.next.next;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		TreeNode root = new TreeNode(slow.next.val);
		ListNode temp = slow.next.next;
		slow.next = null;
		root.left = sortedListToBST(head);
		root.right = sortedListToBST(temp);
		return root;
	}
}
