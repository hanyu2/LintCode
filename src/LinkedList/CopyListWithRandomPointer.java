package LinkedList;

public class CopyListWithRandomPointer {
	public RandomListNode copyRandomList(RandomListNode head) {
        // write your code here
        if(head == null){
            return head;
        }
        RandomListNode dummy = new RandomListNode(-1);
        dummy.next = head;
        while(head != null){
            RandomListNode next = head.next;
            RandomListNode n = new RandomListNode(head.label);
            head.next = n;
            n.next = next;
            head = next;
        }
        head = dummy.next;
        while(head != null){
            if(head.random != null){
                head.next.random = head.random.next;
            }
            head = head.next.next;
        }
        head = dummy.next;
        RandomListNode temp = new RandomListNode(-1);
        RandomListNode p = temp;
        while(head != null){
            RandomListNode next = head.next.next;
            p.next = head.next;
            if(next != null){
                head.next.next = next.next;
            }
            p = p.next;
            head = next;
        }
        return temp.next;
    }
}
