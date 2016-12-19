package LinkedList;

public class NthToLastNodeInList {
	ListNode nthToLast(ListNode head, int n) {
		if (head == null) {
			return head;
		}
		// write your code here
		ListNode h = head;
		while (--n > 0) {
			h = h.next;
		}
		while (h.next != null) {
			head = head.next;
			h = h.next;
		}
		return head;
	}
}
