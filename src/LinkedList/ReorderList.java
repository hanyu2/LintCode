package LinkedList;

public class ReorderList {
	public void reorderList(ListNode head) {  
        // write your code here
        if(head == null || head.next == null){
            return;
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode pre = slow;
        while(fast != null && fast.next != null){
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode latter = new ListNode(-1);
        if(fast == null){
            latter.next = pre.next;
            pre.next = null;
        }else{
            latter.next = slow.next;
            slow.next = null;
        }
        ListNode h = latter.next;
        latter.next = null;
        while(h != null){
            ListNode next = h.next;
            h.next = latter.next;
            latter.next = h;
            h = next;
        }
        h = latter.next;
        while(head != null && h != null){
            ListNode n = h.next;
            ListNode m = head.next;
            head.next = h;
            h.next = m;
            h = n;
            head = m;
        }
    }
}
