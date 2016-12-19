package LinkedList;

public class ReverseLinkedList {
	public ListNode reverse(ListNode head) {
        // write your code here
        if(head == null || head.next == null){
            return head;
        }
        ListNode next = head.next;
        ListNode tail = reverse(next);
        next.next = head;
        head.next = null;
        return tail;
    }
}
