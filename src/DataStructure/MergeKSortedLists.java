package DataStructure;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

import LinkedList.ListNode;

public class MergeKSortedLists {
	public ListNode mergeKLists(List<ListNode> lists) {  
        // write your code here
        if(lists == null || lists.size() == 0){
            return null;
        }
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(lists.size(), new Comparator<ListNode>(){
            public int compare(ListNode n1, ListNode n2){
                return n1.val - n2.val;
            }
        });
        for(ListNode n : lists){
            if(n != null){
                pq.offer(n);
            }
        }
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        while(!pq.isEmpty()){
            ListNode n = pq.poll();
            head.next = n;
            head = head.next;
            if(n.next != null){
                pq.offer(n.next);
            }
        }
        return dummy.next;
    }
}
