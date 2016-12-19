package LinkedList;

public class RemoveDupliatesFromSortedList {
	public static ListNode deleteDuplicates(ListNode head) { 
        // write your code here
        if(head == null || head.next == null){
            return head;
        }
        ListNode pre = head;
        ListNode p = head.next;
        while(p != null){
            if(pre.val == p.val){
                p = p.next;
            }else{
                pre.next = p;
                pre = pre.next;
                p = p.next;
            }
        }
        pre.next = null;
        return head;
    }
}
