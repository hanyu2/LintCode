package LinkedList;

public class ReverseLinkedList2 {
	public ListNode reverseBetween(ListNode head, int m , int n) {
        // write your code
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(-1);
        int count = 0;
        dummy.next = head;
        head = dummy;
        while(count < m - 1){
            head = head.next;
            count++;
        }
        ListNode tail = head.next;
        head.next = null;
        ListNode h = tail;
        ListNode next = null;
        while(count < n){
            next = h.next;
            h.next = head.next;
            head.next = h;
            h = next;
            count++;
        }
        tail.next = next;
        return dummy.next;
    }
}
