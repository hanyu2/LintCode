package LinkedList;

public class RemoveNthNodeFromEndOfList {
	ListNode removeNthFromEnd(ListNode head, int n) {
        // write your code here
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        head = dummy;
        while(n > 0){
            head = head.next;
            n--;
        }
        while(head.next != null){
            head = head.next;
            pre = pre.next;
        }
        pre.next = pre.next.next;
        return dummy.next;
    }
}
