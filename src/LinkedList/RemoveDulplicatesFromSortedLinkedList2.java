package LinkedList;

public class RemoveDulplicatesFromSortedLinkedList2 {
	public static ListNode deleteDuplicates(ListNode head) {
        // write your code here
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        head = dummy;
        ListNode fast = head.next.next;
        while(fast != null){
            while(fast != null && head.next.val == fast.val){
                fast = fast.next;
            }
            if(head.next.next != fast){
                head.next = fast;
            }else{
                head = head.next;
            }
            fast = head.next;
        }
        return dummy.next;
    }
}
